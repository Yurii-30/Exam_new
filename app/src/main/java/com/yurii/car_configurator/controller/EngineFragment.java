package com.yurii.car_configurator.controller;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.yurii.car_configurator.R;
import com.yurii.car_configurator.model.Adam_Engines;
import com.yurii.car_configurator.model.Astra_Engines;
import com.yurii.car_configurator.model.Combo_Engines;
import com.yurii.car_configurator.model.Corsa_Engines;
import com.yurii.car_configurator.model.Insignia_Engines;

import java.util.ArrayList;
import java.util.List;


public class EngineFragment extends Fragment {
    List<String> engines = new ArrayList<>();
    ArrayAdapter <String> adapter2;
    ListView lv2;
    TextView tvTitleEngine;
    String family_car="";
    private EngineListener listener;
    public interface EngineListener {
        void EngineSelected(String engine_item);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_engine, container, false);
        tvTitleEngine = (TextView) v.findViewById(R.id.tvTitleEngine);
        if (getArguments() != null) {
            family_car = getArguments().getString("family");
            switch (family_car) {
                case "Adam":
                    //here is a problem
                    for (Adam_Engines adam_engine: Adam_Engines.values()) {
                        engines.add(adam_engine.getEngine());
                    }
                    Toast.makeText(getContext(), "Всього двигунів для Adam: " + engines.size(), Toast.LENGTH_LONG).show();
                    break;
                case "Astra":
                    for (Astra_Engines astra_engine: Astra_Engines.values()) {
                        engines.add(astra_engine.getEngine());
                    }
                    Toast.makeText(getContext(), "Всього двигунів для Astra: " + engines.size(), Toast.LENGTH_LONG).show();
                    break;
                case "Corsa":
                    for (Corsa_Engines corsa_engine: Corsa_Engines.values()) {
                        engines.add(corsa_engine.getEngine());
                    }
                    Toast.makeText(getContext(), "Всього двигунів для Corsa: " + engines.size(), Toast.LENGTH_LONG).show();
                    break;
                case "Combo":
                    for (Combo_Engines combo_engine: Combo_Engines.values()) {
                        engines.add(combo_engine.getEngine());
                    }
                    Toast.makeText(getContext(), "Всього двигунів для Combo: " + engines.size(), Toast.LENGTH_LONG).show();
                    break;
                case "Insignia":
                    for (Insignia_Engines insignia_engine: Insignia_Engines.values()) {
                        engines.add(insignia_engine.getEngine());
                    }
                    Toast.makeText(getContext(), "Всього двигунів для Insignia: " + engines.size(), Toast.LENGTH_LONG).show();
                    break;
                default:
                    break;
            }
        }

        //adapter2 = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_2, engines);
        lv2 = (ListView) v.findViewById(R.id.list_engine);
        adapter2 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, engines);
        lv2.setAdapter(adapter2);
        lv2.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast.makeText(getActivity(), "Двигун автомобіля: " + lv2.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            listener.EngineSelected(lv2.getItemAtPosition(i).toString());
        });

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof EngineFragment.EngineListener) {
            listener = (EngineListener) context;
        } else {
            throw new RuntimeException(context.toString() + "виберіть двигун");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }


}