package com.example.prolender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        int id = view.getId();
        Intent miIntent = null;

        if (id == R.id.btnCrear) {
            miIntent = new Intent(MainActivity.this, CrearCuentaActivity.class);
        }
        if (id == R.id.btnContinuar) {
            miIntent = new Intent(MainActivity.this, HomeActivity.class);
        }

        if (miIntent != null) {
            startActivity(miIntent);
        } else {
            Toast.makeText(this, "Acción no reconocida", Toast.LENGTH_SHORT).show();
        }
    }
}
