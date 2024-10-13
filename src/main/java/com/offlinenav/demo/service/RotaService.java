package com.offlinenav.demo.service;

import com.offlinenav.demo.model.Rota;
import com.offlinenav.demo.model.Usuario;
import com.offlinenav.demo.repository.RotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RotaService {

    @Autowired
    private RotaRepository rotaRepository;

    public List<Rota> getRotas() {
        return rotaRepository.findAll();
    }

    public Optional<Rota> getRotaById(Long id) {
        return rotaRepository.findById(id);
    }

    public Rota createRota(Rota rota) {
        return rotaRepository.save(rota);
    }

    public Rota updateRota(Long id, Rota rota) {
        Rota rota = rotaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        rota.getLocalPartida(Rota.getLocalPartida());
        rota.setLocalDestino(rota.getLocalDestino());

        return rotaRepository.save(rota);
    }

    public void deleteRota(Long id) {
        rotaRepository.deleteById(id);
    }
}
