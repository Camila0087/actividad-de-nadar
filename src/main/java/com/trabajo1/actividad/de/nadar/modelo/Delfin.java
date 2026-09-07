package com.trabajo1.actividad.de.nadar.modelo;

public class Delfin implements ActividadNadar{
    private String nombreDelfin;
    private Nadador nadador;

    public Delfin(String nombreDelfin, Nadador nadador) {
        this.nombreDelfin = nombreDelfin;
        this.nadador = nadador;
    }

    @Override
    public String sumergirse(Nadador n) {
        return "El delfín " + nombreDelfin + " realiza una inmersión profunda con " + n.getNombre() + ".";
    }

    @Override
    public String flotar(Nadador n) {
        return "El delfín " + nombreDelfin + " flota jugetón al lado de " + n.getNombre() + ".";
    }

    @Override
    public String nadarHacia(Nadador n) {
        return "El delfín " + nombreDelfin + " nada hacia " + n.getNombre() + " usando su estilo " + n.getEstilo() + ".";
    }

    public Nadador getNadador() {
        return nadador;
    }
}
