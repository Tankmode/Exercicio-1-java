/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

import java.util.Scanner;

/**
 *
 * @author --
 */
public class Teste {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String poligono = in.nextLine();
        
        double dimensao = in.nextDouble();
        
        poligono = poligono.toUpperCase();
        
        if(poligono.equals("QUADRADO")){
            Quadrado q = new Quadrado(dimensao);
            System.out.println(q.area());
        }
        else if(poligono.equals("CIRCULO")){
            Circulo c = new Circulo(dimensao);
            System.out.println(c.area());
        }
        else {
            System.out.println("input invalido teste novamente");
        }
    }
       
    
}
