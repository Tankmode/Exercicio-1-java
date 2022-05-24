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
public class pessoa {
     protected String nome;
     protected int peso;
     
    public pessoa(String nome, int peso){
        this.peso = peso;
        this.nome = nome;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
