package com.example.prolender;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.prolender.Utilidades.UtilidadesCliente;

import java.util.Calendar;

public class AgregarClientesFragment extends Fragment {
    EditText nombre, apat, amat, fechaNac, email, tel, rfc;
    private EditText campoFecha;
    private ImageView selectDateButton;

    public AgregarClientesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_agregar_clientes, container, false);

        nombre = view.findViewById(R.id.campoNombre);
        apat = view.findViewById(R.id.campoAppat);
        amat = view.findViewById(R.id.campoAmat);
        fechaNac = view.findViewById(R.id.campoFecha);
        email = view.findViewById(R.id.campoCorreo);
        tel = view.findViewById(R.id.campoNumero);
        rfc = view.findViewById(R.id.campoRFC);
        campoFecha = view.findViewById(R.id.campoFecha);
        selectDateButton = view.findViewById(R.id.selectDateButton);

        selectDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        Button btnContinuar = view.findViewById(R.id.btnContinuarCliente);
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ingresarCliente();

                Fragment agregarDireccionFragment = new AgregarDireccionFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, agregarDireccionFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        LinearLayout btnSelectPhoto = view.findViewById(R.id.foto);
        btnSelectPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Seleccionar foto", Toast.LENGTH_SHORT).show();
                //TODO: Remplazar el toast por el codigo para guardar la foto de perfil
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

    public void ingresarCliente(){
        Context context = getActivity();
        if (context != null) {
            ConexionSQLiteHelper conn = new ConexionSQLiteHelper(context, "ProLender", null, 1);
            SQLiteDatabase db = conn.getWritableDatabase();

            String insertarCliente = "INSERT INTO " + UtilidadesCliente.TABLA_CLIENTE + " ( "
                    + UtilidadesCliente.CAMPO_NOMBRE + ","
                    + UtilidadesCliente.CAMPO_APAT + ","
                    + UtilidadesCliente.CAMPO_AMAT + ","
                    + UtilidadesCliente.CAMPO_FECHANAC + ","
                    + UtilidadesCliente.CAMPO_EMAIL + ","
                    + UtilidadesCliente.CAMPO_TELEFONO + ","
                    + UtilidadesCliente.CAMPO_RFC + ")"
                    + " VALUES ('"
                    + nombre.getText().toString() + "','"
                    + apat.getText().toString() + "','"
                    + amat.getText().toString() + "','"
                    + fechaNac.getText().toString() + "','"
                    + email.getText().toString() + "','"
                    + tel.getText().toString() + "','"
                    + rfc.getText().toString() + "')";


            db.execSQL(insertarCliente);
            db.close();

        }
    }
}