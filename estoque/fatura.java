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
public class fatura {

    protected Estoque[] Itens;
    protected String nome;
    protected String cpf;
    
    public fatura(){}
    
    public fatura(int tamanho){
        Itens = new Estoque[10];
    }
    public void setEstoque(int tamanho){
        this.Itens = new Estoque[tamanho];
    }
    public Estoque[] getItens(){
        return Itens;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public double obtempreco() {
        double valorfatura = 0;

        for(int i = 0; i < Itens.length; i++) {
            if(Itens[i] != null){
            valorfatura += Itens[i].getQuantidade() * Itens[i].getPrecounitario();
            }
        }
        return valorfatura;
    }

    public void adicionaritem(int posicao, Estoque item){
        this.Itens[posicao]= item;
    }
}
    