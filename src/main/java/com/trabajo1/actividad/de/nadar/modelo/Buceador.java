package com.trabajo1.actividad.de.nadar.modelo;

public class Buceador implements ActividadNadar{
    private String nivelExperiencia;
    private Nadador nadador;

    public Buceador(String nivelExperiencia, Nadador nadador) {
        this.nivelExperiencia = nivelExperiencia;
        this.nadador = nadador;
    }

    @Override
    public String sumergirse(Nadador n) {
        return "El buceador " + nivelExperiencia + " se sumerge acompañando a " + n.getNombre() + ".";
    }

    @Override
    public String flotar(Nadador n) {
        return "El buceador " + nivelExperiencia + " mantiene flotabilidad neutra con " + n.getNombre() + ".";
    }

    @Override
    public String nadarHacia(Nadador n) {
        return "El buceador " + nivelExperiencia + " nadará hacia " + n.getNombre() + " (estilo: " + n.getEstilo() + ").";
    }

    public Nadador getNadador() {
        return nadador;
    }
}
