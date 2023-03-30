package com.improve10x.swiggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BagActivity extends AppCompatActivity {
    SwiggyItems2[] swiggyItems2;
    Swiggy2ItemsAdapter bagAdapter;
    RecyclerView bagRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag);
        initViews();
        createDummyData();
        setupAdapter();
        connectAdapter();
        swiggyItemOnLickAction();
    }

    private void swiggyItemOnLickAction() {
        bagAdapter.onSwiggyItem2ClickLAction = new OnSwiggyItem2ClickAction() {
            @Override
            public void onSwiggyItem2AddBtn(SwiggyItems2 item) {
                item.swiggyItemCount ++;
                bagAdapter.notifyDataSetChanged();
            }

            @Override
            public void onSwiggyItem2RemoveBtn(SwiggyItems2 item) {
                item.swiggyItemCount --;
                bagAdapter.notifyDataSetChanged();
            }
        };
    }

    private void createDummyData() {
        swiggyItems2 = new SwiggyItems2[4];

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
    }

    private void initViews() {
        bagRv = findViewById(R.id.bag_rv);
    }

    public void setupAdapter(){
        bagAdapter = new Swiggy2ItemsAdapter(swiggyItems2);
    }

    public void connectAdapter(){
        bagRv.setLayoutManager(new LinearLayoutManager(this));
        bagRv.setAdapter(bagAdapter);
    }
}