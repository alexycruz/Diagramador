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
public class Clases implements Serializable{
    private String Nombre;
    private ArrayList <Atributos>Atributos = new ArrayList();
    private String PerteneceA;
    private ArrayList <Metodos>Metodos = new ArrayList();
    private ArrayList <Clases> clases_hijas = new ArrayList();
    private String Interfaz_implementada;
    private String Encapsulamiento;
    private String Abstract;

    public Clases(String Nombre, String PerteneceA, String Interfaz_implementada, String Encapsulamiento, String Abstract) {
        this.Nombre = Nombre;
        this.PerteneceA = PerteneceA;
        this.Interfaz_implementada = Interfaz_implementada;
        this.Encapsulamiento =  Encapsulamiento;
        this.Abstract = Abstract;
    }

    public Clases() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Atributos> getAtributos() {
        return Atributos;
    }

    public void setAtributos(ArrayList<Atributos> Atributos) {
        this.Atributos = Atributos;
    }

    public String getPerteneceA() {
        return PerteneceA;
    }

    public void setPerteneceA(String PerteneceA) {
        this.PerteneceA = PerteneceA;
    }

    public ArrayList<Metodos> getMetodos() {
        return Metodos;
    }

    public void setMetodos(ArrayList<Metodos> Metodos) {
        this.Metodos = Metodos;
    }

    public ArrayList<Clases> getClases_hijas() {
        return clases_hijas;
    }

    public void setClases_hijas(ArrayList<Clases> clases_hijas) {
        this.clases_hijas = clases_hijas;
    }

    public String getInterfaz_implementada() {
        return Interfaz_implementada;
    }

    public void setInterfaz_implementada(String Interfaz_implementada) {
        this.Interfaz_implementada = Interfaz_implementada;
    }

    public String getEncapsulamiento() {
        return Encapsulamiento;
    }

    public void setEncapsulamiento(String Encapsulamiento) {
        this.Encapsulamiento = Encapsulamiento;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }
    

    @Override
    public String toString() {
        if ((Nombre.equals(PerteneceA)) && (!Interfaz_implementada.equals("")) && Abstract.equals("")) {
            return Encapsulamiento + " " + Nombre + " " + "implements " +Interfaz_implementada;
        } else if (Nombre.equals(PerteneceA) && Abstract.equals("") && Interfaz_implementada.equals("")){
           return Encapsulamiento + " " + Nombre; 
        } else if (!Nombre.equals(PerteneceA) && Abstract.equals("") && Interfaz_implementada.equals("")){
           return Encapsulamiento + " " + PerteneceA + " " + Nombre;  
        } else if ((Nombre.equals(PerteneceA)) && (!Interfaz_implementada.equals("")) && (!Abstract.equals(""))){
            return Encapsulamiento + " " + Abstract + " " + Nombre + " " + "implements " +Interfaz_implementada;
        } else if ((Nombre.equals(PerteneceA)) && (!Abstract.equals("")) && Interfaz_implementada.equals("")){
            return Encapsulamiento + " " + Abstract + " " + Nombre;
        } else if (!Nombre.equals(PerteneceA) && !Abstract.equals("") && Interfaz_implementada.equals("")){
            return Encapsulamiento + " " + Abstract + " " + PerteneceA + " " + Nombre;
        } else if (!Nombre.equals(PerteneceA) && Abstract.equals("") && !Interfaz_implementada.equals("")){
            return Encapsulamiento + " " + PerteneceA + " " + Nombre + " implements" + Interfaz_implementada;
        } else if(!Nombre.equals(PerteneceA) && !Abstract.equals("") && !Interfaz_implementada.equals("")){
            return Encapsulamiento + " " + Abstract + " " + PerteneceA + " " + Nombre + " implements" + Interfaz_implementada;
        }else{
            return "";
        }
        
    }
    
}
