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
public class Campos implements Serializable{
    String Nombre;
    String Referencia_tabla;
    
    public Campos() {
    }

    public Campos(String Nombre, String Referencia_tabla) {
        this.Nombre = Nombre;
        this.Referencia_tabla = Referencia_tabla;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getReferencia_tabla() {
        return Referencia_tabla;
    }

    public void setReferencia_tabla(String Referencia_tabla) {
        this.Referencia_tabla = Referencia_tabla;
    }
    

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
