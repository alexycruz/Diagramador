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
public class Llave_primaria implements Serializable{
    String Nombre;
    ArrayList<Campos> campos = new ArrayList();
    String Codigo;

    public Llave_primaria() {
    }

    public Llave_primaria(String Nombre, String Codigo) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Campos> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campos> campos) {
        this.campos = campos;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    
    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
