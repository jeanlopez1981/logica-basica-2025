package main.java.com.atividade1;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("O resultado ao quadrado é: ");
        System.out.println(primeiroNumero * primeiroNumero );
    }
}
