package com.ar;

public class Pelicula {
    private int id;
    private String titulo;
    private String genero;
    private String duracion;
    private String imagen;

    // Constructor vacío necesario para deserialización de JSON
    public Pelicula() {}

    // Constructor con parámetros para inicializar todos los atributos
    public Pelicula(int id, String titulo, String genero, String duracion, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.imagen = imagen;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
