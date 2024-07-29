package com.example.prolender;

import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.prolender.Entidades.Cliente;
import com.example.prolender.Utilidades.UtilidadesDireccion;

public class AgregarDireccionFragment extends Fragment {
    EditText calle, numInt, numExt, colonia, estado, cp, tpPropi;

    Cliente dt = new Cliente();

    int id_cliente = dt.getId_cliente();


    public AgregarDireccionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_agregar_direccion, container, false);

        calle = view.findViewById(R.id.campoCalle);
        numInt = view.findViewById(R.id.campoNumInt);
        numExt = view.findViewById(R.id.campoNumExt);
        colonia = view.findViewById(R.id.campoColonia);
        estado = view.findViewById(R.id.campoEstado);
        cp = view.findViewById(R.id.campoCP);
        tpPropi = view.findViewById(R.id.campoTpPropiedad);

        Button btnRegistrar = view.findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ingresarDireccion();

                Fragment clientesFragment = new ClientesFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, clientesFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;
    }

    public void ingresarDireccion(){
        Context context = getActivity();
        if(context != null){
            ConexionSQLiteHelper conn = new ConexionSQLiteHelper(context, "ProLender", null, 1);
            SQLiteDatabase db = conn.getWritableDatabase();

            String insertarDireccion = "INSERT INTO " + UtilidadesDireccion.TABLA_DIRECCION + " ( "
                    + UtilidadesDireccion.ID_CLIENTE + ","
                    + UtilidadesDireccion.CALLE + ","
                    + UtilidadesDireccion.NUM_INT + ","
                    + UtilidadesDireccion.NUM_EXT + ","
                    + UtilidadesDireccion.COLONIA + ","
                    + UtilidadesDireccion.ESTADO + ","
                    + UtilidadesDireccion.CODIGO_POSTAL + ","
                    + UtilidadesDireccion.TIPO_PROPIEDAD + ")"
                    + " VALUES ('"
                    + id_cliente + "','"
                    + calle.getText().toString() + "','"
                    + numInt.getText().toString() + "','"
                    + numExt.getText().toString() + "','"
                    + colonia.getText().toString() + "','"
                    + estado.getText().toString() + "','"
                    + cp.getText().toString() + "','"
                    + tpPropi.getText().toString() + "')";

            db.execSQL(insertarDireccion);
            AlertDialog.Builder alerta = new AlertDialog.Builder(context);
            alerta.setMessage("Cliente Registrado "+id_cliente)
                    .setCancelable(true)
                    .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {
                            dialog.cancel();
                        }
                    });
            AlertDialog titulo = alerta.create();
            titulo.setTitle("Estado de Registro");
            titulo.show();
            db.close();

        }
    }



}
