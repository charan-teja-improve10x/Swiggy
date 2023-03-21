package com.improve10x.swiggy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SWiggyGridItemActivity extends AppCompatActivity {
    SwiggyGridItems[] swiggyGridItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_grid_item);
        createDummyData();
    }

    private void createDummyData() {
        swiggyGridItems = new SwiggyGridItems[8];

        swiggyGridItems[0] = new SwiggyGridItems();
        swiggyGridItems[0].swiggyItemName = "Aassife Biryani";
        swiggyGridItems[0].swiggyDescription = "Biryani Thandoori & Chines";
        swiggyGridItems[0].itemUrl = "";
        swiggyGridItems[0].swiggyRating = "4.5";
        swiggyGridItems[0].swiggyItemDeliveryTime = "30mins";
        swiggyGridItems[0].swiggyItemDiscount = "-40%";

        swiggyGridItems[1] = new SwiggyGridItems();
        swiggyGridItems[1].swiggyItemName = "Akshaya Pure Veg";
        swiggyGridItems[1].swiggyDescription = "Biryani Thandoori & Chines";
        swiggyGridItems[1].itemUrl = "";
        swiggyGridItems[1].swiggyRating = "4.0";
        swiggyGridItems[1].swiggyItemDeliveryTime = "30mins";
        swiggyGridItems[1].swiggyItemType = "Veg";

        swiggyGridItems[2] = new SwiggyGridItems();
        swiggyGridItems[2].swiggyItemName = "Al Ajwain";
        swiggyGridItems[2].swiggyDescription = "Chinese, Thandoori & Indian";
        swiggyGridItems[2].itemUrl = "";
        swiggyGridItems[2].swiggyRating = "4.7";
        swiggyGridItems[2].swiggyItemDeliveryTime = "30mins";

        swiggyGridItems[3] = new SwiggyGridItems();
        swiggyGridItems[3].swiggyItemName = "Anjappar";
        swiggyGridItems[3].swiggyDescription = "Biryani Thandoori & Chines";
        swiggyGridItems[3].itemUrl = "";
        swiggyGridItems[3].swiggyRating = "3.2";
        swiggyGridItems[3].swiggyItemDeliveryTime = "45mins";

        swiggyGridItems[4] = new SwiggyGridItems();
        swiggyGridItems[4].swiggyItemName = "Cakes & Berrys";
        swiggyGridItems[4].swiggyDescription = "Cakes, Sweets & Snacks";
        swiggyGridItems[4].itemUrl = "";
        swiggyGridItems[4].swiggyRating = "4.5";
        swiggyGridItems[4].swiggyItemDeliveryTime = "45mins";
        swiggyGridItems[4].swiggyItemDiscount = "-25%";

        swiggyGridItems[5] = new SwiggyGridItems();
        swiggyGridItems[5].swiggyItemName = "Copper Kitchen";
        swiggyGridItems[5].swiggyDescription = "Chettinadu, Chines, Thandoori &";
        swiggyGridItems[5].itemUrl = "";
        swiggyGridItems[5].swiggyRating = "3.3";
        swiggyGridItems[5].swiggyItemDeliveryTime = "45mins";
        swiggyGridItems[5].swiggyItemDiscount = "-10%";

        swiggyGridItems[6] = new SwiggyGridItems();
        swiggyGridItems[6].swiggyItemName = "SS Pandian";
        swiggyGridItems[6].swiggyDescription = "Chettinadu, Chines, Thandoori &";
        swiggyGridItems[6].itemUrl = "";
        swiggyGridItems[6].swiggyRating = "4.2";
        swiggyGridItems[6].swiggyItemDeliveryTime = "30mins";
        swiggyGridItems[6].swiggyItemDiscount = "-33%";

        swiggyGridItems[7] = new SwiggyGridItems();
        swiggyGridItems[7].swiggyItemName = "Copper Kitchen";
        swiggyGridItems[7].swiggyDescription = "Chettinadu, Chines, Thandoori &";
        swiggyGridItems[7].itemUrl = "";
        swiggyGridItems[7].swiggyRating = "3.3";
        swiggyGridItems[7].swiggyItemDeliveryTime = "45mins";
        swiggyGridItems[7].swiggyItemDiscount = "-10%";
    }

}