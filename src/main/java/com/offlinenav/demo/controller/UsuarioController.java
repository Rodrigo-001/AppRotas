package com.offlinenav.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.offlinenav.demo.model.UsuarioModel;
import com.offlinenav.demo.service.UsuarioService;
import com.offlinenav.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository UsuarioRepository;

    @GetMapping("/{id}")
    public UsuarioModel buscarId(@PathVariable int id) {
        return service.getUsuario(id);
    }
    
    
}
