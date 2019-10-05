package com.pakbachelors.countrylibrary3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pakbachelors.countrylist.CountryList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountryList.showList(this);
    }
}
