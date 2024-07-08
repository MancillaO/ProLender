package com.example.prolender;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class PrestamosFragment extends Fragment implements View.OnClickListener {

    private RelativeLayout btnAgregar;

    public PrestamosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_prestamos, container, false);

        btnAgregar = view.findViewById(R.id.add_prestamo);
        btnAgregar.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.add_prestamo) {
            // Crear instancia del fragmento AgregarPrestamosFragment
            AgregarPrestamosFragment agregarPrestamosFragment = new AgregarPrestamosFragment();

            // Iniciar transacción para reemplazar el fragmento actual con AgregarPrestamosFragment
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.frameLayout, agregarPrestamosFragment); // Reemplazar fragment_container con el ID de tu contenedor de fragmentos
            transaction.addToBackStack(null); // Opcional: añadir transacción a la pila de retroceso
            transaction.commit();
        }
    }
}
