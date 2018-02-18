package com.tugas.leidy.leidykurniahatika_1202154343_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOrder(View view) {
        if (((RadioButton)findViewById(R.id.DineIn)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            Toast.makeText(this,"Anda memilih Dine In",Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }else if (((RadioButton)findViewById(R.id.TakeAway)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            Toast.makeText(this,"Anda memilih Take Away",Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }else{
            Toast.makeText(this,"Pilih Dine In atau Take Away",Toast.LENGTH_SHORT).show();
        }
    }
}
