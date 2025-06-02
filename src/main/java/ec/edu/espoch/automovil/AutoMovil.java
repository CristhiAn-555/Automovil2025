/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.automovil;



import ec.edu.espoch.automovil.Automovil.clases.TipoAutomovil;
import ec.edu.espoch.automovil.Automovil.clases.TipoColor;
import ec.edu.espoch.automovil.Automovil.clases.TipoCombustible;
import ec.edu.espoch.automovil.Automovil1.Automovill;

/**
 *
 * @author PERSONAL
 */
public class AutoMovil {

    public static void main(String[] args) {
    
        Automovill auto = new Automovill("Mazda", 200, "kmt", TipoCombustible.BIOEDIESEL, TipoAutomovil.COMPACTO, 2, 2004, 55, TipoColor.ROJO, 0, 2004);

        auto.setVelocidadActual(100);
        auto.mostrarAtributos();
        auto.tiempoEstimado();
        auto.acelerar(20);

        auto.desacelerar(50);

        auto.frenar();

       
    
    }
}
