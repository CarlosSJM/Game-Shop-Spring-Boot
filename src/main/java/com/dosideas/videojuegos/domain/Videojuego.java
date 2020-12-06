package com.dosideas.videojuegos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
//@table si la tabla no coincide con la BBDD
public class Videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagenUrl;
    @ManyToOne
    private Distribuidor distribuidor;
    //ojo al llamar clase distrbuidor tb hay que llamar a los setter y getter
    
    /*ManyToOne por defecto busca _id pero podemos cambiarlo 
    @ManyToOne
    @JoinColumn(name="distribuidor_otro_id")
    private Distribuidor distribuidorAdicional; 
    */
    

    //indicamos con anotaciones una serie de de caracteristicas a JPA como tratar Id
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
    this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }
}
