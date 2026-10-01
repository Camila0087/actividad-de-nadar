package com.trabajo1.actividad.de.nadar.modelo;

public class Nadador {
    private String nombre;
    private Integer edad;
    private String estilo;

    public Nadador(String nombre, Integer edad, String estilo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estilo = estilo;
    }

    public String getNombre() { return nombre; }
    public Integer getEdad() { return edad; }
    public String getEstilo() { return estilo; }
}
