/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_arielperez;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Criaturas {
    private String raza;
    private String energia;
    private int edad;
    private String nombre_region;
    private int cantidad;
    ArrayList<Objetos_magicos> lis = new ArrayList();

    public Criaturas() {
    }

    public Criaturas(String raza, String energia, int edad, String nombre_region, int cantidad) {
        this.raza = raza;
        this.energia = energia;
        this.edad = edad;
        this.nombre_region = nombre_region;
        this.cantidad = cantidad;
    }
    
}
