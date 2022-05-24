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
public class Quadrado {
    private double aresta;
    
    public Quadrado(double aresta){
        this.aresta = aresta;
    }
    
    public double area(){
        return this.aresta * this.aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    
}
