package com.improve10x.swiggy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Swiggy2ItemsAdapter extends RecyclerView.Adapter<SwiggyItem2ViewHolder> {
    SwiggyItems2[] items;

    public Swiggy2ItemsAdapter(SwiggyItems2[] swiggyItems2){
        items = swiggyItems2;
    }

    @NonNull
    @Override
    public SwiggyItem2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy_items_2,parent,false);
        SwiggyItem2ViewHolder viewHolder = new SwiggyItem2ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggyItem2ViewHolder holder, int position) {
        SwiggyItems2 item = items[position];
        holder.swiggyItem2Txt.setText(item.swiggyItem2);
        holder.swiggyDescription2Txt.setText(item.swiggyDescription2);
        holder.swiggy2AmountTxt.setText(item.swiggyAmount2);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
