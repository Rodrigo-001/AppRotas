package com.offlinenav.demo.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;

@Data
@Entity
@Table (name = "TB_OFFLINENAV_USUARIO")
public class UsuarioModel {

    @Id
    Long IdUsuario;
    
    String nome;

    String email;

    String senha;

    List<Long> historicoViagens;

    List<Long> mapasOffline;
}
