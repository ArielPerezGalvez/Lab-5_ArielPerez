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
    private String edad;
    private String nombre_region;
    private String cantidad;
    private String peso;
    

    public Criaturas() {
    }

    public Criaturas(String raza, String energia, String edad, String nombre_region, String cantidad, String peso) {
        this.raza = raza;
        this.energia = energia;
        this.edad = edad;
        this.nombre_region = nombre_region;
        this.cantidad = cantidad;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEnergia() {
        return energia;
    }

    public void setEnergia(String energia) {
        this.energia = energia;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre_region() {
        return nombre_region;
    }

    public void setNombre_region(String nombre_region) {
        this.nombre_region = nombre_region;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Criaturas{" + "raza=" + raza + ", energia=" + energia + ", edad=" + edad + ", nombre_region=" + nombre_region + ", cantidad=" + cantidad + ", peso=" + peso + '}';
    }
    
    
    
    
  
    
}
