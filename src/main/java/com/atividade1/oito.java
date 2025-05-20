package main.java.com.atividade1;

import java.util.Scanner;

public class oito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double segundoNumero = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double terceiroNumero = scanner.nextDouble();


        System.out.println("O resultado da media é: ");
        System.out.println((primeiroNumero + segundoNumero + terceiroNumero) / 3 );
    }
}
