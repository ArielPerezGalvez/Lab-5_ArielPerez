/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_arielperez;

/**
 *
 * @author ariel
 */
public class Universo {
    private String codigo;
    private String edad;

    public Universo() {
    }

    public Universo(String codigo, String edad) {
        this.codigo = codigo;
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Universo{" + "codigo=" + codigo + ", edad=" + edad + '}';
    }
    
    
    
    
    
}//fin de la clase
