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



    public static final String CREAR_TABLA_CLIENTES = "CREATE TABLE " + "" + TABLA_CLIENTES + "("
            + ID_CLIENTE + " " + "INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CAMPO_NOMBRE + " TEXT NOT NULL, "
            + CAMPO_APAT + " TEXT NOT NULL, "
            + CAMPO_AMAT + " TEXT NOT NULL, "
            + CAMPO_FECHANAC + " TEXT NOT NULL, "
            + CAMPO_EMAIL + " TEXT NOT NULL, "
            + CAMPO_TELEFONO + " TEXT NOT NULL, "
            + CAMPO_RFC + " TEXT NOT NULL )";

}
