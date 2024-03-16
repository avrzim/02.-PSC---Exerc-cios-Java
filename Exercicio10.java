//A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. 
//Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso;
        System.out.println("Digite o seu peso em quilogramas: ");
        peso = input.nextFloat();

        float pesoAgua;
        pesoAgua = peso * 35;

        Float litros;
        litros = pesoAgua / 1000;

        System.out.println("O volume de água à ser ingerido é: " + litros);
        input.close();
    }
}