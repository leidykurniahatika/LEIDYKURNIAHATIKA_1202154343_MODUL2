package com.tugas.leidy.leidykurniahatika_1202154343_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    TextView view_food, view_price;
    ImageView view_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent();
        String food = intent.getStringExtra("food");
        Integer price = intent.getIntExtra("price", 0);
        Integer photo = intent.getIntExtra("photo", 0);

        Log.d("getIntExtra", "" + price + photo);

        view_food = (TextView) findViewById(R.id.view_detailFood);
        view_price = (TextView) findViewById(R.id.view_detailPrice);
        view_photo = (ImageView) findViewById(R.id.view_detailPhoto);

        view_food.setText(food);
        view_price.setText("Rp. " + price);
        view_photo.setImageResource(photo);
    }
}
