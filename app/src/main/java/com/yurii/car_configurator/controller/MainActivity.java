package com.yurii.car_configurator.controller;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.yurii.car_configurator.R;
import com.yurii.car_configurator.model.Family;
import com.yurii.car_configurator.view.Fragment_family;

public class MainActivity extends AppCompatActivity {
    Button btnStart;
    public Family family;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "adsdasda", Toast.LENGTH_LONG).show();
        //Вітаємо у нашому додатку з вибору авто Opel
        btnStart = (Button) findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                fragment = new Fragment_family();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment1, fragment).commit();
            }
        });


    }
    //использовать checkboxes()
    //use ToggleButton, RadioButton


}