package com.tugas.leidy.leidykurniahatika_1202154343_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            foods.add("Chicken Box");
            foods.add("Rice Box");
            foods.add("Full Bbox");
            foods.add("Roller Box");
            foods.add("Signature Box");

            priceses.add(32000);
            priceses.add(14091);
            priceses.add(31818);
            priceses.add(31818);
            priceses.add(31818);

            photos.add(R.drawable.chicken_box);
            photos.add(R.drawable.rice_box);
            photos.add(R.drawable.full_box);
            photos.add(R.drawable.roller_box);
            photos.add(R.drawable.signature_box);
        }
    }
}
