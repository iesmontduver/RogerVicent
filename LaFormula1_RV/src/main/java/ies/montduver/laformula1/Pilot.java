/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.montduver.laformula1;

/**
 *
 * @author vicchumil
 */
public class Pilot {
    
    String nom;
    Escuderia escuderia;
    int numero;
    int punts;
    Double sou;

    public Pilot(String nom, Escuderia Escuderia, int numero) {
        this.nom = nom;
        this.escuderia = Escuderia;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public int getNumero() {
        return numero;
    }

    public int getPunts() {
        return punts;
    }

    public Double getSou() {
        return sou;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }

    public void setSou(Double sou) {
        this.sou = sou;
    }
    
    
    
    
}
