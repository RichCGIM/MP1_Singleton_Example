package com.example.zooapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private LayoutInflater mInflater;
    private List<Animal> mData;

    public AnimalAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = AnimalRepository.getInstance().getAnimals();

    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.animal_vh, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        // get the animals
        List<Animal> animals = AnimalRepository.getInstance().getAnimals();

        // set attributes to the item
        holder.tvType.setText(animals.get(position).type);
        holder.tvName.setText(animals.get(position).name);
        holder.tvSex.setText(animals.get(position).sex);
        holder.tvAge.setText(String.valueOf(animals.get(position).age));
    }

    @Override
    public int getItemCount() {
        return AnimalRepository.getInstance().getAnimals().size();
    }

    public void update() {
        mData.clear();
        mData.addAll(AnimalRepository.getInstance().getAnimals());
        notifyDataSetChanged();
    }
}
