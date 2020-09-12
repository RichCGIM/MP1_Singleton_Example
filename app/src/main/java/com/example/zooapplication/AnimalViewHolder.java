package com.example.zooapplication;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    public TextView tvType, tvName, tvSex, tvAge;

    public AnimalViewHolder(View itemView) {
        super(itemView);
        tvType = itemView.findViewById(R.id.typeView);
        tvName = itemView.findViewById(R.id.name);
        tvSex = itemView.findViewById(R.id.sexView);
        tvAge = itemView.findViewById(R.id.ageView);
    }

}
