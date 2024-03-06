package co.edu.uniquindio.poo;

import java.util.List;

public class Arquero extends Personaje{
    private String nombre, clasePersonaje, descripcion, apodo;
    private double dineroInicial;
    private List<String> capacidades;
    private int nivel;
    private double destreza, agilidad, precision;

    public Arquero(String nombre, String clasePersonaje, String descripcion, String apodo, double dineroInicial,
                    List<String> capacidades, int nivel, double destreza, double agilidad, double precision){
            
            this.nombre = nombre;
            this.clasePersonaje = clasePersonaje;
            this.descripcion = descripcion;
            this.apodo = apodo;
            this.dineroInicial = dineroInicial;
            this.capacidades = capacidades;
            this.nivel = nivel;
            this.destreza = destreza;
            this. agilidad = agilidad;
            this.precision = precision;
    }

    public static BuilderArquero builder(){
        return new BuilderArquero();
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
    }public double getDestreza() {
        return destreza;
    }public double getAgilidad() {
        return agilidad;
    }public double getPrecision() {
        return precision;
    }
}
