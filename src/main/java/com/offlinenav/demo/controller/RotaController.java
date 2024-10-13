package com.offlinenav.demo.controller;

import com.offlinenav.demo.model.Rota;
import com.offlinenav.demo.service.RotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rota")
public class RotaController {

    @Autowired
    private RotaService rotaService;

    @GetMapping
    public List<Rota> getRotas() {
        return rotaService.getRotas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rota> getRotaById(@PathVariable Long id) {
        Optional<Rota> rota = rotaService.getRotaById(id);
        if (rota.isPresent()) {
            return ResponseEntity.ok(rota.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Rota createRota(@RequestBody Rota rota) {
        return rotaService.createRota(rota);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rota> updateRota(@PathVariable Long id, @RequestBody Rota rota) {
        try {
            Rota updatedRota = rotaService.updateRota(id, rota);
            return ResponseEntity.ok(updatedRota);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRota(@PathVariable Long id) {
        rotaService.deleteRota(id);
        return ResponseEntity.noContent().build();
    }
}
