/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiornumero;

import java.util.Scanner;

/**
 *
 * @author Will
 */
public class MaiorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1,
                n2;

        System.out.println("Digite o primeiro numero:");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = entrada.nextInt();

        if (n1 >= n2) {
            System.out.println("O maior numero é " + n1);
        } else {
            System.out.println("O maior numero é:" + n2);
        }
    }

}
