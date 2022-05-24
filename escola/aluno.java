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
public class aluno extends pessoa {
    private int nota1;
    private int nota2;
    public void addnota()
    {
        nota1 = 7;
        nota2 = 5;
    }
    public double getMedia(){
        double resultado;
        resultado = (nota1 + nota2)/2;
        if(resultado >= 5)
        {
            System.out.println("apr " + resultado);
        }
        else{
            System.out.println("rep " + resultado);
        }
        return resultado;
    }    
}
