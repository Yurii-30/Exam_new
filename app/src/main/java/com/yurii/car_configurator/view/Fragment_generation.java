package com.yurii.car_configurator.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.yurii.car_configurator.R;
import com.yurii.car_configurator.controller.MainActivity;
import com.yurii.car_configurator.model.Family;
import com.yurii.car_configurator.model.Generation;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_generation #newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_generation extends Fragment implements AdapterView.OnItemSelectedListener {
    Spinner choose_engine;
    Context thiscontext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        thiscontext = inflater.getContext();
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_generation, container, false);
        choose_engine = (Spinner) v.findViewById(R.id.spinnerEngine);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(thiscontext, R.array.Opel_engines, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        choose_engine.setAdapter(adapter);
        choose_engine.setOnItemSelectedListener (this);
        return v;
    }

    @Override
    public void onItemSelected (AdapterView< ? > adapterView, View view, int i, long l){
        Generation generation = new Generation(adapterView.getItemAtPosition(i).toString(), Family );
        Fragment fragment = null;
        fragment = new Fragment_family();
        getFragmentManager().beginTransaction().replace(R.id.fragment2, fragment).commit();
        Toast.makeText(thiscontext, "asd", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected (AdapterView < ? > adapterView){

    }
}