/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachorro;

/**
 *
 * @author --
 */
public class Cachorro {
        public String nome;
        public void late()
        {
            System.out.println(this.getNome());
        }
        public String getNome(){
            return this.nome;
        }
        public void setNome (String nome){
            this.nome = nome;
        }
    
    public static void main(String[] args) {
        Cachorro bingo;
        Cachorro chokito;
        bingo = new Cachorro();
        chokito = new Cachorro();
        bingo.setNome("bingo");
        chokito.setNome("chokito");
        bingo.late();
        chokito.late();
       
    }
    
}
