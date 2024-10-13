package com.offlinenav.demo.controller;

import com.offlinenav.demo.model.MapasOffline;
import com.offlinenav.demo.model.Usuario;
import com.offlinenav.demo.service.MapasOfflineService;
import com.offlinenav.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mapasOffline")
public class MapasOfflineController {

    @Autowired
    private MapasOfflineService mapasOfflineService;

    @GetMapping
    public List<MapasOffline> getAllMapasOffline() {
        return mapasOfflineService.getAllMapasOffline();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MapasOffline> getMapasOfflineById(@PathVariable Long id) {
        Optional<MapasOffline> mapas = mapasOfflineService.getMapasOfflineById(id);
        if (mapas.isPresent()) {
            return ResponseEntity.ok(mapas.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public MapasOffline createMapasOffline(@RequestBody MapasOffline mapasOffline) {
        return mapasOfflineService.createMapasOffline(mapasOffline);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MapasOffline> updateMapasOffline(@PathVariable Long id, @RequestBody MapasOffline mapasOfflineDetails) {
        try {
            MapasOffline updatedMapasOffline = mapasOfflineService.updateMapasOffline(id, mapasOfflineDetails);
            return ResponseEntity.ok(updatedMapasOffline);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMapasOffline(@PathVariable Long id) {
        mapasOfflineService.deleteMapasOffline(id);
        return ResponseEntity.noContent().build();
    }
}
