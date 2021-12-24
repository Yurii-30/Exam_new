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

import com.yurii.car_configurator.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FamilyFragment #newInstance} factory method to
 * create an instance of this fragment.
 */


public class FamilyFragment extends Fragment  {
    ListView lv;
    //SearchView searchView;
    ArrayAdapter <String> adapter;
    String[] family_items = {"Adam", "Astra", "Corsa", "Combo", "Insignia"};
    private FamilyListener listener;
    public interface FamilyListener {
        void FamilySelected(String family_item);
    }
   // NextFragment nextFragment;
    // can be changed
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_family, container, false);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             lv = (ListView) v.findViewById(R.id.list_family);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, family_items);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //family.setFamily(lv.getItemAtPosition(i).toString());
            //    Toast.makeText(getActivity(), "Сімейство автомобілів: " + lv.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                listener.FamilySelected(lv.getItemAtPosition(i).toString());
                // Problem with class nextFragment
            }
        });

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FamilyListener) {
            listener = (FamilyListener) context;
        } else {
            throw new RuntimeException(context.toString() + "виберіть сімейство авто");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}