/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.montduver.laformula1;

/**
 *
 * @author vicchumil
 */
public class Xasis {
    
    String marca;
    String modelo;
    String color;
    Double pes;
    Double llarg;
    Double ample;

    public Xasis(String marca, String modelo, String color, Double pes, Double llarg, Double ample) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.pes = pes;
        this.llarg = llarg;
        this.ample = ample;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public Double getPes() {
        return pes;
    }

    public Double getLlarg() {
        return llarg;
    }

    public Double getAmple() {
        return ample;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPes(Double pes) {
        this.pes = pes;
    }

    public void setLlarg(Double llarg) {
        this.llarg = llarg;
    }

    public void setAmple(Double ample) {
        this.ample = ample;
    }

    @Override
    public String toString() {
        return "Xasis{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", pes=" + pes + ", llarg=" + llarg + ", ample=" + ample + '}';
    }
    
    
    
    
    
}
