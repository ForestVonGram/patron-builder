package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Jugador{
    private List<Personaje> listaPersonajes;

    public Jugador(){
        this.listaPersonajes = new ArrayList<>();
    }

    public List<Personaje> getListaPersonajes() {
        return listaPersonajes;
    }

    public void constructMago(String nombre, String clasePersonaje, String descripcion, String apodo, double dineroInicial,
    List<String> capacidades, int nivel, double inteligencia, double sabiduria, double energiaMagica){
        BuilderMago builderMago = new BuilderMago();
        builderMago.nombre(nombre);
        builderMago.clasePersonaje(clasePersonaje);
        builderMago.descripcion(descripcion);
        builderMago.apodo(apodo);
        builderMago.dineroInicial(dineroInicial);
        builderMago.capacidades(capacidades);
        builderMago.nivel(nivel);
        builderMago.inteligencia(inteligencia);
        builderMago.sabiduria(sabiduria);
        builderMago.energiaMagica(energiaMagica);
        adicionarPersonaje(builderMago.build());
    }

    public void constructGuerrero(String nombre, String clasePersonaje, String descripcion, String apodo, double dineroInicial,
    List<String> capacidades, int nivel, double fuerza, double resistencia, double vitalidad){
        BuilderGuerrero builderGuerrero = new BuilderGuerrero();
        builderGuerrero.nombre(nombre);
        builderGuerrero.clasePersonaje(clasePersonaje);
        builderGuerrero.descripcion(descripcion);
        builderGuerrero.apodo(apodo);
        builderGuerrero.dineroInicial(dineroInicial);
        builderGuerrero.capacidades(capacidades);
        builderGuerrero.nivel(nivel);
        builderGuerrero.fuerza(fuerza);
        builderGuerrero.resistencia(resistencia);
        builderGuerrero.vitalidad(vitalidad);
        adicionarPersonaje(builderGuerrero.build());
    }

    public void constructArquero(String nombre, String clasePersonaje, String descripcion, String apodo, double dineroInicial,
    List<String> capacidades, int nivel, double destreza, double agilidad, double precision){
        BuilderArquero builderArquero = new BuilderArquero();
        builderArquero.nombre(nombre);
        builderArquero.clasePersonaje(clasePersonaje);
        builderArquero.descripcion(descripcion);
        builderArquero.apodo(apodo);
        builderArquero.dineroInicial(dineroInicial);
        builderArquero.capacidades(capacidades);
        builderArquero.nivel(nivel);
        builderArquero.destreza(destreza);
        builderArquero.agilidad(agilidad);
        builderArquero.precision(precision);
        adicionarPersonaje(builderArquero.build());
    }

    public void adicionarPersonaje(Personaje personaje){
        assert personaje != null;
        assert !listaPersonajes.contains(personaje);
        listaPersonajes.add(personaje);
    }
}
