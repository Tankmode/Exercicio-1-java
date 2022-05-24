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
public class main {
    public static void main(String[] args){
        fatura fatur = new fatura();
        fatur.setEstoque(10);
        Estoque teclado = new Estoque(1, 250, "logitech");
        Estoque mouse = new Estoque (3, 50, "multilaser");
        
        fatur.adicionaritem(0, teclado);
        fatur.adicionaritem(1, mouse);
        
        System.out.println("valor total = " +fatur.obtempreco());
    }
}
