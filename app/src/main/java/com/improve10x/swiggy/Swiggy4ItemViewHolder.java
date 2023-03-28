package com.improve10x.swiggy;

import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Swiggy4ItemViewHolder extends RecyclerView.ViewHolder {
    TextView soupNameTxt;
    TextView soupDescriptionTxt;
    TextView soupAmountTxt;
    TextView soupAddTxt;
    TextView soupStatusTxt;

    public Swiggy4ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        soupNameTxt = itemView.findViewById(R.id.soup_name_txt);
        soupDescriptionTxt = itemView.findViewById(R.id.soup_description_txt);
        soupAmountTxt = itemView.findViewById(R.id.soup_amount_txt);
        soupAddTxt = itemView.findViewById(R.id.soup_add_txt);
        soupStatusTxt = itemView.findViewById(R.id.soup_status_txt);
    }
}
