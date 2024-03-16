//Escreva um programa que seja capaz de realizar a soma de duas frações, 
//não é necessário simplificar. As entradas serão o numerador e, 
//o denominador da primeira fração, seguidos do numerador e, o denominador da segunda fração. 
//O resultado também deverá ser exibido em formato de fração. e.g: ⅗


import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerador1, numerador2, denominador1, denominador2;
        System.out.println("Digite o numerador da primeira fração:");
        numerador1 = input.nextInt();
        System.out.println("Digite o denominador da primeira fração:");
        denominador1 = input.nextInt();

        System.out.println("Digite o numerador da segunda fração:");
        numerador2 = input.nextInt();
        System.out.println("Digite o denominador da segunda fração:");
        denominador2 = input.nextInt();

        int novoNumerador, novoDenominador;

        novoNumerador = (numerador1 * denominador2) + (numerador2 * denominador1);
        novoDenominador = denominador1 * denominador2;

        System.out.println("A soma das frações é:");
        System.out.println(novoNumerador + "/" + novoDenominador);

        input.close();
    }
}