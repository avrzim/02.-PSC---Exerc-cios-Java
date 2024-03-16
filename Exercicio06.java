//Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra.
//A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida. 
//Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.


import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float largura, comprimento;
        System.out.println("Digite o valor da largura: ");
        largura = input.nextFloat();
        System.out.println("Digite o valor do comprimento: ");
        comprimento = input.nextFloat();

        float calculoDaArea;
        calculoDaArea = largura * comprimento;

        float porcentagem;
        porcentagem = calculoDaArea / 100;

        float acabamento;
        acabamento = calculoDaArea + (porcentagem * 10);

        double calculoTotal;
        calculoTotal = (int) Math.ceil(acabamento);


        System.out.println("O valor da área preenchida mais o acabamento é: " + calculoTotal);
        input.close();
    }
}