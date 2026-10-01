package com.trabajo1.actividad.de.nadar.modelo;

import java.util.List;

public interface ActividadNadar extends Sumergible, Flotable, Desplazable {
    String getNombre();
    List<Nadador> getListaNadadores();
}
