package com.improve10x.swiggy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyOrdersAdapter extends RecyclerView.Adapter<SwiggyOrdersViewHolder> {
    SwiggyOrderItems[] items;
    public SwiggyOrdersAdapter(SwiggyOrderItems[] swiggyOrderItems){
        items = swiggyOrderItems;
    }
    @NonNull
    @Override
    public SwiggyOrdersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy_order_items,parent,false);
        SwiggyOrdersViewHolder viewHolder = new SwiggyOrdersViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggyOrdersViewHolder holder, int position) {
        SwiggyOrderItems item = items[position];
        holder.swiggyOrederItemTxt.setText(item.swiggyOrderItem);
        holder.swiggyOrderDescriptionTxt.setText(item.orderDescription);
        holder.swiggyOrderTimeTxt.setText(item.orderTime);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
