//Escreva um algoritmo que recebe dois pontos no plano cartesiano, P1=(x1,y1) e P2=(x2,y2)e calcula a distância entre eles, 
//dada por d(P1,P2)=(x1-x2)2+(y1-y2)2 .

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x1, y1, x2, y2;
        System.out.println("Digite o valor de x1: ");
        x1 = input.nextFloat();
        System.out.println("Digite o valor de y1: ");
        y1 = input.nextFloat();
        System.out.println("Digite o valor de x2: ");
        x2 = input.nextFloat();
        System.out.println("Digite o valor de y2: ");
        y2 = input.nextFloat();

        float calculo;
        calculo = (float) Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));

        System.out.println("A distância entre os pontos é: " + calculo);
        input.close();
    }
}