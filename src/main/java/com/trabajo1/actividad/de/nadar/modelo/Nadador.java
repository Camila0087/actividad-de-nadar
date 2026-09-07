package com.trabajo1.actividad.de.nadar.modelo;

public class Nadador {
    private String nombre;
    private String estilo;

    public Nadador(String nombre, String estilo) {
        this.nombre = nombre;
        this.estilo = estilo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
