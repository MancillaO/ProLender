package com.example.prolender.Utilidades;

public class UtilidadesDireccion {
    public static String TABLA_DIRECCION = "direccion";
    public static String ID_DIRECCION = "id_direccion";
    public static String ID_CLIENTE = "id_cliente";
    public static String ID_CONSECUTIVO = "id_consecutivo";
    public static String CALLE = "calle";
    public static String NUM_INT = "numInt";
    public static String NUM_EXT = "numExt";
    public static String COLONIA = "colonia";
    public static String ESTADO = "estado";
    public static String CODIGO_POSTAL = "codigoPostal";
    public static String TIPO_PROPIEDAD = "tpPropiedad";


    public static final String CREAR_TABLA_DIRECCION = "CREATE TABLE " + TABLA_DIRECCION + " ("
            + ID_DIRECCION + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ID_CLIENTE + " INTEGER NOT NULL, "
            + ID_CONSECUTIVO + " INTEGER NOT NULL, "
            + CALLE + " TEXT NOT NULL, "
            + NUM_INT + " INTEGER NOT NULL, "
            + NUM_EXT + " INTEGER NOT NULL, "
            + COLONIA + " TEXT NOT NULL, "
            + ESTADO + " TEXT NOT NULL, "
            + CODIGO_POSTAL + " INTEGER NOT NULL, "
            + TIPO_PROPIEDAD + " TEXT NOT NULL)";



}
