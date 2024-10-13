package com.offlinenav.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;

@Entity
@Table(name = "TB_OFFLINENAV_ROTA")
public class Rota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Getter
    @Setter
    String localPartida;
    @Getter
    @Setter
    String localDestino;
    @Getter
    private Double tempoEstimado;
    @Getter
    private Double distancia;

    public Rota() {}

    public Rota(String localPartida, String localDestino, Double tempoEstimado, Double distancia) {
        this.localPartida = localPartida;
        this.localDestino = localDestino;
        this.tempoEstimado = tempoEstimado;
        this.distancia = distancia;
    }
}
