/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.ex.pkg9;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Lista2Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vcompra, vpago, vtroco = 0, resto, n100, n10, n1;
        
        System.out.print("Valor da compra: ");
        vcompra = Integer.valueOf(input.nextLine());
        System.out.print("Valor pago: ");
        vpago = Integer.valueOf(input.nextLine());
        
        vtroco = vpago-vcompra;
        n100 = vtroco/100;
        resto = vtroco%100;
        n10 = resto/10;
        resto = resto%10;
        n1 = resto;
        
        System.out.println("O valor da compra foi "+vcompra+" o valor pago foi "+vpago+" o troco deve ser "+vtroco);
        System.out.println(n100+" notas de cem, "+n10+" notas de 10 e "+n1+" notas de 1.");
        
        
        
    }
    
}
