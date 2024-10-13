package com.offlinenav.demo.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

public class Rota {

    @Id
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
