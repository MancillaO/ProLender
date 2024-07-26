package com.example.prolender.Utilidades;

public class UtilidadesCliente {
    public static String TABLA_CLIENTES = "clientes";
    public static String ID_CLIENTE = "id";
    public static String CAMPO_NOMBRE = "nombre";
    public static String CAMPO_APAT = "apat";
    public static String CAMPO_AMAT = "amat";
    public static String CAMPO_FECHANAC = "fechaNac";
    public static String CAMPO_EMAIL = "email";
    public static String CAMPO_TELEFONO = "tel";
    public static String CAMPO_RFC = "rfc";
    public static String CAMPO_OCUPACION = "ocupacion";
    public static String CAMPO_INGRESOMENS = "ingresoMens";


    public static final String CREAR_TABLA_CLIENTES = "CREATE TABLE " + "" + TABLA_CLIENTES + "("
            + ID_CLIENTE + " " + "INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CAMPO_NOMBRE + " TEXT, "
            + CAMPO_APAT + " TEXT, "
            + CAMPO_AMAT + " TEXT, "
            + CAMPO_FECHANAC + " TEXT, "
            + CAMPO_EMAIL + " TEXT, "
            + CAMPO_TELEFONO + " TEXT, "
            + CAMPO_RFC + " TEXT, "
            + CAMPO_OCUPACION + " TEXT, "
            + CAMPO_INGRESOMENS+ " INTEGER)";

}
