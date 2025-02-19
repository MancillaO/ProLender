package com.example.prolender;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class ClientesFragment extends Fragment implements View.OnClickListener {

    private LinearLayout btnAgregar;
    private LinearLayout btnAgregarS;
    private TextView btnDetalles;

    public ClientesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_clientes, container, false);

        btnAgregar = view.findViewById(R.id.add_cliente);
        btnAgregar.setOnClickListener(this);
        btnAgregarS = view.findViewById(R.id.add_solicitud);
        btnAgregarS.setOnClickListener(this);
        btnDetalles = view.findViewById(R.id.txtDetalles1);
        btnDetalles.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.add_cliente) {
            Fragment agregarClienteFragment = new AgregarClientesFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout, agregarClienteFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

        if (id == R.id.add_solicitud) {
            Fragment agregarSolicitudFragment = new AgregarSolicitudFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout, agregarSolicitudFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

        if (id == R.id.txtDetalles1) {
            Fragment detallesClienteFragment = new DetallesClienteFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout, detallesClienteFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
