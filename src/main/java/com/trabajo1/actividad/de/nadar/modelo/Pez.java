package com.trabajo1.actividad.de.nadar.modelo;

import java.util.List;

public class Pez implements ActividadNadar {
    private String nombre;
    private List<Nadador> listaNadadores;

    public Pez(String nombre, List<Nadador> listaNadadores) {
        this.nombre = nombre;
        this.listaNadadores = listaNadadores;
    }

    @Override public String getNombre() { return nombre; }
    @Override public List<Nadador> getListaNadadores() { return listaNadadores; }
    @Override public String sumergirse() { return "El pez " + nombre + " se sumerge."; }
    @Override public String flotar() { return "El pez " + nombre + " flota."; }
    @Override public String nadarHacia() { return "El pez " + nombre + " nada hacia adelante."; }
}
