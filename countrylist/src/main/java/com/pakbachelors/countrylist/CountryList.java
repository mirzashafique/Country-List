package com.pakbachelors.countrylist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.pakbachelors.countrylist.activity.CountryListActivity;

public abstract class CountryList {
    public static final String SELECTED_COUNTRY = "selected_country";
    public static int ACTIVITY_REQUEST_CODE = 1211;
    public static Activity activity;

    public static void showList(Activity mactivity) {
        activity = mactivity;
        activity.startActivityForResult(getIntent(activity), ACTIVITY_REQUEST_CODE);
    }

    private static Intent getIntent(Context context) {
        Intent intent = new Intent(context, CountryListActivity.class);
        return intent;
    }


}
