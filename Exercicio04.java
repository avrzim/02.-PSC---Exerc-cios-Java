//Crie um programa para calcular a regra de três
//

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1;
        System.out.println("O exemplo é: n1 = n2 " + "\n" + "\t\t" + "n3 = x");
        System.out.println("Digite o valor do número 1: ");
        n1 = input.nextFloat();
        float n2;
        System.out.println("Digite o valor do número 2: ");
        n2 = input.nextFloat();
        float n3;
        System.out.println("Digite o valor do múmero 3: ");
        n3 = input.nextFloat();

        float calculo;
        calculo = (n3 * n2) / n1;
        System.out.println("O resultado da regra de três é: " + calculo);
        input.close();
    }
}