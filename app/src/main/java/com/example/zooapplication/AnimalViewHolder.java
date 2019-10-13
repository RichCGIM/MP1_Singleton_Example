package com.example.zooapplication;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    public TextView tvType, tvName, tvSex, tvAge;

    public AnimalViewHolder(View itemView) {
        super(itemView);
        tvType = itemView.findViewById(R.id.tvType);
        tvName = itemView.findViewById(R.id.tvName);
        tvSex = itemView.findViewById(R.id.tvSex);
        tvAge = itemView.findViewById(R.id.tvAge);
    }

}
