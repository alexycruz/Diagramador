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
public class Llave_foranea implements Serializable{
    ArrayList<Campos> campos = new ArrayList();
    String Nombre;
    String Codigo;

    public Llave_foranea(String Nombre, String Codigo) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
    }

    public Llave_foranea() {
    }

    public ArrayList<Campos> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campos> campos) {
        this.campos = campos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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
