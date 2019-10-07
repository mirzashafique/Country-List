package com.pakbachelors.countrylibrary3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.pakbachelors.countrylist.CountryList;
import com.pakbachelors.countrylist.model.Country;

public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountryList.showList(MainActivity.this);
                // CountryList.showList(MainActivity.this,"ar");

            }
        });


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


}
