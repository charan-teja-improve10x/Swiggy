package com.improve10x.swiggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SWiggyGridItemActivity extends AppCompatActivity {
    SwiggyGridItems[] swiggyGridItems;
    RecyclerView swiggyGridRv;
    SwiggyGridAdapter swiggyGridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_grid_item);
        initViews();
        createDummyData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        swiggyGridRv = findViewById(R.id.swiggy_grid_rv);
    }

    private void createDummyData() {
        swiggyGridItems = new SwiggyGridItems[9];

        swiggyGridItems[0] = new SwiggyGridItems();
        swiggyGridItems[0].swiggyItemName = "Aassife Biryani";
        swiggyGridItems[0].swiggyDescription = "Biryani Thandoori & Chines";
        swiggyGridItems[0].itemUrl = "https://i.pinimg.com/236x/15/e7/c2/15e7c2ae902d020f22a75227cb30efa1.jpg?nii=t";
        swiggyGridItems[0].swiggyRating = "4.5";
        swiggyGridItems[0].swiggyItemDeliveryTime = "30mins";
        swiggyGridItems[0].swiggyItemDiscount = "-40%";

        swiggyGridItems[1] = new SwiggyGridItems();
        swiggyGridItems[1].swiggyItemName = "Akshaya Pure";
        swiggyGridItems[1].swiggyDescription = "Biryani Thandoori & Chines";
        swiggyGridItems[1].itemUrl = "https://th.bing.com/th/id/R.b3bf6dd22812347467caa3abde3bdbdc?rik=3MIm%2bv2%2f6vCpsw&riu=http%3a%2f%2fs3-media2.ak.yelpcdn.com%2fbphoto%2fNtpuVERyoje6MBTLNBr2mQ%2fls.jpg&ehk=UULQkOSdAUs3Taxn7Y0aoGKb3LFQhO0Pg1EkAoCliDE%3d&risl=&pid=ImgRaw&r=0";
        swiggyGridItems[1].swiggyRating = "4.0";
        swiggyGridItems[1].swiggyItemDeliveryTime = "30mins";
        swiggyGridItems[1].swiggyItemType = "Veg";

        swiggyGridItems[2] = new SwiggyGridItems();
        swiggyGridItems[2].swiggyItemName = "Al Ajwain";
        swiggyGridItems[2].swiggyDescription = "Chinese, Thandoori & Indian";
        swiggyGridItems[2].itemUrl = "https://s3-media4.fl.yelpcdn.com/bphoto/GGNZH1ZeKNG3UbovyK3tiw/ls.jpg";
        swiggyGridItems[2].swiggyRating = "4.7";
        swiggyGridItems[2].swiggyItemDeliveryTime = "30mins";

        swiggyGridItems[3] = new SwiggyGridItems();
        swiggyGridItems[3].swiggyItemName = "Anjappar";
        swiggyGridItems[3].swiggyDescription = "Biryani Thandoori & Chines";
        swiggyGridItems[3].itemUrl = "https://s3-media0.fl.yelpcdn.com/bphoto/f8oiQXCXOc6h5E9TaI6Y-Q/258s.jpg";
        swiggyGridItems[3].swiggyRating = "3.2";
        swiggyGridItems[3].swiggyItemDeliveryTime = "45mins";

        swiggyGridItems[4] = new SwiggyGridItems();
        swiggyGridItems[4].swiggyItemName = "Cakes & Berrys";
        swiggyGridItems[4].swiggyDescription = "Cakes, Sweets & Snacks";
        swiggyGridItems[4].itemUrl = "https://i.pinimg.com/236x/45/64/ab/4564abb1f916c9da2a3a732b4aa9f998.jpg?nii=t";
        swiggyGridItems[4].swiggyRating = "4.5";
        swiggyGridItems[4].swiggyItemDeliveryTime = "45mins";
        swiggyGridItems[4].swiggyItemDiscount = "-25%";

        swiggyGridItems[5] = new SwiggyGridItems();
        swiggyGridItems[5].swiggyItemName = "Copper Kitchen";
        swiggyGridItems[5].swiggyDescription = "Chettinadu, Chines, Thandoori";
        swiggyGridItems[5].itemUrl = "https://s3-media4.fl.yelpcdn.com/bphoto/GGNZH1ZeKNG3UbovyK3tiw/ls.jpg";
        swiggyGridItems[5].swiggyRating = "3.3";
        swiggyGridItems[5].swiggyItemDeliveryTime = "45mins";
        swiggyGridItems[5].swiggyItemDiscount = "-10%";

        swiggyGridItems[6] = new SwiggyGridItems();
        swiggyGridItems[6].swiggyItemName = "SS Pandian";
        swiggyGridItems[6].swiggyDescription = "Biryani Thandoori & Chines";
        swiggyGridItems[6].itemUrl = "https://i.pinimg.com/236x/15/e7/c2/15e7c2ae902d020f22a75227cb30efa1.jpg?nii=t";
        swiggyGridItems[6].swiggyRating = "4.2";
        swiggyGridItems[6].swiggyItemDeliveryTime = "30mins";
        swiggyGridItems[6].swiggyItemDiscount = "-33%";

        swiggyGridItems[7] = new SwiggyGridItems();
        swiggyGridItems[7].swiggyItemName = "Copper Kitchen";
        swiggyGridItems[7].swiggyDescription = "Biryani Thandoori & Chines";
        swiggyGridItems[7].itemUrl = "https://s3-media0.fl.yelpcdn.com/bphoto/f8oiQXCXOc6h5E9TaI6Y-Q/258s.jpg";
        swiggyGridItems[7].swiggyRating = "3.3";
        swiggyGridItems[7].swiggyItemDeliveryTime = "45mins";
        swiggyGridItems[7].swiggyItemDiscount = "-10%";

        swiggyGridItems[8] = new SwiggyGridItems();
        swiggyGridItems[8].swiggyItemName = "Copper Kitchen";
        swiggyGridItems[8].swiggyDescription = "Biryani Thandoori & Chines";
        swiggyGridItems[8].itemUrl = "https://s3-media0.fl.yelpcdn.com/bphoto/f8oiQXCXOc6h5E9TaI6Y-Q/258s.jpg";
        swiggyGridItems[8].swiggyRating = "3.3";
        swiggyGridItems[8].swiggyItemDeliveryTime = "45mins";
        swiggyGridItems[8].swiggyItemDiscount = "-10%";
    }

    public void createAdapter(){
        swiggyGridAdapter = new SwiggyGridAdapter(swiggyGridItems);
    }

    public void connectAdapter(){
        swiggyGridRv.setLayoutManager(new GridLayoutManager(this,3));
        swiggyGridRv.setAdapter(swiggyGridAdapter);
    }
}