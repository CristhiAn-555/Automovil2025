/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.automovil.Automovil1;

import ec.edu.espoch.automovil.Automovil.clases.TipoAutomovil;
import ec.edu.espoch.automovil.Automovil.clases.TipoColor;
import ec.edu.espoch.automovil.Automovil.clases.TipoCombustible;

/**
 *
 * @author PERSONAL
 */
public class Automovill {
     private String marca;
    private int modelo;
    private String motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsiento;
    private double velocidadMaxima;
    private TipoColor color;
    private double velocidadActual;
    private int añoFabricacion;

    public Automovill() {
    }

    public Automovill(String marca, int modelo, String motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsiento, double velocidadMaxima, TipoColor color, double velocidadActual, int añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsiento = cantidadAsiento;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
        this.añoFabricacion = añoFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsiento() {
        return cantidadAsiento;
    }

    public void setCantidadAsiento(int cantidadAsiento) {
        this.cantidadAsiento = cantidadAsiento;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    
  
    

    public void acelerar(double incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            System.out.println("Has sobrepasado el límite máximo de velocidad: " + velocidadMaxima + " km/h.");
        } else {
            velocidadActual += incremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h.");
        }
    }

    public void tiempoEstimado() {
        if (velocidadActual > 0) {
            double tiempo = velocidadActual / velocidadActual;
            int horas = (int) tiempo;
            int minutos = (int) ((tiempo - horas) * 60);
            System.out.println("Tiempo estimado de llegada: " + horas + " horas y " + minutos + " minutos.");
        } else {
            System.out.println("El auto está detenido");
        }
        System.out.println("");
    }

    public void desacelerar(double decremento) {
        if (velocidadActual - decremento < 0) {
            System.out.println("No es posible desacelerar más");
        } else {
            velocidadActual -= decremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h.");
        }
    }

    public void frenar() {
        if (velocidadActual > 0) {
            System.out.println("Frenando...");
            velocidadActual = 0;
            System.out.println("El automóvil se ha detenido. Velocidad actual: " + velocidadActual + " km/h.");
        } else {
            System.out.println("El automóvil ya está detenido.");
        }
    }

    public void mostrarAtributos() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " L");
        System.out.println("La fecha año de fabricacion: "+ añoFabricacion);
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Tipo de Automóvil: " + tipoAutomovil);
        System.out.println("Número de Puertas: " + numeroPuertas);
        System.out.println("Cantidad de Asientos: " + cantidadAsiento);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");

    }

}


    



