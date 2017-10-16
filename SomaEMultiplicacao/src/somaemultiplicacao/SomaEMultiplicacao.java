/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somaemultiplicacao;

/**
 *
 * @author Will
 */
public class SomaEMultiplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,
                j,
                resultSoma = 0;
        long resultMulti = 1;

        for (i = 1, j = 2; i <= 30 && j <= 30; i += 2, j += 2) {
            resultSoma += i;
            resultMulti *= j;
        }
        System.out.println("Resultado da soma: " + resultSoma);
        System.out.println("Resultado da Multiplicacao: " + resultMulti);

    }

}
