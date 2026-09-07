package com.trabajo1.actividad.de.nadar.controlador;

import com.trabajo1.actividad.de.nadar.modelo.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controlador {
    @GetMapping("/actividades")
    public String listarActividades(Model model) {
        List<ActividadNadar> listaActividades = new ArrayList<>();


        Nadador n1 = new Nadador("Carlos", "Libre");
        Nadador n2 = new Nadador("María", "Espalda");
        Nadador n3 = new Nadador("Juan", "Mariposa");


        listaActividades.add(new Pez("Payaso", n1));
        listaActividades.add(new Pez("Cirujano", n2));
        listaActividades.add(new Pez("Beta", n3));

        listaActividades.add(new Delfin("Flipper", n1));
        listaActividades.add(new Delfin("Bottlenose", n2));
        listaActividades.add(new Delfin("Blue", n3));

        listaActividades.add(new Buceador("Principiante", n1));
        listaActividades.add(new Buceador("Avanzado", n2));
        listaActividades.add(new Buceador("Profesional", n3));

        model.addAttribute("actividades", listaActividades);

        return "vista";
    }
}
