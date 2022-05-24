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
public class registro {
    public static void main(String[] args){
        Identidade emp = new Identidade();
        emp.setNome("alberto");
        emp.setNomemae("inna");
        emp.setNomepai("bruno");
        emp.setNacionalidade("BR");
        emp.setGenero("masculino");
        emp.setEstadocivil("solteiro");
        emp.setAltura(190);
        emp.setPeso(80);
        System.out.println("nome : "+emp.getNome());
        System.out.println("mae ; "+emp.getNomemae());
        System.out.println("pai : "+emp.getNomepai());
        System.out.println("nação : "+emp.getNacionalidade());
        System.out.println("genero : "+emp.getGenero());
        System.out.println("estado civil : "+emp.getEstadocivil());
        System.out.println("altura em cm : "+emp.getAltura());
        System.out.println("peso em kg : "+emp.getPeso());
    }
}
