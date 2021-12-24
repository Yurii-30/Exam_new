package com.yurii.car_configurator.controller;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.yurii.car_configurator.R;
import com.yurii.car_configurator.model.Family;
import com.yurii.car_configurator.model.Generation;

import java.util.ArrayList;
import java.util.List;


public class GenerationFragment extends Fragment {
    ListView lv;
    ArrayAdapter <String> adapter;
    List<String> generations = new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_generation, container, false);
        /*
        for (Adam_Generations adam_generations: Adam_Generations.values()) {
            generations.add(adam_generations.name());
        }
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, generations);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "Покоління автомобілів: " + lv.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });
        */
        return v;
    }
}