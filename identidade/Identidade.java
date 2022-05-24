/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identidade;

/**
 *
 * @author --
 */
public class Identidade {
    private String nome;
    private String nomemae;
    private String nomepai;
    private String nacionalidade;
    private String genero;
    private String estadocivil;
    private int altura;
    private int peso;
    public Identidade(){ }
    public Identidade (String nome,String nomemae,String nomepai,String nacionalidade,String genero,String estadocivil,int altura,int peso){
        this.nome = nome;
        this.nomemae = nomemae;
        this.nomepai = nomepai;
        this.nacionalidade = nacionalidade;
        this.genero = genero;
        this.estadocivil = estadocivil;
        this.altura = altura;
        this.peso = peso;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNomemae(){
        return nomemae;
    }
    public void setNomemae(String nomemae){
        this.nomemae = nomemae;
    }
    public String getNomepai(){
        return nomepai;
    }
    public void setNomepai(String nomepai){
        this.nomepai = nomepai;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getEstadocivil(){
        return estadocivil;
    }
    public void setEstadocivil(String estadocivil){
        this.estadocivil = estadocivil;
    }
    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    
}
