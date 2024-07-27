package com.example.prolender.Utilidades;

public class UtilidadesSolicitud {
    public static String TABLA_SOLICITUD = "solicitud";
    public static String ID_SOLICITUD = "id_solicitud";
    public static String ID_CLIENTE = "id_cliente";
    public static String OCUPACION = "ocupacion";
    public static String FECHA_SOLI_PRES = "fechaSoliPres";
    public static String MONTO_SOLI = "montoSoli";
    public static String MONTO_APRO = "montoApro";
    public static String FECHA_DICTAMEN = "fechaDictamen";
    public static String INGRESO = "ingreso";
    public static String DICTAMEN = "dictamen";


    public static final String CREAR_TABLA_SOLICITUD = "CREATE TABLE " + TABLA_SOLICITUD + " ("
            + ID_SOLICITUD + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ID_CLIENTE + " INTEGER, "
            + OCUPACION + " TEXT , "
            + FECHA_SOLI_PRES + " TEXT, "
            + MONTO_SOLI + " TEXT, "
            + MONTO_APRO + " INTEGER, "
            + FECHA_DICTAMEN + " TEXT, "
            + INGRESO + " INTEGER, "
            + DICTAMEN + " TEXT)";


}
