package com.yurii.car_configurator.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.yurii.car_configurator.R;
import com.yurii.car_configurator.model.Family;

public class Fragment_family extends Fragment implements AdapterView.OnItemSelectedListener {
    Spinner choose_model;
    Context thiscontext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        thiscontext = inflater.getContext();
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_family, container, false);
        choose_model = (Spinner) v.findViewById(R.id.spinnerModel);
        // To get an array of strings
        ArrayAdapter <CharSequence> arrayAdapter = ArrayAdapter.createFromResource(thiscontext, R.array.Opel_models, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        choose_model.setAdapter(arrayAdapter);
        choose_model.setOnItemSelectedListener(this);
        return v;
    }
        @Override
        public void onItemSelected (AdapterView < ? > adapterView, View view,int i, long l){
            Family family = new Family(adapterView.getItemAtPosition(i).toString());
            Fragment fragment = null;
            fragment = new Fragment_family();
            getFragmentManager().beginTransaction().replace(R.id.fragment1, fragment).commit();
        }

        @Override
        public void onNothingSelected (AdapterView < ? > adapterView){

        }

}