package com.aluracursos.radioalura.modelos;

public class Favoritos {

    public void adicione(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + " No es tan popular");
        }
    }
}
