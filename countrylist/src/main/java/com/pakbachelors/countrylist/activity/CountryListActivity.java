package com.pakbachelors.countrylist.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pakbachelors.countrylist.R;
import com.pakbachelors.countrylist.SingletonList;
import com.pakbachelors.countrylist.adapter.CountryListRecyclerViewAdapter;
import com.pakbachelors.countrylist.model.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryListActivity extends AppCompatActivity {

    //Veriables dec
    private List<Country> data;
    private CountryListRecyclerViewAdapter adapter;

    //Views init
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        //Veriable inti
        data = new ArrayList<>();
        data.addAll(SingletonList.getmInstence().getAll());
        adapter = new CountryListRecyclerViewAdapter(getApplicationContext(), data);

        //Views init
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);
    }
}
