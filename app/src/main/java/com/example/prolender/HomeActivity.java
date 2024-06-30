package com.example.prolender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.prolender.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.home) {
                Toast.makeText(HomeActivity.this, "Home selected", Toast.LENGTH_SHORT).show();

            } else if (itemId == R.id.clientes) {
                Toast.makeText(HomeActivity.this, "Clientes selected", Toast.LENGTH_SHORT).show();

            } else if (itemId == R.id.prestamos) {
                Toast.makeText(HomeActivity.this, "Prestamos selected", Toast.LENGTH_SHORT).show();

            } else if (itemId == R.id.config) {
                Toast.makeText(HomeActivity.this, "Config selected", Toast.LENGTH_SHORT).show();
            }

            return true;
        });
    }
}