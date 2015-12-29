/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2_proyecto_final;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alexy jr
 */
public class Interfaces implements Serializable{
    private String Nombre;
    ArrayList<Metodos> metodos = new ArrayList();

    public Interfaces() {
    }

    public Interfaces(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public ArrayList<Metodos> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodos> metodos) {
        this.metodos = metodos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    

    @Override
    public String toString() {
        return "Interfaz: " + Nombre;
    }
    
    
}
