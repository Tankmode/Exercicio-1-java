/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author --
 */
public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); 
        primeiraConta.saldo = 300;
        primeiraConta.titular = "Neji"; 

        System.out.println("saldo da primeira: " + primeiraConta.saldo);
        System.out.println("nome " + primeiraConta.titular);

        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);
        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta " + segundaConta.saldo); 

        System.out.println(primeiraConta.saldo);
        
        if(primeiraConta == segundaConta) {
            System.out.println("é a mesma conta");                    
        }
        else {
            System.out.println("contas diferentes");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    } 
}
