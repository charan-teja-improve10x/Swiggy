package com.improve10x.swiggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggyItems2Activity extends AppCompatActivity {
    SwiggyItems2[] swiggyItems2;
    RecyclerView swiggyItems2Rv;
    Swiggy2ItemsAdapter swiggy2ItemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_items2);
        initViews();
        createDummyData();
        setupAdapter();
        connectAdapter();
    }

    private void initViews() {
        swiggyItems2Rv = findViewById(R.id.swiggy2_ietems_rv);
    }

    private void createDummyData() {

        swiggyItems2 = new SwiggyItems2[8];

        swiggyItems2[0] = new SwiggyItems2();
        swiggyItems2[0].swiggyItem2 = "Shawarma Roll";
        swiggyItems2[0].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[0].swiggyAmount2 = "80";

        swiggyItems2[1] = new SwiggyItems2();
        swiggyItems2[1].swiggyItem2 = "Shawarma plate";
        swiggyItems2[1].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[1].swiggyAmount2 = "130";

        swiggyItems2[2] = new SwiggyItems2();
        swiggyItems2[2].swiggyItem2 = "Shawarma Roll";
        swiggyItems2[2].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[2].swiggyAmount2 = "100";

        swiggyItems2[3] = new SwiggyItems2();
        swiggyItems2[3].swiggyItem2 = "Shawarma plate";
        swiggyItems2[3].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[3].swiggyAmount2 = "140";

        swiggyItems2[4] = new SwiggyItems2();
        swiggyItems2[4].swiggyItem2 = "Shawarma Roll";
        swiggyItems2[4].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[4].swiggyAmount2 = "180";

        swiggyItems2[5] = new SwiggyItems2();
        swiggyItems2[5].swiggyItem2 = "Shawarma plate";
        swiggyItems2[5].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[5].swiggyAmount2 = "80";

        swiggyItems2[6] = new SwiggyItems2();
        swiggyItems2[6].swiggyItem2 = "Shawarma Roll";
        swiggyItems2[6].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[6].swiggyAmount2 = "80";

        swiggyItems2[7] = new SwiggyItems2();
        swiggyItems2[7].swiggyItem2 = "Shawarma plate";
        swiggyItems2[7].swiggyDescription2 = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyItems2[7].swiggyAmount2 = "80";
    }

    public void setupAdapter(){
        swiggy2ItemsAdapter = new Swiggy2ItemsAdapter(swiggyItems2);
    }

    public void connectAdapter(){
        swiggyItems2Rv.setLayoutManager(new LinearLayoutManager(this));
        swiggyItems2Rv.setAdapter(swiggy2ItemsAdapter);
    }
}