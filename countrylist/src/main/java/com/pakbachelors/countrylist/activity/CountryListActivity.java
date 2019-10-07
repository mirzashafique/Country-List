package com.pakbachelors.countrylist.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pakbachelors.countrylist.R;
import com.pakbachelors.countrylist.SingletonList;
import com.pakbachelors.countrylist.adapter.CountryListRecyclerViewAdapter;
import com.pakbachelors.countrylist.model.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CountryListActivity extends AppCompatActivity {

    //Veriables dec
    private List<Country> data;
    private CountryListRecyclerViewAdapter adapter;
    private FrameLayout backButton;

    //Views init
    private RecyclerView recyclerView;
    private ImageView backImage;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStatusBarGradiant(this);
        setContentView(R.layout.activity_country_list);

        //Veriable inti
        data = new ArrayList<>();
        data.addAll(SingletonList.getmInstence().getAll());
        adapter = new CountryListRecyclerViewAdapter(this, data);

        //Views init
        backImage = findViewById(R.id.back_im);
        view = findViewById(R.id.view);
        backButton = findViewById(R.id.back_btn);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
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
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static void setStatusBarGradiant(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = activity.getWindow();
            Drawable background = activity.getResources().getDrawable(R.drawable.app_gradient);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(activity.getResources().getColor(android.R.color.transparent));
            //  window.setNavigationBarColor(activity.getResources().getColor(android.R.color.transparent));
            window.setBackgroundDrawable(background);
        }
    }

    public static boolean isRTL(Locale locale) {
        final int directionality = Character.getDirectionality(locale.getDisplayName().charAt(0));
        return directionality == Character.DIRECTIONALITY_RIGHT_TO_LEFT ||
                directionality == Character.DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC;
    }
}
