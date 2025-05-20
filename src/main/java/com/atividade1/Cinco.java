package main.java.com.atividade1;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = scanner.nextInt();

        int quociente = primeiroNumero / segundoNumero;

        int Resto = primeiroNumero % segundoNumero;

        System.out.println("O quociente é: " + quociente + " e o resto da divisâo é: " + Resto );

    }
}

