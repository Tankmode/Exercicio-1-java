/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author --
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       pessoa p1 = new pessoa();
       aluno p2 = new aluno();
       p1.setNome("italo");
       p1.setIdade(7);
       p1.setSexo("masculino");
       p2.addnota();
       p2.getMedia();
       
    }
    
}
