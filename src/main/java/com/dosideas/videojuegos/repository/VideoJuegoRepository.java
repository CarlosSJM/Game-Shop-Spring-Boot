package com.dosideas.videojuegos.repository;

import com.dosideas.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoJuegoRepository extends JpaRepository<Videojuego,Integer> {
    
    
}
