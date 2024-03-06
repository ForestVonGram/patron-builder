package co.edu.uniquindio.poo;

import java.util.List;

public class Mago extends Personaje{
    private String nombre, clasePersonaje, descripcion, apodo;
    private double dineroInicial;
    private List<String> capacidades;
    private int nivel;
    private double inteligencia, sabiduria, energiaMagica;

    public Mago(String nombre, String clasePersonaje, String descripcion, String apodo, double dineroInicial,
                List<String> capacidades, int nivel, double inteligencia, double sabiduria, double energiaMagica){
        
        this.nombre = nombre;
        this.clasePersonaje = clasePersonaje;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
        this.capacidades = capacidades;
        this.nivel = nivel;
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.energiaMagica = energiaMagica;
    }

    public static BuilderMago builder(){
        return new BuilderMago();
    }

    //Gets
    public String getNombre() {
        return nombre;
    }public String getClasePersonaje() {
        return clasePersonaje;
    }public String getDescripcion() {
        return descripcion;
    }public String getApodo() {
        return apodo;
    }public double getDineroInicial() {
        return dineroInicial;
    }public List<String> getCapacidades() {
        return capacidades;
    }public int getNivel() {
        return nivel;
    }public double getSabiduria() {
        return sabiduria;
    }public double getInteligencia() {
        return inteligencia;
    }public double getEnergiaMagica() {
        return energiaMagica;
    }

    //Habilidades
    public double bolaFuego() {
        return energiaMagica*1.20;
    }
    public double rayoElectrico() {
        return inteligencia*1.30;
    }
    public double hechizoCuracion() {
        return sabiduria*1.15;
    }
}
