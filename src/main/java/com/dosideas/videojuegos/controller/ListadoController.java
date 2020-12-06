package com.dosideas.videojuegos.controller;

import java.util.List;

import com.dosideas.videojuegos.Service.VideojuegoService;
import com.dosideas.videojuegos.domain.Videojuego;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
    //spring funciona inyectando dependencias

    private final VideojuegoService videojuegoService;

    public ListadoController( VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
        
    }

    @RequestMapping("/")
    public String ListarVideojuegos(Model model){
        //Spring nos pasa un model al cual le vamos a poder ir agregando todos los objetos que querramos que lleguen a la vista
        List<Videojuego> destacados = videojuegoService.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        //System.out.println("videojuegos");
        

        return "listado";
    }
    
}
