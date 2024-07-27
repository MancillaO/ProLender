package com.example.prolender;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.prolender.Utilidades.UtilidadesCliente;
import com.example.prolender.Utilidades.UtilidadesDireccion;
import com.example.prolender.Utilidades.UtilidadesSolicitud;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {
    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UtilidadesCliente.CREAR_TABLA_CLIENTE);
        db.execSQL(UtilidadesDireccion.CREAR_TABLA_DIRECCION);
        db.execSQL(UtilidadesSolicitud.CREAR_TABLA_SOLICITUD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS cliente");
        db.execSQL("DROP TABLE IF EXISTS direccion");
        db.execSQL("DROP TABLE IF EXISTS solicitud");
    }
}
