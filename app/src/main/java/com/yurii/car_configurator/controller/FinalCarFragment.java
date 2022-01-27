package com.yurii.car_configurator.controller;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yurii.car_configurator.R;


public class FinalCarFragment extends Fragment {
    String family_car, engine;
    TextView stat_model, stat_engine, final_model, final_engine;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_final_car, container, false);
        if (getArguments() != null) {
            family_car = getArguments().getString("family");
            engine = getArguments().getString("engine");
        }
        stat_model = (TextView) v.findViewById(R.id.tvFamily);
        stat_engine = (TextView) v.findViewById(R.id.tvEngine);
        final_model = (TextView) v.findViewById(R.id.tvFinalModel);
        final_engine = (TextView) v.findViewById(R.id.tvFinalEngine);
        final_model.setText(family_car);
        final_engine.setText(engine);
        return v;
    }
}