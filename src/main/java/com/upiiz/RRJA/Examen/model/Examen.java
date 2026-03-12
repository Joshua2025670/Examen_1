package com.upiiz.RRJA.Examen.model;

public class Examen {
    private int id;
    private String metodo;
    private String monto;
    private String fecha;

    public Examen(int id, String metodo, String monto, String fecha){
        this.id=id;
        this.metodo=metodo;
        this.monto=monto;
        this.fecha=fecha;
    }

    public int getid() { return id; }
    public String getMetodo() { return metodo; }
    public String getMonto() { return monto; }
    public String getFecha() { return fecha; }
}
