/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

/**
 *
 * @author --
 */
public class Circulo {
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double area(){
        return Math.PI * this.raio * this.raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
}
