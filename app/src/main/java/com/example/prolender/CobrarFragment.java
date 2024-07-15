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

public class CobrarFragment extends Fragment implements View.OnClickListener{

    private RelativeLayout btnPagar;

    public CobrarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cobrar, container, false);
        btnPagar = view.findViewById(R.id.btnPagar);
        btnPagar.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btnPagar) {
            CobroDepositoFragment cobroDepositoFragment = new CobroDepositoFragment();

            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.frameLayout, cobroDepositoFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}

