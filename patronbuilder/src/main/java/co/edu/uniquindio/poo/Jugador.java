package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Jugador{
    private BuilderPersonaje builder;
    private List<Personaje> listaPersonajes;

    public Jugador(BuilderPersonaje builder){
        this.builder = builder;
        this.listaPersonajes = new ArrayList<>();
    }

    public BuilderPersonaje getBuilder() {
        return builder;
    }public List<Personaje> getListaPersonajes() {
        return listaPersonajes;
    }

    //Aquí va lo del director
}
