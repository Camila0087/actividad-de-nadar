package com.trabajo1.actividad.de.nadar.modelo;

import java.util.List;

public class Buceador implements ActividadNadar {
    private String nombre;
    private List<Nadador> listaNadadores;

    public Buceador(String nombre, List<Nadador> listaNadadores) {
        this.nombre = nombre;
        this.listaNadadores = listaNadadores;
    }

    @Override public String getNombre() { return nombre; }
    @Override public List<Nadador> getListaNadadores() { return listaNadadores; }
    @Override public String sumergirse() { return "El buceador " + nombre + " desciende al fondo."; }
    @Override public String flotar() { return "El buceador " + nombre + " flota con su equipo."; }
    @Override public String nadarHacia() { return "El buceador " + nombre + " nada hacia el arrecife."; }
}
