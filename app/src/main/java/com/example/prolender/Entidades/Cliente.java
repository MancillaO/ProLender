package com.example.prolender.Entidades;

public class Cliente {
    private int id_cliente;
    private String nombre;
    private String apat;
    private String amat;
    private String fechaNac;
    private String email;
    private String tel;
    private String rfc;


    public Cliente() {

    }

    public Cliente(int id_cliente, String nombre, String apat, String amat, String fechaNac, String email, String tel, String rfc) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apat = apat;
        this.amat = amat;
        this.fechaNac = fechaNac;
        this.email = email;
        this.tel = tel;
        this.rfc = rfc;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApat() {
        return apat;
    }

    public void setApat(String apat) {
        this.apat = apat;
    }

    public String getAmat() {
        return amat;
    }

    public void setAmat(String amat) {
        this.amat = amat;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }


}
