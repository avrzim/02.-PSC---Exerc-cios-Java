//Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =Raiz a2+b2 


import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float A;
        System.out.println("Digite a variavel A: ");
        A = input.nextFloat();
        float B;
        System.out.println("Digite a variavel B: ");
        B = input.nextFloat();

        float AB;
        AB = A * A + B * B;
        double raiz;
        raiz = Math.sqrt(AB);
        System.out.println("O valor do teorema de pitágora é: " + raiz);
        input.close();
    }
}