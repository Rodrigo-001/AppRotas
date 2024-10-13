package com.offlinenav.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "TB_OFFLINENAV_USUARIO")
public class Usuario {

    @Id
    private Long id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String senha;

    @Getter
    @Setter
    private List historicoViagens;

    @Getter
    @Setter
    private List mapasBaixados;

    public Usuario() {}

    public Usuario(String nome, String email, List historicoViagens, List mapasBaixados) {
        this.nome = nome;
        this.email = email;
        this.historicoViagens = historicoViagens;
        this.mapasBaixados = mapasBaixados;
    }
}
