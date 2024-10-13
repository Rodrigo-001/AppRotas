package com.offlinenav.demo.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

public class MapasOffline {

    @Id
    private Long id;

    private Long idUsuario;

    @Getter
    @Setter
    private String coordendaCentro;

    @Getter
    @Setter
    private Double raioDeAlcance;
}
