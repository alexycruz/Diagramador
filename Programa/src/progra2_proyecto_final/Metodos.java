/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2_proyecto_final;

import java.io.Serializable;

/**
 *
 * @author Alexy jr
 */
public class Metodos implements Serializable{
    private String Metodo;
    private String Nombre;
    private String Referencia_clase;
    private String Referencia_interfaz;

    public Metodos(String Metodo, String Nombre, String Referencia_clase, String Referencia_interfaz) {
        this.Metodo = Metodo;
        this.Nombre = Nombre;
        this.Referencia_clase = Referencia_clase;
        this.Referencia_interfaz = Referencia_interfaz;
    }

    public Metodos() {
    }

    public String getMetodo() {
        return Metodo;
    }

    public void setMetodo(String Metodo) {
        this.Metodo = Metodo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getReferencia_clase() {
        return Referencia_clase;
    }

    public void setReferencia_clase(String Referencia_clase) {
        this.Referencia_clase = Referencia_clase;
    }

    public String getReferencia_interfaz() {
        return Referencia_interfaz;
    }

    public void setReferencia_interfaz(String Referencia_interfaz) {
        this.Referencia_interfaz = Referencia_interfaz;
    }
    
    @Override
    public String toString() {
        return "Metodo:" + " " + Nombre;
    }
    
    
}
