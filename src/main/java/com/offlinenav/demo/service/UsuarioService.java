package com.offlinenav.demo.service;

import com.offlinenav.demo.model.Usuario;
import com.offlinenav.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsers() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getUserById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario createUser(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUser(Long id, Usuario userDetails) {
        Usuario user = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setNome(userDetails.getNome());
        user.setEmail(userDetails.getEmail());

        return usuarioRepository.save(user);
    }

    public void deleteUser(Long id) {
        usuarioRepository.deleteById(id);
    }
}
