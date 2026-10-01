package com.trabajo1.actividad.de.nadar.controlador;

import com.trabajo1.actividad.de.nadar.modelo.*;
import com.trabajo1.actividad.de.nadar.Repositories.NadarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class Controlador {

    @Autowired
    private NadarRepository repository;

    @GetMapping("/peticion1")
    public String peticion1(Model model) {
        String nombresUnidos = repository.getTodos().stream()
                .map(ActividadNadar::getNombre)
                .collect(Collectors.joining(", "));

        model.addAttribute("resultado", nombresUnidos);
        return "peticion1";
    }

    @GetMapping("/peticion2")
    public String peticion2(Model model) {
        IntSummaryStatistics stats = repository.getTodos().stream()
                .flatMap(obj -> obj.getListaNadadores().stream())
                .mapToInt(Nadador::getEdad)
                .summaryStatistics();

        model.addAttribute("conteo", stats.getCount());
        model.addAttribute("suma", stats.getSum());
        model.addAttribute("promedio", stats.getAverage());
        model.addAttribute("minimo", stats.getMin());
        model.addAttribute("maximo", stats.getMax());

        return "peticion2";
    }

    @GetMapping("/peticion3")
    public String peticion3(Model model) {
        List<String> estilos = repository.getTodos().stream()
                .flatMap(obj -> obj.getListaNadadores().stream())
                .map(Nadador::getEstilo)
                .distinct()
                .collect(Collectors.toList());

        model.addAttribute("estilos", estilos);
        return "peticion3";
    }

    @GetMapping("/peticion4")
    public String peticion4(Model model) {
        boolean hayMayorA35 = repository.getTodos().stream()
                .flatMap(obj -> obj.getListaNadadores().stream())
                .anyMatch(n -> n.getEdad() > 35);

        boolean hayEstiloPecho = repository.getTodos().stream()
                .flatMap(obj -> obj.getListaNadadores().stream())
                .anyMatch(n -> "Pecho".equals(n.getEstilo()));

        boolean ningunMenorA10 = repository.getTodos().stream()
                .flatMap(obj -> obj.getListaNadadores().stream())
                .noneMatch(n -> n.getEdad() < 10);

        model.addAttribute("hayMayorA35", hayMayorA35);
        model.addAttribute("hayEstiloPecho", hayEstiloPecho);
        model.addAttribute("ningunMenorA10", ningunMenorA10);
        return "peticion4";
    }

    @GetMapping("/peticion5")
    public String peticion5(Model model) {
        Nadador mayorEdad = repository.getTodos().stream()
                .flatMap(obj -> obj.getListaNadadores().stream())
                .max((n1, n2) -> Integer.compare(n1.getEdad(), n2.getEdad()))
                .orElse(null);

        model.addAttribute("nadador", mayorEdad);
        return "peticion5";
    }
}
