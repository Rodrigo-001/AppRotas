package com.offlinenav.demo.repository;

import com.offlinenav.demo.model.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findById(Long id);
    Usuario save(Usuario usuario);
}
