package main.java.com.atividade1;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o número para X:");
    double primeiroNumero = scanner.nextDouble();


    System.out.println("O resultado da equação Y=3x+2 é: ");
    System.out.println(primeiroNumero * 3 + 2 );
}
}
