package com.offlinenav.demo.repository;

import com.offlinenav.demo.model.MapasOffline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapasOfflineRepository extends JpaRepository<MapasOffline, Long> {
}
