package com.improve10x.swiggy;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyOrdersViewHolder extends RecyclerView.ViewHolder {
    TextView swiggyOrederItemTxt;
    TextView swiggyOrderDescriptionTxt;
    TextView swiggyOrderTimeTxt;
    Button trackBtn;
    Button cancleOrderBtn;
    Button reviewOrderBtn;
    Button discardBtn;
    public SwiggyOrdersViewHolder(@NonNull View itemView) {
        super(itemView);
        swiggyOrederItemTxt = itemView.findViewById(R.id.swiggy_order_item_txt);
        swiggyOrderTimeTxt = itemView.findViewById(R.id.swiggy_order_time_txt);
        swiggyOrderDescriptionTxt = itemView.findViewById(R.id.swiggy_order_description_txt);
        trackBtn = itemView.findViewById(R.id.tract_btn);
        cancleOrderBtn = itemView.findViewById(R.id.cancel_order_btn);
        reviewOrderBtn = itemView.findViewById(R.id.review_order_btn);
        discardBtn = itemView.findViewById(R.id.discard_btn);
    }
}
