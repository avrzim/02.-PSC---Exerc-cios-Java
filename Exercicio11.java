//Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. 
//Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia,
//e o valor do KW/h. O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. Ao final, 
//presente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles.
import java.util.Scanner;

public class Exercicio11 {
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

        System.out.println("A quantidade de KW/h consumido é: " + conversor + "\n" + "O valor total a ser pago é:" + precoTotal);
        input.close();
    }
}