package com.example.prolender;

import android.app.DatePickerDialog;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.prolender.Entidades.Cliente;
import com.example.prolender.Utilidades.UtilidadesSolicitud;

import java.util.Calendar;

public class AgregarSolicitudFragment extends Fragment {

    private EditText campoFecha;
    private ImageView selectDateButton;
    EditText ocupacion, montoSoli, ingreso;

    Cliente dtSoli = new Cliente();
    int id_clienteSoli = dtSoli.getId_cliente();

    public AgregarSolicitudFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_agregar_solicitud, container, false);

        ocupacion = view.findViewById(R.id.campoOcupacionSoli);
        montoSoli = view.findViewById(R.id.campoMonto);
        ingreso = view.findViewById(R.id.campoIngreso);

        Button btnRegistrar = view.findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ingresarSolicitud();

                Fragment clientesFragment = new ClientesFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, clientesFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        campoFecha = view.findViewById(R.id.campoFecha);
        selectDateButton = view.findViewById(R.id.selectDateButton);

        selectDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
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

    public void ingresarSolicitud(){
        Context context = getActivity();
        if (context != null) {
            ConexionSQLiteHelper conn = new ConexionSQLiteHelper(context, "ProLender", null, 1);
            SQLiteDatabase db = conn.getWritableDatabase();

            String insertarSolicitud = "INSERT INTO " + UtilidadesSolicitud.TABLA_SOLICITUD + " ( "
                    + UtilidadesSolicitud.ID_CLIENTE + ","
                    + UtilidadesSolicitud.OCUPACION + ","
                    + UtilidadesSolicitud.FECHA_SOLI_PRES + ","
                    + UtilidadesSolicitud.MONTO_SOLI + ","
                    + UtilidadesSolicitud.INGRESO + ")"
                    + " VALUES ('"
                    + id_clienteSoli + "','"
                    + ocupacion.getText().toString() + "','"
                    + campoFecha + "','"
                    + montoSoli.getText().toString() + "','"
                    + ingreso.getText().toString() + "')";

            db.execSQL(insertarSolicitud);
            Toast.makeText(context,"Solicitud Registrado ", Toast.LENGTH_SHORT).show();
            db.close();

        }
    }




}
