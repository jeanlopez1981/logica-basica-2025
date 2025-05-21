package main.java.com.atividade2;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu Nome:");
        String Nome = scanner.nextLine();
        System.out.println(  Nome   +  "Digite a Temperatura ");
        double Temperatura = scanner.nextDouble();
        System.out.println(  Nome   +  "Em farenheit  é: ");
        System.out.println(Temperatura*9/5+32);

        //3. Calcular o Valor Final com Desconto
        //Peça ao usuário o preço de um produto e o percentual de desconto. Calcule o valor final
        //após o desconto.
        //Fórmula:
        //valorFinal = preco - (preco * desconto / 100)
    }
}
