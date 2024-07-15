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

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.Calendar;

public class VerSolicitudFragment extends Fragment {

    private EditText campoFecha;
    private EditText campoFechaD;
    private ImageView selectDateButton;
    private ImageView selectDateButtonD;

    public VerSolicitudFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ver_solicitud, container, false);

        Button btnRegistrar = view.findViewById(R.id.btnAprovar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment prestamosFragment = new PrestamosFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, prestamosFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        campoFecha = view.findViewById(R.id.campoFecha);
        campoFechaD = view.findViewById(R.id.campoFechaD);
        selectDateButton = view.findViewById(R.id.selectDateButton);
        selectDateButtonD = view.findViewById(R.id.selectDateButtonD);

        selectDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        selectDateButtonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialogD();
            }
        });

        return view;
    }

    private void showDatePickerDialog() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                // Update the EditText with the selected date
                campoFecha.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
            }
        }, year, month, day);

        datePickerDialog.show();
    }

    private void showDatePickerDialogD() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                // Update the EditText with the selected date
                campoFechaD.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
            }
        }, year, month, day);

        datePickerDialog.show();
    }
}
