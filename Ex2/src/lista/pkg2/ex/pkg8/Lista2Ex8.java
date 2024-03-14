/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.ex.pkg8;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Lista2Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double t, d;
        
        System.out.println("Digite o tempo entre o relâmpago e o trovão: ");
         t = Double.valueOf(input.nextLine());
        
        d = t*340;
        
        
        if (d<200){
            System.out.println("PERIGO");
            System.out.println("A distância entre a pessoa e o relâmpago foi de: "+d);
        } else {
            System.out.println("A distância entre a pessoa e o relâmpago foi de: "+d);
        }
    }
    
}
