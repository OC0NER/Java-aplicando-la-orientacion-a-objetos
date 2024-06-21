package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Favoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Igualito a mi apa");
        miCancion.setArtista("Fuerza Regida");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Jordi Wild");
        miPodcast.setTitulo("The Wild Project");

        for (int i = 0; i < 5000; i++) {
            miCancion.meGusta();
        }
        //Cancion
        for (int i = 0; i < 500; i++) {
            miCancion.reproduce();
        }
        // Podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 500; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de likes: " + miCancion.getTotalDeMeGusta());

        Favoritos favoritos = new Favoritos();
        favoritos.adicione(miCancion);
        favoritos.adicione(miPodcast);
    }
}
