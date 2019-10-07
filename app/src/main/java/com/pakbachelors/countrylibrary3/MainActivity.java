package com.pakbachelors.countrylibrary3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.pakbachelors.countrylist.CountryList;
import com.pakbachelors.countrylist.model.Country;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView backImage;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backImage = findViewById(R.id.back_im);
        view = findViewById(R.id.view);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountryList.showList(MainActivity.this);
            }
        });

        Locale locale = new Locale("ar");
        Locale.setDefault(locale);
        if (isRTL(Locale.getDefault())) {
            backImage.setImageResource(R.drawable.ic_right_arrow);
            view.setBackgroundResource(R.drawable.ic_shape_right);
        } else {
            backImage.setImageResource(R.drawable.ic_back_arrow);
            view.setBackgroundResource(R.drawable.ic_shape_blue);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CountryList.ACTIVITY_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                Country country = (Country) data.getSerializableExtra(CountryList.SELECTED_COUNTRY);
                Toast.makeText(getApplicationContext(), country.getCountryName(), Toast.LENGTH_LONG).show();
            }
        }
    }

    public static boolean isRTL(Locale locale) {
        final int directionality = Character.getDirectionality(locale.getDisplayName().charAt(0));
        return directionality == Character.DIRECTIONALITY_RIGHT_TO_LEFT ||
                directionality == Character.DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC;
    }
}
