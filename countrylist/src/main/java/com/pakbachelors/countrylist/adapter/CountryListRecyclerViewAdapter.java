package com.pakbachelors.countrylist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pakbachelors.countrylist.R;
import com.pakbachelors.countrylist.model.Country;

import java.util.List;

public class CountryListRecyclerViewAdapter extends RecyclerView.Adapter<CountryListRecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private List<Country> data;
    private LayoutInflater inflater;

    public CountryListRecyclerViewAdapter(Context context, List<Country> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_row_for_country_list_adpater, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Country current = data.get(position);
        holder.imageView.setImageResource(current.getCountryImageCode());
        holder.textView.setText(current.getCountryName());
        if (current.isCharW()) {
            String res = current.getCountryName().substring(1).toUpperCase();
            holder.titleLayout.setVisibility(View.VISIBLE);
            holder.titleTxt.setText(res);
        } else {
            holder.titleLayout.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    protected class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView, titleTxt;
        ImageView imageView;
        FrameLayout titleLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            titleTxt = itemView.findViewById(R.id.title_txt);
            imageView = itemView.findViewById(R.id.image_view);
            titleLayout = itemView.findViewById(R.id.title_layout);
        }
    }
}
