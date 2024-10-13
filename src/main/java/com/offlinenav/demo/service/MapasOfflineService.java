package com.offlinenav.demo.service;

import com.offlinenav.demo.model.MapasOffline;
import com.offlinenav.demo.repository.MapasOfflineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MapasOfflineService {

    @Autowired
    private MapasOfflineRepository mapasOfflineRepository;

    public List<MapasOffline> getAllMapasOffline() {
        return mapasOfflineRepository.findAll();
    }

    public Optional<MapasOffline> getMapasOfflineById(Long id) {
        return mapasOfflineRepository.findById(id);
    }

    public MapasOffline createMapasOffline(MapasOffline mapasOffline) {
        return mapasOfflineRepository.save(mapasOffline);
    }

    public MapasOffline updateMapasOffline(Long id, MapasOffline mapasOfflineDetails) {
        MapasOffline mapas = mapasOfflineRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        mapas.setCoordendaCentro(mapasOfflineDetails.getCoordendaCentro());
        mapas.setRaioDeAlcance(mapasOfflineDetails.getRaioDeAlcance());

        return mapasOfflineRepository.save(mapas);
    }

    public void deleteMapasOffline(Long id) {
        mapasOfflineRepository.deleteById(id);
    }
}
