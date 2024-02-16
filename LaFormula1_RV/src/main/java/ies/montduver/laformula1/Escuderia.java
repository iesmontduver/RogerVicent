/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.montduver.laformula1;

/**
 *
 * @author vicchumil
 */
public class Escuderia {
    
    String nom;
    Double pressupost;
    int punts;

    public Escuderia() {
        this.nom = Leer.leerTexto("Digues el nom de la escuderia");
        this.pressupost = Leer.leerDouble("Dis-me el pressupost de la escuderia");
    }

    public String getNom() {
        return nom;
    }

    public Double getPressupost() {
        return pressupost;
    }

    public int getPunts() {
        return punts;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPressupost(Double pressupost) {
        this.pressupost = pressupost;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }
    
    
    
}
