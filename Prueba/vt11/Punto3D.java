/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vt11;

import java.awt.*;

/**
 *
 * @author anonimo
 */
public class Punto3D extends Point {

    public int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void move(int x, int y, int z) {
        this.z = z;
        super.move(x, y);
    }

    public void translate(int x, int y, int z) {
        this.z += z;
        super.translate(x, y);
    }
}
