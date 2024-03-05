package org.example;
import java.util.List;

public class Mago extends Personaje {
    private double inteligencia;
    private double sabiduria;
    private double energiaMagica;

    public Mago(String nombre, String tipo, String descriçion, String apodo, double dineroInicial, List<String> capacidades
                , int nivel, double inteligencia, double sabiduria, double energiaMagica){
        super(nombre, clasePersonaje, descripcion, apodo, dineroInicial, capacidades, nivel);

        assert inteligencia > 0;
        assert sabiduria > 0.0;
        assert energiaMagica > 0;

        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.energiaMagica = energiaMagica;
    }

    public double getEnergiaMagica() {
        return energiaMagica;
    }public double getSabiduria() {
        return sabiduria;
    }public double getInteligencia() {
        return inteligencia;
    }

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
