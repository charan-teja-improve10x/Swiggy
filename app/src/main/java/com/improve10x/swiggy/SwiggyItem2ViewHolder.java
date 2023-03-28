package com.improve10x.swiggy;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyItem2ViewHolder extends RecyclerView.ViewHolder {
    TextView swiggyItem2Txt;
    TextView swiggyDescription2Txt;
    TextView swiggy2AmountTxt;
    TextView swiggyItem2CountTxt;
    ImageButton addBtn;
    ImageButton removeBtn;
    public SwiggyItem2ViewHolder(@NonNull View itemView) {
        super(itemView);
        swiggyItem2Txt = itemView.findViewById(R.id.swiggy_ietm2_txt);
        swiggyDescription2Txt = itemView.findViewById(R.id.swiggy2_description_txt);
        swiggy2AmountTxt = itemView.findViewById(R.id.swiggy2_amount);
        swiggyItem2CountTxt = itemView.findViewById(R.id.swigg_item_2_count_txt);
        addBtn = itemView.findViewById(R.id.add_btn);
        removeBtn = itemView.findViewById(R.id.remove_btn);
    }
}
