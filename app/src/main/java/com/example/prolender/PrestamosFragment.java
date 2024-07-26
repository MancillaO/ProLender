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

public class PrestamosFragment extends Fragment implements View.OnClickListener {

    private LinearLayout btnAgregar;
    private LinearLayout btnCD;
    private TextView btnDetalles;


    public PrestamosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_prestamos, container, false);

        btnAgregar = view.findViewById(R.id.ver_solicitud);
        btnAgregar.setOnClickListener(this);
        btnCD = view.findViewById(R.id.cobro_deposito);
        btnCD.setOnClickListener(this);
        btnDetalles = view.findViewById(R.id.txtDetalles1);
        btnDetalles.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.ver_solicitud) {
            VerSolicitudFragment verSolicitudFragment = new VerSolicitudFragment();

            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.frameLayout, verSolicitudFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }

        if (id == R.id.cobro_deposito) {
            CobroDepositoFragment cobroDepositoFragment = new CobroDepositoFragment();

            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.frameLayout, cobroDepositoFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
        if (id == R.id.txtDetalles1) {
            Fragment detallesPrestamoFragment = new DetallesPrestamoFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout, detallesPrestamoFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
