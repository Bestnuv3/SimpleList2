/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.ex.pkg7;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Lista2Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alt, comp, larg, arpi, vol, arpa;
        
        System.out.print("Altura da sala: ");
         alt = Integer.valueOf(input.nextLine());
        System.out.print("Comprimento da sala: ");
         comp = Integer.valueOf(input.nextLine());
        System.out.print("Largura da sala: ");
         larg = Integer.valueOf(input.nextLine());
        
        arpi = comp*larg;
        vol = alt*comp*larg;
        arpa = comp*alt*2+alt*larg*2;
        
        if (vol<100){
            System.out.println("Ar condicionado pequeno");
        } else {
            if (100<=vol && vol<500) {
                System.out.println("Ar condicionado médio");
            } else {
                System.out.println("Ar condicionado grande");
            }
        }
        
        System.out.println("Área do piso: "+arpi+"m²");
        System.out.println("Volume da sala: "+vol+"m³");
        System.out.println("Área das paredes: "+arpa+"m²");
    }
    
}
