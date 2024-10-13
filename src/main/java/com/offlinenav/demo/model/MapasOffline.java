package com.offlinenav.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;

@Entity
@Table(name = "TB_OFFLINENAV_MAPASOFFLINE")
public class MapasOffline implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idUsuario;

    @Getter
    @Setter
    private String coordendaCentro;

    @Getter
    @Setter
    private Double raioDeAlcance;
}
