/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vt10;

/**
 *
 * @author anonimo
 */
public class RobotDante {

    String estatus;
    int velocidad;
    float temperatura;

    void comprobarTemperatura() {
        if (temperatura > 660) {
            estatus = "Volviendo a Casa";
            velocidad = 5;
        }
    }
    void mostrarAtributos() {
        System.out.println("Estatus: " + estatus);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Temperatura: " + temperatura);
 }
    
}