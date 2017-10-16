/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerodecrescente;

import java.util.Scanner;

/**
 *
 * @author Will
 */
public class NumeroDecrescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean continuar = true;

        System.out.println("Digite um numero ");
        numero = entrada.nextInt();

        while (continuar == true) {

            if (numero >= 0) {
                System.out.println(numero);
                numero--;
            } else {
                continuar = false;
            }
        }

    }

}
