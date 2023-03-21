package com.improve10x.swiggy;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyGridViewHolder extends RecyclerView.ViewHolder {
    ImageView swiggyItemIv;
    TextView swiggyItemNameTxt;
    TextView swiggyItemDiscountTxt;
    TextView swiggyItemDescriptionTxt;
    TextView swiggyItemTypeTxt;
    TextView swiggyRatingTXt;
    TextView swiggyItemDeleveryTimeTxt;
    public SwiggyGridViewHolder(@NonNull View itemView) {
        super(itemView);
        swiggyItemIv = itemView.findViewById(R.id.swiggy_grid_iv);
        swiggyItemNameTxt = itemView.findViewById(R.id.swiggy_item_name_txt);
        swiggyItemDiscountTxt = itemView.findViewById(R.id.swiggy_item_discount_txt);
        swiggyItemDescriptionTxt = itemView.findViewById(R.id.swiggy_item_description_txt);
        swiggyItemTypeTxt = itemView.findViewById(R.id.swiggy_item_type_txt);
        swiggyRatingTXt = itemView.findViewById(R.id.swiggy_rating_txt);
        swiggyItemDeleveryTimeTxt = itemView.findViewById(R.id.swiggy_delivery_time_txt);
    }
}
