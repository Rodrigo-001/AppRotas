package com.offlinenav.demo.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor  // Necessário para o Spring criar o objeto a partir do JSON
@AllArgsConstructor
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
}
