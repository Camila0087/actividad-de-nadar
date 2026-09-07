package com.trabajo1.actividad.de.nadar.modelo;

public class Pez implements ActividadNadar{
    private String especie;
    private Nadador nadador;

    public Pez(String especie, Nadador nadador) {
        this.especie = especie;
        this.nadador = nadador;
    }
    @Override
    public String sumergirse(Nadador n) {
        return "El pez " + especie + " se sumerge junto al nadador " + n.getNombre() + " en estilo " + n.getEstilo() + ".";
    }

    @Override
    public String flotar(Nadador n) {
        return "El pez " + especie + " flota en reposo cerca de " + n.getNombre() + ".";
    }

    @Override
    public String nadarHacia(Nadador n) {
        return "El pez " + especie + " nada velozmente hacia " + n.getNombre() + ".";
    }

    public Nadador getNadador() {
        return nadador;
    }
}
