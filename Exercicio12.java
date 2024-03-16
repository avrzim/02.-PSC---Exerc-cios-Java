//Pesquise o valor aproximado de dias por mês e ajuste o programa anterior para exibir o custo mensal em 
//energia elétrica com o equipamento inserido.

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Watts;
        System.out.println("Digite a potencia do equipamento em Watts: ");
        Watts = input.nextFloat();
        float horas;
        System.out.println("Digite a quantidade de horas que ele fica ligado por dia: ");
        horas = input.nextFloat();
        float preco;
        System.out.println("Digite o preço do KW/h: ");
        preco = input.nextFloat();

        float conversor;
        conversor = (Watts * horas) / 1000;

        float precoTotal;
        precoTotal = conversor * preco;

        float precoMes;
        precoMes = 30 * precoTotal;

        System.out.println("A quantidade de KW/h consumido é: " + conversor + "\n" + "O valor total a ser pago é:" + precoTotal + "\n" + "O valor a ser pago no mês é: " + precoMes);
        input.close();
    }
}