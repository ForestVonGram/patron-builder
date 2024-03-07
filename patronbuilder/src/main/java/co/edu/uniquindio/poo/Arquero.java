package co.edu.uniquindio.poo;

import java.util.List;

public class Arquero extends Personaje{
    private double destreza, agilidad, precision;

    public Arquero(String nombre, String clasePersonaje, String descripcion, String apodo, double dineroInicial,
                    List<String> capacidades, int nivel, double destreza, double agilidad, double precision){
            
        super(nombre, clasePersonaje, descripcion, apodo, dineroInicial, capacidades, nivel);
        
        assert destreza > 0:"La destreza no es válida";
        assert agilidad > 0:"La agilidad no es válida";
        assert precision > 0:"La precisión no es válida";
        
        this.destreza = destreza;
        this.agilidad = agilidad;
        this.precision = precision;
    }

    public static BuilderArquero builder(){
        return new BuilderArquero();
    }

    //Getters
    public double getDestreza() {
        return destreza;
    }public double getAgilidad() {
        return agilidad;
    }public double getPrecision() {
        return precision;
    }

    //Setters
    public void setDestreza(double destreza) {
        this.destreza = destreza;
    }public void setAgilidad(double agilidad) {
        this.agilidad = agilidad;
    }public void setPrecision(double precision) {
        this.precision = precision;
    }

    //Habilidades
    public double disparoRapido() {
        return precision*1.12;
    }
    public double flechaVenenosa() {
        return destreza*1.25;
    }
    public double tiroCertero() {
        return precision*0.75 + destreza*0.9;
    }
}
