/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Conversion {
    //si declaro algo fuera del metodo main tengo que dclararlo como static
    static double pulgada=39.37;
    static double pie=3.28;
    
    static double conviertePies(double metros)
    {
        return metros*pie;
    }
    static double conviertePulgadas(double metros)
    {
        return metros*pulgada;
                
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double medida,conversion;
        int escala=0, opcion=0;
        
        
        
        Scanner valor= new Scanner (System.in);
        
        System.out.println("Ingrese la medida");
        medida=valor.nextDouble();
        
        conversion=conviertePies(medida);
        System.out.println("Medida en pies: "+conversion);
        conversion=conviertePulgadas(medida);
        
        System.out.println("");
        
        
        
        
        
        
    }
    
}
