package com.trabajo1.actividad.de.nadar.modelo;

import java.util.List;

public class Delfin implements ActividadNadar {
    private String nombre;
    private List<Nadador> listaNadadores;

    public Delfin(String nombre, List<Nadador> listaNadadores) {
        this.nombre = nombre;
        this.listaNadadores = listaNadadores;
    }

    @Override public String getNombre() { return nombre; }
    @Override public List<Nadador> getListaNadadores() { return listaNadadores; }
    @Override public String sumergirse() { return "El delfín " + nombre + " se sumerge."; }
    @Override public String flotar() { return "El delfín " + nombre + " flota."; }
    @Override public String nadarHacia() { return "El delfín " + nombre + " nada hacia la orilla."; }
}
