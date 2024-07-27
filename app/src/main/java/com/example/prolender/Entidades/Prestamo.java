package com.example.prolender.Entidades;

public class Prestamo {
    private int id_prestamo;
    private int id_solicitud;
    private long montoPrestamo;
    private String fechaCortr;
    private int plazoPago;
    private String metodoPago;
    private String fechaDeposito;

    public Prestamo() {

    }

    public Prestamo(int id_prestamo, int id_solicitud, long montoPrestamo, String fechaCortr, int plazoPago, String metodoPago, String fechaDeposito) {
        this.id_prestamo = id_prestamo;
        this.id_solicitud = id_solicitud;
        this.montoPrestamo = montoPrestamo;
        this.fechaCortr = fechaCortr;
        this.plazoPago = plazoPago;
        this.metodoPago = metodoPago;
        this.fechaDeposito = fechaDeposito;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public int getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public long getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(long montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public String getFechaCortr() {
        return fechaCortr;
    }

    public void setFechaCortr(String fechaCortr) {
        this.fechaCortr = fechaCortr;
    }

    public int getPlazoPago() {
        return plazoPago;
    }

    public void setPlazoPago(int plazoPago) {
        this.plazoPago = plazoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFechaDeposito() {
        return fechaDeposito;
    }

    public void setFechaDeposito(String fechaDeposito) {
        this.fechaDeposito = fechaDeposito;
    }


}
