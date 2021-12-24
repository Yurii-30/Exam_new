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
import com.yurii.car_configurator.model.Family;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FamilyFragment.FamilyListener {
    Button btnStart;
    TextView tvGreetings;
    Fragment fragment = null;
   // NextFragment nextFragment = new NextFragment(1);
    @Override
    public void FamilySelected(String family_item) {
        Family family = new Family(family_item);
        Toast.makeText(this, "Сімейство автомобілів: " + family.getFamily(), Toast.LENGTH_LONG).show();
        fragment = new GenerationFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvGreetings = (TextView) findViewById(R.id.tvGreetings);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);
        fragment = new FamilyFragment();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnStart) {
            loadFragment(fragment);
            btnStart.setText("Далі");
        }
        // Do something
        //change "fragment" due to program state
        // изменение фрагмента происходит обрабатыванием нажатия кнопки в MainActivity
        // обрабатывать, когда не выбрали Family, Generation, Model и выводить ошибку
    }


    protected void loadFragment(Fragment fragment) {
        // create a FragmentManager
        FragmentManager fm = getFragmentManager();
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        // replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.fr_start, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}

    //использовать checkboxes()
    //use ToggleButton, RadioButton


