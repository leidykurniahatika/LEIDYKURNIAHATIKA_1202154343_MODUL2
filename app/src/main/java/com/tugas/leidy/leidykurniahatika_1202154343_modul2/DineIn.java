package com.tugas.leidy.leidykurniahatika_1202154343_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        spinner = findViewById(R.id.table_number);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tables_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    public void onClickOrder(View view) {
        String a = spinner.getSelectedItem().toString();

        if (a.equalsIgnoreCase("Meja 1")) {
            Toast.makeText(this, "Anda telah memilih Meja 1", Toast.LENGTH_SHORT).show();

        } else if (a.equalsIgnoreCase("Meja 2")) {
            Toast.makeText(this, "Anda telah memilih Meja 2", Toast.LENGTH_SHORT).show();

        } else if (a.equalsIgnoreCase("Meja 3")) {
            Toast.makeText(this, "Anda telah memilih Meja 3", Toast.LENGTH_SHORT).show();

        } else if (a.equalsIgnoreCase("Meja 4")) {
            Toast.makeText(this, "Anda telah memilih Meja 4", Toast.LENGTH_SHORT).show();

        } else if (a.equalsIgnoreCase("Meja 5")) {
            Toast.makeText(this, "Anda telah memilih Meja 5", Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}