package com.improve10x.swiggy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class SwiggyItemAdapter extends RecyclerView.Adapter<SwiggyItemsViewHolder> {
    SwiggyItems[] items;

    public SwiggyItemAdapter(SwiggyItems[] swiggyItems){
        items = swiggyItems;
    }

    @NonNull
    @Override
    public SwiggyItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy_item,parent,false);
        SwiggyItemsViewHolder viewHolder = new SwiggyItemsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggyItemsViewHolder holder, int position) {
        SwiggyItems item = items[position];
        holder.itemNameTxt.setText(item.itemName);
        holder.descriptionTxt.setText(item.description);
        holder.discountTxt.setText(item.itemDiscount);
        holder.ratingTxt.setText(item.itemRating);
        holder.timeTxt.setText(item.deliveryTime);
        Picasso.get().load(item.swiggyItemUrl).into(holder.foodIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
