package com.example.prolender.Utilidades;

public class UtilidadesPrestamo {
    public static String TABLA_PRESTAMO = "prestamo";
    public static String ID_PRESTAMO = "id_prestamo";
    public static String ID_SOLICITUD = "id_solicitud";
    public static String MONTO_PRESTAMO = "montoPrestamo";
    public static String FECHA_CORTR = "fechaCortr";
    public static String PLAZO_PAGO = "plazoPago";
    public static String METODO_PAGO = "metodoPago";
    public static String FECHA_DEPOSITO = "fechaDeposito";

    public static final String CREAR_TABLA_PRESTAMO = "CREATE TABLE " + TABLA_PRESTAMO + " ("
            + ID_PRESTAMO + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ID_SOLICITUD + " INTEGER NOT NULL, "
            + MONTO_PRESTAMO + " INTEGER NOT NULL, "
            + FECHA_CORTR + " TEXT NOT NULL, "
            + PLAZO_PAGO + " INTEGER NOT NULL, "
            + METODO_PAGO + " TEXT NOT NULL, "
            + FECHA_DEPOSITO + " TEXT NOT NULL)";


}
