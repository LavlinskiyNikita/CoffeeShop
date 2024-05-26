package com.example.coffeeshop.ui;

import android.R.layout;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.coffeeshop.R;

public class mainFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        ListView mainlist = (ListView) v.findViewById(R.id.main_list);

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