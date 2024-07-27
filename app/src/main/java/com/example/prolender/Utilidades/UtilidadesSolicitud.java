package com.example.prolender.Utilidades;

public class UtilidadesSolicitud {
    public static String TABLA_SOLICITUD = "solicitudes";
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
            + ID_CLIENTE + " INTEGER NOT NULL, "
            + OCUPACION + " TEXT NOT NULL, "
            + FECHA_SOLI_PRES + " TEXT NOT NULL, "
            + MONTO_SOLI + " TEXT NOT NULL, "
            + MONTO_APRO + " INTEGER NOT NULL, "
            + FECHA_DICTAMEN + " TEXT NOT NULL, "
            + INGRESO + " INTEGER NOT NULL, "
            + DICTAMEN + " TEXT NOT NULL)";


}
