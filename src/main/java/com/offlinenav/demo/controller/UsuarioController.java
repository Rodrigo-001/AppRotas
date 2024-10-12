package com.offlinenav.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.offlinenav.demo.model.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.*;



@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository UsuarioRepository;

    @GetMapping("/{id}")
    public Usuario buscarId(@PathVariable int id) {
        return service.getUsuario(id);
    }
    
    
}
