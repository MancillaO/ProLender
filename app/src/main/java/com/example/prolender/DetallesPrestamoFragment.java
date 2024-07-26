package com.example.prolender;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.DatePicker;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.Calendar;
public class DetallesPrestamoFragment extends Fragment {

    private EditText campoFechaC;
    private ImageView selectDateButtonC;
    private EditText campoFechaD;
    private ImageView selectDateButtonD;

    public DetallesPrestamoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalles_prestamo, container, false);

        campoFechaC = view.findViewById(R.id.campoFechaC);
        selectDateButtonC = view.findViewById(R.id.selectDateButtonC);
        campoFechaD = view.findViewById(R.id.campoFechaD);
        selectDateButtonD = view.findViewById(R.id.selectDateButtonD);

        selectDateButtonC.setOnClickListener(new View.OnClickListener() {
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
                campoFechaC.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
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