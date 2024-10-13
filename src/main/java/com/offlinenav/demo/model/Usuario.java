package com.offlinenav.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TB_OFFLINENAV_USUARIO")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @JdbcTypeCode(SqlTypes.JSON)
    private List historicoViagens;

    @Getter
    @Setter
    @JdbcTypeCode(SqlTypes.JSON)
    private List mapasBaixados;

    public Usuario() {}

    public Usuario(String nome, String email, List historicoViagens, List mapasBaixados) {
        this.nome = nome;
        this.email = email;
        this.historicoViagens = historicoViagens;
        this.mapasBaixados = mapasBaixados;
    }
}
