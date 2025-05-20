package main.java.com.atividade1;

import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mercadoria = ("Digite a mercadoria:");

        System.out.println ("Digite o valor da compra: ");
        double Compra = scanner.nextDouble();

        System.out.println ("Digite o valor da venda: ");
        double Venda = scanner.nextDouble();

        System.out.println( "O Lucro do " + mercadoria + " é de: " +(Venda - Compra) );

    }
}
