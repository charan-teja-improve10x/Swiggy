package com.improve10x.swiggy;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyItem2ViewHolder extends RecyclerView.ViewHolder {
    TextView swiggyItem2Txt;
    TextView swiggyDescription2Txt;
    TextView swiggy2AmountTxt;
    public SwiggyItem2ViewHolder(@NonNull View itemView) {
        super(itemView);
        swiggyItem2Txt = itemView.findViewById(R.id.swiggy_ietm2_txt);
        swiggyDescription2Txt = itemView.findViewById(R.id.swiggy2_description_txt);
        swiggy2AmountTxt = itemView.findViewById(R.id.swiggy2_amount);
    }
}
