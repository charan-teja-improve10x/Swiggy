package com.improve10x.swiggy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class SwiggyGridAdapter extends RecyclerView.Adapter<SwiggyGridViewHolder> {
    SwiggyGridItems[] items;

    public SwiggyGridAdapter(SwiggyGridItems[] swiggyGridItems){
        items = swiggyGridItems;
    }

    @NonNull
    @Override
    public SwiggyGridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiigy_grid_item,parent,false);
        SwiggyGridViewHolder viewHolder = new SwiggyGridViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggyGridViewHolder holder, int position) {
        SwiggyGridItems item = items[position];
        holder.swiggyItemNameTxt.setText(item.swiggyItemName);
        holder.swiggyItemDescriptionTxt.setText(item.swiggyDescription);
        holder.swiggyItemTypeTxt.setText(item.swiggyItemType);
        holder.swiggyRatingTXt.setText(item.swiggyRating);
        holder.swiggyItemDiscountTxt.setText(item.swiggyItemDiscount);
        holder.swiggyItemDeleveryTimeTxt.setText(item.swiggyItemDeliveryTime);
        Picasso.get().load(item.itemUrl).into(holder.swiggyItemIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
