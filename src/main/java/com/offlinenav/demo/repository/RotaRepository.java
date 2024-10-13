package com.offlinenav.demo.repository;

import com.offlinenav.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RotaRepository extends JpaRepository<Usuario, Long> {
}