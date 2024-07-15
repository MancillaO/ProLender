package com.example.prolender;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.Calendar;

public class CobroDepositoFragment extends Fragment implements View.OnClickListener{

    private RelativeLayout btnDepositar;
    private RelativeLayout btnCobrar;

    public CobroDepositoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cobro_deposito, container, false);

        btnDepositar = view.findViewById(R.id.btnDepositar);
        btnDepositar.setOnClickListener(this);
        btnCobrar = view.findViewById(R.id.btnCobrar);
        btnCobrar.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btnDepositar) {
            DepositarFragment depositarFragment = new DepositarFragment();

            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.frameLayout, depositarFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }

        if (id == R.id.btnCobrar) {
            CobrarFragment cobrarFragment = new CobrarFragment();

            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.frameLayout, cobrarFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}

