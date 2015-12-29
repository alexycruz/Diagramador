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
public class Atributos implements Serializable{
    private String Nombre;
    private String Visibilidad;
    private String Tipo;
    private String Referencia_clase;
    
    public Atributos() {
    }

    public Atributos(String Nombre, String Visibilidad, String Tipo, String Referencia_clase) {
        this.Nombre = Nombre;
        this.Visibilidad = Visibilidad;
        this.Tipo = Tipo;
        this.Referencia_clase = Referencia_clase;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getVisibilidad() {
        return Visibilidad;
    }

    public void setVisibilidad(String Visibilidad) {
        this.Visibilidad = Visibilidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getReferencia_clase() {
        return Referencia_clase;
    }

    public void setReferencia_clase(String Referencia_clase) {
        this.Referencia_clase = Referencia_clase;
    }
    

    @Override
    public String toString() {
        return Visibilidad + " " + Tipo + " " + Nombre;
    }
    
    
    
}
