/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timedefutebol;

/**
 *
 * @author --
 */
public enum Posicionamento {
    GOLEIRO(0), ZAGUEIRO(1), LATERAL(2), MEIA(3), ATACANTE(4);
    
    private int valor;
    
    Posicionamento(int valor){
    this.valor = valor;
}

    public int getValor() {
        return valor;
    }
    
}
