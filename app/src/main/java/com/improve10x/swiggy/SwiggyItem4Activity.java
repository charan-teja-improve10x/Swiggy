package com.improve10x.swiggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggyItem4Activity extends AppCompatActivity {
    SwiggyItems2[] swiggyItems2;
    RecyclerView swiggy4ItemsRv;
    Swiggy2ItemsAdapter swiggy4Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_item4);
        initViews();
        createDummyData();
        setupAdapter();
        connectAdapter();
        setupAdapterClickActionListener();
    }

    private void setupAdapterClickActionListener() {
        swiggy4Adapter.onSwiggyItem2ClickLAction = new OnSwiggyItem2ClickAction() {
            @Override
            public void onSwiggyItem2AddBtn(SwiggyItems2 item) {
                item.swiggyItemCount ++;
                swiggy4Adapter.notifyDataSetChanged();
            }

            @Override
            public void onSwiggyItem2RemoveBtn(SwiggyItems2 item) {
                item.swiggyItemCount --;
                swiggy4Adapter.notifyDataSetChanged();
            }
        };
    }

    private void initViews() {
        swiggy4ItemsRv = findViewById(R.id.swiggy_four_items_rv);
    }

    private void createDummyData() {
        swiggyItems2 = new SwiggyItems2[11];

        swiggyItems2[0] = new SwiggyItems2();
        swiggyItems2[0].swiggyItem2 = "Shawarma Roll";
        swiggyItems2[0].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[0].swiggyAmount2 = "80";
        swiggyItems2[0].swiggyItemCount = 0;

        swiggyItems2[1] = new SwiggyItems2();
        swiggyItems2[1].swiggyItem2 = "Shawarma plate";
        swiggyItems2[1].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[1].swiggyAmount2 = "130";
        swiggyItems2[1].swiggyItemCount = 0;

        swiggyItems2[2] = new SwiggyItems2();
        swiggyItems2[2].swiggyItem2 = "Shawarma Roll";
        swiggyItems2[2].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[2].swiggyAmount2 = "100";
        swiggyItems2[2].swiggyItemCount = 0;

        swiggyItems2[3] = new SwiggyItems2();
        swiggyItems2[3].swiggyItem2 = "Shawarma plate";
        swiggyItems2[3].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[3].swiggyAmount2 = "140";
        swiggyItems2[3].swiggyItemCount = 0;

        swiggyItems2[4] = new SwiggyItems2();
        swiggyItems2[4].swiggyItem2 = "Shawarma Roll";
        swiggyItems2[4].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[4].swiggyAmount2 = "180";
        swiggyItems2[4].swiggyItemCount = 0;

        swiggyItems2[5] = new SwiggyItems2();
        swiggyItems2[5].swiggyItem2 = "Shawarma plate";
        swiggyItems2[5].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[5].swiggyAmount2 = "80";
        swiggyItems2[5].swiggyItemCount = 0;

        swiggyItems2[6] = new SwiggyItems2();
        swiggyItems2[6].swiggyItem2 = "Shawarma Roll";
        swiggyItems2[6].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[6].swiggyAmount2 = "80";
        swiggyItems2[6].swiggyItemCount = 0;

        swiggyItems2[7] = new SwiggyItems2();
        swiggyItems2[7].swiggyItem2 = "Shawarma plate";
        swiggyItems2[7].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[7].swiggyAmount2 = "80";
        swiggyItems2[7].swiggyItemCount = 0;
    }

    public void setupAdapter(){
        swiggy4Adapter = new Swiggy2ItemsAdapter(swiggyItems2);
    }

    public void connectAdapter(){
        swiggy4ItemsRv.setLayoutManager(new LinearLayoutManager(this));
        swiggy4ItemsRv.setAdapter(swiggy4Adapter);
    }
}