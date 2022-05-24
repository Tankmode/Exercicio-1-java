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
public class Jogador {
    private String nome;
    private Posicionamento posicao;
    
    public Jogador(String nome, Posicionamento posicao){
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Posicionamento getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicionamento posicao) {
        this.posicao = posicao;
    }
    
    
    
}
