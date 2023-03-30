package com.improve10x.swiggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

public class SwiggyOrdersActivity extends AppCompatActivity {
    SwiggyOrderItems[] swiggyOrderItems;
    RecyclerView currentOrdersRv;
    RecyclerView readyToOrderRv;
    SwiggyOrdersAdapter currentOrdersAdapter;
    SwiggyOrdersAdapter readyToOrdersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_orders);
        initViews();
        createDummyData();
        setupAdaptter();
        connectAdapter();

    }

    private void setupAdaptter() {
        currentOrdersAdapter = new SwiggyOrdersAdapter(swiggyOrderItems);
        readyToOrdersAdapter = new SwiggyOrdersAdapter(swiggyOrderItems);
    }

    public void connectAdapter(){
        currentOrdersRv.setAdapter(currentOrdersAdapter);
        readyToOrderRv.setAdapter(readyToOrdersAdapter);
        currentOrdersRv.setLayoutManager(new LinearLayoutManager(this));
        readyToOrderRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
    }

    private void initViews() {
        currentOrdersRv = findViewById(R.id.current_orders_rv);
        readyToOrderRv = findViewById(R.id.ready_to_orders_rv);
    }

    private void createDummyData() {
        swiggyOrderItems = new SwiggyOrderItems[6];

        swiggyOrderItems[0] = new SwiggyOrderItems();
        swiggyOrderItems[0].swiggyOrderItem = "Shawarma Roll";
        swiggyOrderItems[0].orderDescription = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyOrderItems[0].orderTime = "25 mins";

        swiggyOrderItems[1] = new SwiggyOrderItems();
        swiggyOrderItems[1].swiggyOrderItem = "Thandori Chicken";
        swiggyOrderItems[1].orderDescription = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyOrderItems[1].orderTime = "37 mins";

        swiggyOrderItems[2] = new SwiggyOrderItems();
        swiggyOrderItems[2].swiggyOrderItem = "Shawarma Roll";
        swiggyOrderItems[2].orderDescription = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyOrderItems[2].orderTime = "25 mins";

        swiggyOrderItems[3] = new SwiggyOrderItems();
        swiggyOrderItems[3].swiggyOrderItem = "Thandori Chicken";
        swiggyOrderItems[3].orderDescription = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyOrderItems[3].orderTime = "37 mins";

        swiggyOrderItems[4] = new SwiggyOrderItems();
        swiggyOrderItems[4].swiggyOrderItem = "Shawarma Roll";
        swiggyOrderItems[4].orderDescription = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyOrderItems[4].orderTime = "25 mins";

        swiggyOrderItems[5] = new SwiggyOrderItems();
        swiggyOrderItems[5].swiggyOrderItem = "Thandori Chicken";
        swiggyOrderItems[5].orderDescription = "Shawarma Roll vibrant soup that will be a delight for the whole family";
        swiggyOrderItems[5].orderTime = "37 mins";
    }
}