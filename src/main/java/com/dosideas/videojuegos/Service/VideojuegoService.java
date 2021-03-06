package com.dosideas.videojuegos.Service;

//import java.util.ArrayList;
import java.util.List;

import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.repository.VideoJuegoRepository;

//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {

    private final VideoJuegoRepository videoJuegoRepository;

    public VideojuegoService(VideoJuegoRepository videoJuegoRepository){
        this.videoJuegoRepository = videoJuegoRepository;
        //tendremos un repositorio que nos permita intereactuar con la BBDD
    }

    public List<Videojuego> buscarPorDistribuidor( int distribuidorId){
        return videoJuegoRepository.buscarPorDistribuidor(distribuidorId);
    }

    public List<Videojuego> buscarDestacados() {

        
        //return videoJuegoRepository.findAll(Sort.by("nombre").ascending());
        return videoJuegoRepository.buscarTodos();

        //lista video juegos mockeados
        /* List<Videojuego> destacados = new ArrayList<>();
        
        Videojuego  juego = new Videojuego();
        juego.setNombre("Fall Out 3");
        juego.setDescripcion("Is a 2008 post-apocalyptic action role-playing open worldvideo game developed by Bethesda Game Studios and published byBethesda Softworks.");
        juego.setImagenUrl("https://images-na.ssl-images-amazon.com/images/I/812u3NvhFUS._AC_SL1500_.jpg");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("Diablo 3");
        juego.setDescripcion("Diablo III is a hack-and-slash action role-playing game developed and published by Blizzard Entertainment as the third installment in the Diablo franchise.");
        juego.setImagenUrl("https://cdn-products.eneba.com/resized-products/URWddcK_350x200_1x-0.jpg");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("Berserk and the Band of the Hawk");
        juego.setDescripcion("Guts (ガッツ, Gattsu) is a warrior who has faced the impossible since he was found beneath his hanging mother by a mercenary's wife.");
        juego.setImagenUrl("https://images-na.ssl-images-amazon.com/images/I/81Q4bP4qCAL._SX342_.jpg");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("Baldurs Gate III");
        juego.setDescripcion("Baldur's Gate is a series of role-playing video games set in the Forgotten Realms Dungeons & Dragons campaign setting.");
        juego.setImagenUrl("https://smartcdkeys.com/image/cache/data/products/baldurs-gate-iii-3/cover/baldurs-gate-iii-3-smartcdkeys-cheap-cd-key-cover-390x580.png");
        destacados.add(juego);

        return destacados; */
        
    }
    
}
