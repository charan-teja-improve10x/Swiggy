package com.improve10x.swiggy;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyItemsViewHolder extends RecyclerView.ViewHolder {
    TextView itemNameTxt;
    TextView descriptionTxt;
    TextView discountTxt;
    TextView ratingTxt;
    TextView timeTxt;
    ImageView foodIv;
    public SwiggyItemsViewHolder(@NonNull View itemView) {
        super(itemView);
        itemNameTxt = itemView.findViewById(R.id.item_name_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
        discountTxt = itemView.findViewById(R.id.discount_txt);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);
        foodIv = itemView.findViewById(R.id.food_item_iv);
    }
}
