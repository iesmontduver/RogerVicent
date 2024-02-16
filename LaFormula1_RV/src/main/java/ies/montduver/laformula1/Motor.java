/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.montduver.laformula1;

/**
 *
 * @author vicchumil
 */
public class Motor {
    
    String tipo;
    Double cilindrada;
    int potencia;

    public Motor() {
    }

    public Motor(String tipo, Double cilindrada, int potencia) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }
    
    
    //-----------------------------------------------------------------------

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
//-------------------------------------------------------------------

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", cilindrada=" + cilindrada + ", potencia=" + potencia + '}';
    }
   
    }
    
    
    
    
    
    
    

