package com.improve10x.swiggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggyItem4Activity extends AppCompatActivity {
    SwiggyItem4[] swiggyItems4;
    RecyclerView swiggy4ItemsRv;
    Swiggy4ItemsAdapter swiggy4ItemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_item4);
        initViews();
        createDummyData();
        setupAdapter();
        connectAdapter();
    }

    private void initViews() {
        swiggy4ItemsRv = findViewById(R.id.swiggy_four_items_rv);
    }

    private void createDummyData() {
        swiggyItems4 = new SwiggyItem4[11];

        swiggyItems4[0] = new SwiggyItem4();
        swiggyItems4[0].soupName = "Broccoli parmesan Chicken soup";
        swiggyItems4[0].soupAmount = "160";
        swiggyItems4[0].soupAdd = " + ";
        swiggyItems4[0].soupDescription = "A vibrant soup that will be a delight for the whole family";
        swiggyItems4[0].soupStatus = "";

        swiggyItems4[1] = new SwiggyItem4();
        swiggyItems4[1].soupName ="Chicken and Vegetable soup";
        swiggyItems4[1].soupAmount = "110";
        swiggyItems4[1].soupDescription = "A vibrant soup that will be a delight for the whole family";
        swiggyItems4[1].soupStatus = "UNAVAILABLE";

        swiggyItems4[2] = new SwiggyItem4();
        swiggyItems4[2].soupName = "Cream of Chicken soup";
        swiggyItems4[2].soupAmount = "160";
        swiggyItems4[2].soupAdd = " + ";
        swiggyItems4[2].soupDescription = "A vibrant soup that will be a delight for the whole family";

        swiggyItems4[3] = new SwiggyItem4();
        swiggyItems4[3].soupName = "Broccoli parmesan Chicken soup";
        swiggyItems4[3].soupAmount = "160";
        swiggyItems4[3].soupAdd = " + ";
        swiggyItems4[3].soupDescription = "A vibrant soup that will be a delight for the whole family";

        swiggyItems4[4] = new SwiggyItem4();
        swiggyItems4[4].soupName = "Cream of Chicken soup";
        swiggyItems4[4].soupAmount = "160";
        swiggyItems4[4].soupAdd = " + ";
        swiggyItems4[4].soupDescription = "A vibrant soup that will be a delight for the whole family";

        swiggyItems4[5] = new SwiggyItem4();
        swiggyItems4[5].soupName = "Broccoli parmesan Chicken soup";
        swiggyItems4[5].soupAmount = "160";
        swiggyItems4[5].soupAdd = " + ";
        swiggyItems4[5].soupDescription = "A vibrant soup that will be a delight for the whole family";

        swiggyItems4[6] = new SwiggyItem4();
        swiggyItems4[6].soupName = "Cream of Chicken soup";
        swiggyItems4[6].soupAmount = "160";
        swiggyItems4[6].soupAdd = " + ";
        swiggyItems4[6].soupDescription = "A vibrant soup that will be a delight for the whole family";

        swiggyItems4[7] = new SwiggyItem4();
        swiggyItems4[7].soupName = "Broccoli parmesan Chicken soup";
        swiggyItems4[7].soupAmount = "160";
        swiggyItems4[7].soupAdd = " + ";
        swiggyItems4[7].soupDescription = "A vibrant soup that will be a delight for the whole family";

        swiggyItems4[8] = new SwiggyItem4();
        swiggyItems4[8].soupName = "Cream of Chicken soup";
        swiggyItems4[8].soupAmount = "160";
        swiggyItems4[8].soupAdd = " + ";
        swiggyItems4[8].soupDescription = "A vibrant soup that will be a delight for the whole family";

        swiggyItems4[9] = new SwiggyItem4();
        swiggyItems4[9].soupName = "Broccoli parmesan Chicken soup";
        swiggyItems4[9].soupAmount = "160";
        swiggyItems4[9].soupAdd = " + ";
        swiggyItems4[9].soupDescription = "A vibrant soup that will be a delight for the whole family";

        swiggyItems4[10] = new SwiggyItem4();
        swiggyItems4[10].soupName = "Cream of Chicken soup";
        swiggyItems4[10].soupAmount = "160";
        swiggyItems4[10].soupAdd = " + ";
        swiggyItems4[10].soupDescription = "A vibrant soup that will be a delight for the whole family";
    }

    public void setupAdapter(){
        swiggy4ItemsAdapter = new Swiggy4ItemsAdapter(swiggyItems4);
    }

    public void connectAdapter(){
        swiggy4ItemsRv.setLayoutManager(new LinearLayoutManager(this));
        swiggy4ItemsRv.setAdapter(swiggy4ItemsAdapter);
    }
}