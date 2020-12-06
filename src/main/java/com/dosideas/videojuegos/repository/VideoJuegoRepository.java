package com.dosideas.videojuegos.repository;

import java.util.List;

import com.dosideas.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VideoJuegoRepository extends JpaRepository<Videojuego,Integer> {

    //quesry en JPQL
    @Query(value ="select * from VideoJuego v order by v.nombre", nativeQuery = true)   
    List<Videojuego> buscarTodos();


    @Query(value ="select * from VideoJuego v where v.distribuidor_id = ?1 order by v.nombre", nativeQuery = true)
    List<Videojuego> buscarPorDistribuidor(int distribuidorId);
    
}
