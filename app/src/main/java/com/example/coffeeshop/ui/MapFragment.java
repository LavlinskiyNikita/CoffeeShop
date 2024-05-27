package com.example.coffeeshop.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.coffeeshop.R;

public class MapFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_map, container, false);

        ImageButton backMapToMain = (ImageButton) v.findViewById(R.id.back);

        backMapToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment search = new ContainerFragment();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.frame_main, search).commit();
            }
        });
        return v;
    }
}