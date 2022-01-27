package com.yurii.car_configurator.controller;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.yurii.car_configurator.R;
import com.yurii.car_configurator.controller.FamilyFragment;
import com.yurii.car_configurator.controller.EngineFragment;
import com.yurii.car_configurator.model.Engine;
import com.yurii.car_configurator.model.Family;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FamilyFragment.FamilyListener, EngineFragment.EngineListener {
    Button btnStart;
    TextView tvGreetings;
    Fragment fragment = null;
    Fragment fragment2 = null;
    Fragment fragment3 = null;
    int counter=0;
    FragmentManager fm;
    FragmentTransaction ft;
    Family family;
    Engine engine;
    //Engine engine = new Engine(family,"");
    @Override
    public void FamilySelected(String family_item) {
        family = new Family("");
        family.setFamily(family_item);
        Toast.makeText(this, "Сімейство автомобілів: " + family.getFamily(), Toast.LENGTH_LONG).show();
    }


    @Override
    public void EngineSelected(String engine_item) {
        engine = new Engine(family,"");
        engine.setEngine_title(engine_item);
        Toast.makeText(this, "Двигун автомобіля: " + engine.getEngine_title(), Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvGreetings = (TextView) findViewById(R.id.tvGreetings);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);
        fragment = new FamilyFragment();
        fragment2 = new EngineFragment();
        fragment3 = new FinalCarFragment();
    }

    public void onClick(View view) {
        btnStart.setText("Далі");
        Bundle bundle = new Bundle();
        if (counter == 0){
            counter++;
            fm = getFragmentManager();
            ft = fm.beginTransaction();
            ft.add(R.id.container, fragment);
        }
        else if (counter == 1) {
            counter++;
            bundle.putString("family", family.getFamily());
            fragment2.setArguments(bundle);
            //open a fragment
            fm = getFragmentManager();
            ft = fm.beginTransaction();
            ft.replace(R.id.container, fragment2);
        }
        else {
            counter = 0;
            btnStart.setText("Рестарт");
            bundle.putString("family", family.getFamily());
            bundle.putString("engine", engine.getEngine_title());
            fragment3.setArguments(bundle);
            fm = getFragmentManager();
            ft = fm.beginTransaction();
            ft.replace(R.id.container, fragment3);
        }
        ft.commit();
    }

}

    //использовать checkboxes()
    //use ToggleButton, RadioButton


