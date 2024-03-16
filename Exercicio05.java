//Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. 
//O resultado deve aparecer de maneira organizada e clara para a pessoa utilizadora.


import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float lado1, lado2, lado3, lado4;
        System.out.println("Digite o valor do primeiro lado: ");
        lado1 = input.nextFloat();
        System.out.println("Digite o valor do segundo lado: ");
        lado2 = input.nextFloat();
        System.out.println("Digite o valor do terceiro lado: ");
        lado3 = input.nextFloat();
        System.out.println("Digite o valor do quarto lado: ");
        lado4 = input.nextFloat();

        float calcularArea;
        calcularArea = lado1 * lado2;

        float calcularPerimetro;
        calcularPerimetro = lado1 + lado2 + lado3 + lado4;

        double calcularDiagonal;
        calcularDiagonal = Math.sqrt((lado1 * lado1) + (lado2 * lado2));

        System.out.println("O resultado dos calculos é: " + "\n" + "O valor da área do retângulo é: " + calcularArea + "\n" + "O valor do perimetro é: " + calcularPerimetro + "\n" + "O valor da diagonal é: " + calcularDiagonal);
        input.close();
    }
}