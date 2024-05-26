package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.coffeeshop.databinding.ActivityMainBinding;
import com.example.coffeeshop.ui.ContainerFragment;
import com.example.coffeeshop.ui.cartFragment;
import com.example.coffeeshop.ui.mainFragment;
public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        replaceFragment(new mainFragment());
    }

    private void replaceFragment(Fragment fragmenet) {
        FragmentManager fragamentManager = getSupportFragmentManager();
        FragmentTransaction fragmrntTransaction = fragamentManager.beginTransaction();
        fragmrntTransaction.replace(R.id.frame_main, new ContainerFragment());
        fragmrntTransaction.commit();
    }
}