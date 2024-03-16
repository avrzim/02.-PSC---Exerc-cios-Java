//Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago.

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double largura, comprimento, preco;
        System.out.println("Digite o valor da largura: ");
        largura = input.nextDouble();
        System.out.println("Digite o valor do comprimento: ");
        comprimento = input.nextDouble();
        System.out.println("Digite o valor por metro quadrado: ");
        preco = input.nextDouble();

        double calculoArea;
        calculoArea = largura * comprimento;

        double porcentagem;
        porcentagem = calculoArea / 100;

        double acabamento;
        acabamento = calculoArea + (porcentagem * 10);

        double calculoTotal;
        calculoTotal = (int) Math.ceil(acabamento);

        double precoTotal;
        precoTotal = preco * calculoArea;

        System.out.println("O valor da área preenchida mais o acabamento é: " + calculoTotal + "\n" + "O valor total a ser pago é: " + precoTotal);
        input.close();
    }
}