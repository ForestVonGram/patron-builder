package co.edu.uniquindio.poo;

import java.util.List;

public class Mago extends Personaje{
    private double inteligencia, sabiduria, energiaMagica;

    public Mago(String nombre, String clasePersonaje, String descripcion, String apodo, double dineroInicial,
                List<String> capacidades, int nivel, double inteligencia, double sabiduria, double energiaMagica){
        
        super(nombre, clasePersonaje, descripcion, apodo, dineroInicial, capacidades, nivel);
        
        assert inteligencia > 0:"La inteligencia no es válida";
        assert sabiduria > 0:"La sabiduría no es válida";
        assert energiaMagica > 0:"La energía mágiva no es válida";
        
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.energiaMagica = energiaMagica;
    }

    public static BuilderMago builder(){
        return new BuilderMago();
    }

    //Gets
    public double getSabiduria() {
        return sabiduria;
    }public double getInteligencia() {
        return inteligencia;
    }public double getEnergiaMagica() {
        return energiaMagica;
    }

    //Setters
    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }public void setSabiduria(double sabiduria) {
        this.sabiduria = sabiduria;
    }public void setEnergiaMagica(double energiaMagica) {
        this.energiaMagica = energiaMagica;
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
