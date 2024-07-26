package com.example.prolender;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.prolender.Utilidades.UtilidadesCliente;

public class AgregarClientesFragment extends Fragment {
    EditText nombre, apat, amat, fechaNac, email, tel, rfc, ocupacion, ingreso;

    public AgregarClientesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_agregar_clientes, container, false);

        nombre = view.findViewById(R.id.campoNombre);
        apat = view.findViewById(R.id.campoAppat);
        amat = view.findViewById(R.id.campoAmat);
        fechaNac = view.findViewById(R.id.campoFecha);
        email = view.findViewById(R.id.campoCorreo);
        tel = view.findViewById(R.id.campoNumero);
        rfc = view.findViewById(R.id.campoRFC);


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

        return view;
    }

    public void ingresarCliente(){
        Context context = getActivity();
        if (context != null) {
            ConexionSQLiteHelper conn = new ConexionSQLiteHelper(context, "ProLender", null, 1);
            SQLiteDatabase db = conn.getWritableDatabase();

            String insertarCliente = "INSERT INTO " + UtilidadesCliente.TABLA_CLIENTES + " ( "
            + UtilidadesCliente.CAMPO_NOMBRE + ","
            + UtilidadesCliente.CAMPO_APAT + ","
            + UtilidadesCliente.CAMPO_AMAT + ","
            + UtilidadesCliente.CAMPO_FECHANAC + ","
            + UtilidadesCliente.CAMPO_EMAIL + ","
            + UtilidadesCliente.CAMPO_TELEFONO + ","
            + UtilidadesCliente.CAMPO_RFC + ","
            + UtilidadesCliente.CAMPO_OCUPACION + ","
            + UtilidadesCliente.CAMPO_INGRESOMENS + ")"
            + " VALUES ('"
            + nombre.getText().toString() + "','"
            + apat.getText().toString() + "','"
            + amat.getText().toString() + "','"
            + fechaNac.getText().toString() + "','"
            + email.getText().toString() + "','"
            + tel.getText().toString() + "','"
            + rfc.getText().toString() + "','"
            + ocupacion.getText().toString() + "','"
            + ingreso.getText().toString() + "')";

            db.execSQL(insertarCliente);
            Toast.makeText(context,"Cliente Registrado ", Toast.LENGTH_SHORT).show();
            db.close();

        }
    }
}
