package com.trabajo1.actividad.de.nadar.modelo;

public class ResultadoActividad {
private String sumergirse;
private String flotar;
private String nadarHacia;

    public ResultadoActividad(String sumergirse, String flotar, String nadarHacia) {
        this.sumergirse = sumergirse;
        this.flotar = flotar;
        this.nadarHacia = nadarHacia;
    }

    public String getSumergirse() {
        return sumergirse;
    }

    public String getFlotar() {
        return flotar;
    }

    public String getNadarHacia() {
        return nadarHacia;
    }
}
