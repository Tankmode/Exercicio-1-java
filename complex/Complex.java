/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author --
 */
public class Complex {

private double parteReal, parteReal1, parteReal2;
private double parteImaginaria, parteImaginaria1, parteImaginaria2;

public Complex(double parteReal1, double parteImaginaria1, 
        double parteReal2, double parteImaginaria2) {
    
    this.parteReal1 = parteReal1;
    this.parteImaginaria1 = parteImaginaria1;
    this.parteReal2 = parteReal2;
    this.parteImaginaria2 = parteImaginaria2;        
    
}

public Complex() {
    
    parteReal1 = 5;
    parteImaginaria1 = 10;
    parteReal2 = 3;
    parteImaginaria2 = 2;
    
}

public void adicao() {
    
    parteReal = parteReal1 + parteReal2;
    parteImaginaria = parteImaginaria1 + parteImaginaria2;
    
    System.out.printf("(%.1f + %.1fi) + (%.1f + %.1fi) = (%.1f + %.1fi)\n",
            parteReal1, parteImaginaria1, parteReal2, parteImaginaria2,
            parteReal, parteImaginaria);
    
}

public void subtracao() {
    
    parteReal = parteReal1 - parteReal2;
    parteImaginaria = parteImaginaria1 - parteImaginaria2;
    
    System.out.printf("(%.1f + %.1fi) - (%.1f + %.1fi) = (%.1f + %.1fi)\n",
            parteReal1, parteImaginaria1, parteReal2, parteImaginaria2,
            parteReal, parteImaginaria);
    
}
}
