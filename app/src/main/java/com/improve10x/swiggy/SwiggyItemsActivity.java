package com.improve10x.swiggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SwiggyItemsActivity extends AppCompatActivity {
    SwiggyItems[] swiggyItems;
    SwiggyItemAdapter swiggyItemAdapter;
    RecyclerView swiggyRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_items);
        initViews();
        createDummyData();
        createAdapter();
        connectAdapter();
        setupAdapterClickListener();
    }

    private void setupAdapterClickListener() {
        swiggyItemAdapter.onSwiggyItemcickListener = new OnSwiggyItemcickListener() {
            @Override
            public void onSwiggyItemClick(SwiggyItems item) {
                Toast.makeText(SwiggyItemsActivity.this, item.itemName, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SwiggyItemsActivity.this,SwiggyItems2Activity.class);
                startActivity(intent);
            }
        };
    }

    private void initViews() {
        swiggyRv = findViewById(R.id.swiggy_rv);
    }

    private void createDummyData() {
        swiggyItems = new SwiggyItems[8];

        swiggyItems[0] = new SwiggyItems();
        swiggyItems[0].itemName = "Aassife Biryani";
        swiggyItems[0].description = "Biryani Thandoori & Chines";
        swiggyItems[0].swiggyItemUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyItems[0].itemRating = "4.5";
        swiggyItems[0].deliveryTime = "30mins";
        swiggyItems[0].itemDiscount = "-40%";

        swiggyItems[1] = new SwiggyItems();
        swiggyItems[1].itemName = "Akshaya Pure Veg";
        swiggyItems[1].description = "Biryani Thandoori & Chines";
        swiggyItems[1].swiggyItemUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyItems[1].itemRating = "4.0";
        swiggyItems[1].deliveryTime = "30mins";
        swiggyItems[1].itemType = "Veg";

        swiggyItems[2] = new SwiggyItems();
        swiggyItems[2].itemName = "Al Ajwain";
        swiggyItems[2].description = "Chinese, Thandoori & Indian";
        swiggyItems[2].swiggyItemUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyItems[2].itemRating = "4.7";
        swiggyItems[2].deliveryTime = "30mins";

        swiggyItems[3] = new SwiggyItems();
        swiggyItems[3].itemName = "Anjappar";
        swiggyItems[3].description = "Biryani Thandoori & Chines";
        swiggyItems[3].swiggyItemUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyItems[3].itemRating = "3.2";
        swiggyItems[3].deliveryTime = "45mins";

        swiggyItems[4] = new SwiggyItems();
        swiggyItems[4].itemName = "Cakes & Berrys";
        swiggyItems[4].description = "Cakes, Sweets & Snacks";
        swiggyItems[4].swiggyItemUrl = "https://th.bing.com/th/id/OIP.QqAxreQTve19jNFWSFHQxAAAAA?pid=ImgDet&w=150&h=150&rs=1";
        swiggyItems[4].itemRating = "4.5";
        swiggyItems[4].deliveryTime = "45mins";
        swiggyItems[4].itemDiscount = "-25%";

        swiggyItems[5] = new SwiggyItems();
        swiggyItems[5].itemName = "Copper Kitchen";
        swiggyItems[5].description = "Chettinadu, Chines, Thandoori &";
        swiggyItems[5].swiggyItemUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyItems[5].itemRating = "3.3";
        swiggyItems[5].deliveryTime = "45mins";
        swiggyItems[5].itemDiscount = "-10%";

        swiggyItems[6] = new SwiggyItems();
        swiggyItems[6].itemName = "SS Pandian";
        swiggyItems[6].description = "Chettinadu, Chines, Thandoori &";
        swiggyItems[6].swiggyItemUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyItems[6].itemRating = "4.2";
        swiggyItems[6].deliveryTime = "30mins";
        swiggyItems[6].itemDiscount = "-33%";

        swiggyItems[7] = new SwiggyItems();
        swiggyItems[7].itemName = "Copper Kitchen";
        swiggyItems[7].description = "Chettinadu, Chines, Thandoori &";
        swiggyItems[7].swiggyItemUrl = "https://th.bing.com/th/id/OIP.53_oZq2JZZgWeV9-nM68RQAAAA?pid=ImgDet&w=168&h=168&rs=1";
        swiggyItems[7].itemRating = "3.3";
        swiggyItems[7].deliveryTime = "45mins";
        swiggyItems[7].itemDiscount = "-10%";
    }

    public void createAdapter(){
        swiggyItemAdapter = new SwiggyItemAdapter(swiggyItems);
    }

    public void connectAdapter(){
        swiggyRv.setLayoutManager(new LinearLayoutManager(this));
        swiggyRv.setAdapter(swiggyItemAdapter);
    }
}