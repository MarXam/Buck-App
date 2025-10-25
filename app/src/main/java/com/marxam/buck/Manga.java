package com.marxam.buck;

public class Manga {

    private String Nombre;
    private String Descripcion;
    private int ImagenManga;

    public Manga(String nombre, String descripcion, int imagenManga) {
        Nombre = nombre;
        Descripcion = descripcion;
        ImagenManga = imagenManga;
    }

    public String getNombre() {
        return Nombre;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public int getImagenManga() {
        return ImagenManga;
    }
}
