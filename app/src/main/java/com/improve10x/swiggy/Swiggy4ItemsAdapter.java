package com.improve10x.swiggy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Swiggy4ItemsAdapter extends RecyclerView.Adapter<Swiggy4ItemViewHolder> {
    SwiggyItem4[] items;

    public Swiggy4ItemsAdapter(SwiggyItem4[] swiggyItems4){
        items = swiggyItems4;
    }
    @NonNull
    @Override
    public Swiggy4ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy_4_items,parent,false);
        Swiggy4ItemViewHolder viewHolder = new Swiggy4ItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Swiggy4ItemViewHolder holder, int position) {
        SwiggyItem4 item = items[position];
        holder.soupNameTxt.setText(item.soupName);
        holder.soupDescriptionTxt.setText(item.soupDescription);
        holder.soupStatusTxt.setText(item.soupStatus);
        holder.soupAddTxt.setText(item.soupAdd);
        holder.soupAmountTxt.setText(item.soupAmount);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
