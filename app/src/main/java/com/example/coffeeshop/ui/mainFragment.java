package com.example.coffeeshop.ui;

import android.R.layout;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.coffeeshop.R;

public class mainFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        ListView mainlist = (ListView) v.findViewById(R.id.main_list);

        ImageButton map = (ImageButton) v.findViewById(R.id.mapIcon);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment search = new MapFragment();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.frame_main, search).commit();
            }
        });

        String[] names = {
            "Nikita",
            "Elya",
            "Valera",
            "petux",
            "Nastya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
            "Petya",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getContext(),
                android.R.layout.simple_list_item_1,
                names
        );


        mainlist.setAdapter(adapter);
        return v;
    }
}