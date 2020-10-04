package com.example.zmail.models;

import java.io.Serializable;

public class CorreoElectronico implements Serializable {
    private String NombreRemitente;
    private String AsuntoMensaje;
    private int Icono;
    private String CuerpoMensaje;
    private int id;

    public CorreoElectronico(String nombreRemitente, String asuntoMensaje, int icono, String cuerpoMensaje, int id) {
        NombreRemitente = nombreRemitente;
        AsuntoMensaje = asuntoMensaje;
        Icono = icono;
        CuerpoMensaje = cuerpoMensaje;
        this.id = id;
    }

    public String getNombreRemitente() {
        return NombreRemitente;
    }

    public void setNombreRemitente(String nombreRemitente) {
        NombreRemitente = nombreRemitente;
    }

    public String getAsuntoMensaje() {
        return AsuntoMensaje;
    }

    public void setAsuntoMensaje(String asuntoMensaje) {
        AsuntoMensaje = asuntoMensaje;
    }

    public int getIcono() {
        return Icono;
    }

    public void setIcono(int icono) {
        Icono = icono;
    }

    public String getCuerpoMensaje() {
        return CuerpoMensaje;
    }

    public void setCuerpoMensaje(String cuerpoMensaje) {
        CuerpoMensaje = cuerpoMensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
