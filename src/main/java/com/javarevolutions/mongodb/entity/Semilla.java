package com.javarevolutions.mongodb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "semilla")
public class Semilla {

    @Column (name= "_id")
    private String id;
    
    @Column (name= "nombre")
    private String nombre;
    
    @Column (name= "url")
    private String url;
    
    @Column (name= "imagen")
    private String imagen;
    
    @Column (name= "precio")
    private String precio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }


}
