package com.trabajo1.actividad.de.nadar.Repositories;

import org.springframework.stereotype.Repository;
import com.trabajo1.actividad.de.nadar.modelo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class NadarRepository {

    private List<ActividadNadar> objetos = new ArrayList<>();

    public NadarRepository() {
        Nadador n1 = new Nadador("Carlos", 25, "Libre");
        Nadador n2 = new Nadador("Maria", 30, "Espalda");
        Nadador n3 = new Nadador("Juan", 18, "Mariposa");
        Nadador n4 = new Nadador("Ana", 40, "Pecho");
        Nadador n5 = new Nadador("Luis", 22, "Libre");

        objetos.add(new Pez("Pez 1", Collections.emptyList()));
        objetos.add(new Pez("Pez 2", Arrays.asList(n1)));
        objetos.add(new Pez("Pez 3", Arrays.asList(n1, n2)));
        objetos.add(new Pez("Pez 4", Arrays.asList(n1, n2, n3)));

        objetos.add(new Delfin("Delfin 1", Arrays.asList(n1, n2, n3, n4)));
        objetos.add(new Delfin("Delfin 2", Arrays.asList(n1, n2, n3, n4, n5)));
        objetos.add(new Delfin("Delfin 3", Collections.emptyList()));
        objetos.add(new Delfin("Delfin 4", Arrays.asList(n2)));

        objetos.add(new Buceador("Buceador 1", Arrays.asList(n2, n3)));
        objetos.add(new Buceador("Buceador 2", Arrays.asList(n3, n4, n5)));
        objetos.add(new Buceador("Buceador 3", Arrays.asList(n1, n3, n4, n5)));
        objetos.add(new Buceador("Buceador 4", Arrays.asList(n1, n2, n3, n4, n5)));
    }

    public List<ActividadNadar> getTodos() {
        return objetos;
    }
}
