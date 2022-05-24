/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guarda;

/**
 *
 * @author --
 */
public class Main{
    public static void main(String[] args){
        Filho p1 = new Filho("Will");
        Pessoa madrasta = new Pessoa("Mary");
        Pessoa padrasto = new Pessoa("James");
        Pessoa pai = new Pessoa ("Kauffman");
        Pessoa mae = new Pessoa("Dahlia");
        
        System.out.println(padrasto.getNome());
        System.out.println(madrasta.getNome());
        System.out.println(mae.getNome());
        
        
        
        
    } 
    
}
