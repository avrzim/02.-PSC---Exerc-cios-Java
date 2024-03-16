//Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura, 
//em centímetros, e exibir o peso ideal e o peso ideal ajustado. Dica: 
//https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal Utilize este como referência para seus testes. Obs. 
//O IMC é apenas uma referência, um médico deve ser consultado para entender as necessidades de cada indivíduo.


import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float peso, altura;

        System.out.println("Digite seu peso atual em quilogramas: ");
        peso = input.nextFloat();

        System.out.println("Digite sua altura atual em centímetros: ");
        altura = input.nextFloat();

        altura = altura / 100;

        float IMC;
        IMC = peso / (altura * altura);

        float pesoIdeal;
        pesoIdeal = 22 * altura * altura;

        System.out.println("O valor do IMC é: " + IMC + "\n" + "O seu peso ideal é: " + pesoIdeal);

        input.close();
    }
}