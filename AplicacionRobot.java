/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vt10;

/**
 *
 * @author anonimo
 */
public class AplicacionRobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RobotDante dante = new RobotDante();
        
        dante.estatus = "explorando";
        dante.velocidad = 2;
        dante.temperatura = 510;
        dante.mostrarAtributos();
        System.out.println("Incrementando velocidad a 3.");
        dante.velocidad = 3;
        dante.mostrarAtributos();
        System.out.println("Cambiando temperatura a 670.");
        dante.temperatura = 670;
        dante.mostrarAtributos();
        System.out.println("Comprobando la temperatura.");
        dante.comprobarTemperatura();
        dante.mostrarAtributos();
    }
}
