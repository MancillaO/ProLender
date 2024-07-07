package com.example.prolender;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class ClientesFragment extends Fragment implements View.OnClickListener {

    private RelativeLayout btnAgregar;

    public ClientesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_clientes, container, false);

        btnAgregar = view.findViewById(R.id.add_cliente);
        btnAgregar.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.add_cliente) {
            Toast.makeText(getContext(), "Agregar nuevo cliente", Toast.LENGTH_SHORT).show();
        }
    }
}