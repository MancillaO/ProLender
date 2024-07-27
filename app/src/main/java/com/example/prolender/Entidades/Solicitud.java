package com.example.prolender.Entidades;

public class Solicitud {
    private int id_solicitud;
    private int id_cliente;
    private String ocupacion;
    private String fechaSoliPres;
    private String montoSoli;
    private long montoApro;
    private String fechaDictamen;
    private long ingreso;
    private String dictamen;


    public Solicitud() {

    }

    public Solicitud(int id_solicitud, int id_cliente, String ocupacion, String fechaSoliPres, String montoSoli, long montoApro, String fechaDictamen, long ingreso, String dictamen) {
        this.id_solicitud = id_solicitud;
        this.id_cliente = id_cliente;
        this.ocupacion = ocupacion;
        this.fechaSoliPres = fechaSoliPres;
        this.montoSoli = montoSoli;
        this.montoApro = montoApro;
        this.fechaDictamen = fechaDictamen;
        this.ingreso = ingreso;
        this.dictamen = dictamen;
    }

    public int getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getFechaSoliPres() {
        return fechaSoliPres;
    }

    public void setFechaSoliPres(String fechaSoliPres) {
        this.fechaSoliPres = fechaSoliPres;
    }

    public String getMontoSoli() {
        return montoSoli;
    }

    public void setMontoSoli(String montoSoli) {
        this.montoSoli = montoSoli;
    }

    public long getMontoApro() {
        return montoApro;
    }

    public void setMontoApro(long montoApro) {
        this.montoApro = montoApro;
    }

    public String getFechaDictamen() {
        return fechaDictamen;
    }

    public void setFechaDictamen(String fechaDictamen) {
        this.fechaDictamen = fechaDictamen;
    }

    public long getIngreso() {
        return ingreso;
    }

    public void setIngreso(long ingreso) {
        this.ingreso = ingreso;
    }

    public String getDictamen() {
        return dictamen;
    }

    public void setDictamen(String dictamen) {
        this.dictamen = dictamen;
    }
}
