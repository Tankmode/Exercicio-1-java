/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

/**
 *
 * @author --
 */
public class Estoque {

   protected int quantidade;
   protected double precounitario;
   protected String nome;
   
   public Estoque(){}
   
   public Estoque(int quantidade, double precounitario, String nome){
       this.quantidade = quantidade;
       this.precounitario = precounitario;
       this.nome = nome;
   }
   
   public int getQuantidade(){
       return quantidade;
   }
   public void setQuantidade(int quantidade){
       this.quantidade = quantidade;
   }
   public double getPrecounitario(){
       return precounitario;
   }
   public void setPrecounitario(double precounitario){
       this.precounitario = precounitario;
   }
   public String getNome(){
       return nome;
   }
   public void setNome(String nome){
       this.nome = nome;
   }
}
