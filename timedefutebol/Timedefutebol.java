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
public class Timedefutebol {
    
    private Jogador[] jogadores;
    private int[] qtdPosicionamento;
    
    public Timedefutebol(int tamanho){
        this.jogadores = new Jogador[tamanho];
        this.qtdPosicionamento = new int[Posicionamento.values().length];
    }
    
    public void definirQtdPosicoes(int n, Posicionamento posicao){
        this.qtdPosicionamento[posicao.getValor()] = n;
    }
    
    public void adicionarJogador(int camisa, Jogador jogador){
        if(camisa < this.jogadores.length){
            if(qtdPosicionamento[jogador.getPosicao().getValor()] > 0){
                this.jogadores[camisa] = jogador;
                qtdPosicionamento[jogador.getPosicao().getValor()]--;
            }
            else System.out.println("não há vagas");     
        }
          else System.out.println("invalido");
    }

    
}
