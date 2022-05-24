/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microbus;

/**
 *
 * @author --
 */
public class Microbus{
    
     protected int capacidadepessoa = 5;
     protected int capacidadepeso = 500;
     protected int pesoatual = 0;
     protected int passagens = 0;

    public static void main(String[] args){
        
        Microbus p0 = new Microbus();
        
         pessoa p1 = new pessoa("italo",70);
         
         p0.adicionarPessoa(p1);
         
         pessoa p2 = new pessoa("eurico",60);

         p0.adicionarPessoa(p2);
         
         pessoa p3 = new pessoa("paulo",30);
         
         p0.adicionarPessoa(p3);
                 
         pessoa p4 = new pessoa("lisca",65);
        
         p0.adicionarPessoa(p4);
         
         pessoa p5 = new pessoa("GB",75);
        
         p0.adicionarPessoa(p5);
         
         pessoa p6 = new pessoa("Paula",50);
         
         p0.adicionarPessoa(p6);
         
    }
    public void adicionarPessoa(pessoa p){
           if (pesoatual + p.getPeso() <= capacidadepeso && passagens < capacidadepessoa){
               pesoatual += p.getPeso();
               passagens++;
               
           }
           else{
               System.out.println("ja está cheio");
           }
     }
}
