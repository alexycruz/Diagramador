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
public class Tablas implements Serializable{

    String Nombre;
    String Codigo;
    ArrayList<Campos> campos = new ArrayList();
    ArrayList<Llave_primaria> p_k = new ArrayList();
    ArrayList<Llave_foranea> f_k = new ArrayList();

    public Tablas() {
    }

    public Tablas(String Nombre ,String Codigo) {
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

    public ArrayList<Llave_primaria> getP_k() {
        return p_k;
    }

    public void setP_k(ArrayList<Llave_primaria> p_k) {
        this.p_k = p_k;
    }

    public ArrayList<Llave_foranea> getF_k() {
        return f_k;
    }

    public void setF_k(ArrayList<Llave_foranea> f_k) {
        this.f_k = f_k;
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
