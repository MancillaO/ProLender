package com.example.prolender.Entidades;

public class Direccion {
    private int id_direccion;
    private int id_cliente;
    private int id_consecutivo;
    private String calle;
    private int numInt;
    private int numExt;
    private String colonia;
    private String estado;
    private int codigoPostal;
    private String tpPropiedad;


    public Direccion() {

    }

    public Direccion(int id_direccion, int id_cliente, int id_consecutivo, String calle, int numInt, int numExt, String colonia, String estado, int codigoPostal, String tpPropiedad) {
        this.id_direccion = id_direccion;
        this.id_cliente = id_cliente;
        this.id_consecutivo = id_consecutivo;
        this.calle = calle;
        this.numInt = numInt;
        this.numExt = numExt;
        this.colonia = colonia;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.tpPropiedad = tpPropiedad;
    }


    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_consecutivo() {
        return id_consecutivo;
    }

    public void setId_consecutivo(int id_consecutivo) {
        this.id_consecutivo = id_consecutivo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumInt() {
        return numInt;
    }

    public void setNumInt(int numInt) {
        this.numInt = numInt;
    }

    public int getNumExt() {
        return numExt;
    }

    public void setNumExt(int numExt) {
        this.numExt = numExt;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTpPropiedad() {
        return tpPropiedad;
    }

    public void setTpPropiedad(String tpPropiedad) {
        this.tpPropiedad = tpPropiedad;
    }


}
