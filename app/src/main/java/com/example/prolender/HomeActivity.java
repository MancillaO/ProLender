package com.example.prolender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;


import com.example.prolender.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

            binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.home) {
                replaceFragment(new HomeFragment());

            } else if (itemId == R.id.clientes) {
                replaceFragment(new ClientesFragment());

            } else if (itemId == R.id.prestamos) {
                replaceFragment(new PrestamosFragment());

            } else if (itemId == R.id.config) {
                replaceFragment(new ConfigFragment());
            }

            return true;
        });
    }
    public void onClick(View view) {
        int id = view.getId();
        Intent miIntent = null;

        if (id == R.id.IconUser) {
            miIntent = new Intent(HomeActivity.this, MainActivity.class);
        } else {
            Toast.makeText(this, "Acción no reconocida", Toast.LENGTH_SHORT).show();
        }
        if (miIntent != null) {
            startActivity(miIntent);
        }
    }

    private void replaceFragment (Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();

    }

}