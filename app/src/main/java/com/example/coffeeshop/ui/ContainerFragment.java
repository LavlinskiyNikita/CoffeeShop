package com.example.coffeeshop.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffeeshop.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class ContainerFragment extends Fragment {

    private ContainerFragment binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_container, container, false);

        BottomNavigationView BtnNav = v.findViewById(R.id.bottomNavigation);
        replaceFragment(new mainFragment());

        BtnNav.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.main) {
                replaceFragment(new mainFragment());
            } else if (item.getItemId() == R.id.cart){
                replaceFragment(new cartFragment());
            } else if (item.getItemId() == R.id.user) {
                replaceFragment(new mainFragment());
            }
            return true;
        });
        return v;
    }
    private void replaceFragment(Fragment fragmenet) {
        FragmentManager fragamentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmrntTransaction = fragamentManager.beginTransaction();
        fragmrntTransaction.replace(R.id.frame_cintainer, fragmenet);
        fragmrntTransaction.commit();
    }
}