/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.montduver.laformula1;

/**
 *
 * @author vicchumil
 */
public class Circuit {
    
    String nombre;
    String pais;
    String ciudad;
    int longitud;
    int numVoltes;
    int record;

    public Circuit(String nombre, String pais, String ciudad, int longitud, int numVoltes) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.longitud = longitud;
        this.numVoltes = numVoltes;
        this.record = record;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getLongitud() {
        return longitud;
    }

    public int getNumVoltes() {
        return numVoltes;
    }

    public int getRecord() {
        return record;
    }

   //---------------------------------------------------------------------------------------------------- 
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setNumVoltes(int numVoltes) {
        this.numVoltes = numVoltes;
    }

    public void setRecord(int record) {
        this.record = record;
    }
    
    
    
    
}
