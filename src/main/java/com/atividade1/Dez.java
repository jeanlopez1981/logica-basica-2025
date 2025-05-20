package main.java.com.atividade1;

import java.util.Scanner;

public class Dez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número Dias:");
        double Dias = scanner.nextDouble();
        System.out.println("Digite o número Horas:");
        double Horas = scanner.nextDouble();
        System.out.println("Digite o número Minutos:");
        double Minutos = scanner.nextDouble();
        System.out.println("Digite o número Segundos:");
        double Segundos = scanner.nextDouble();


        System.out.println("O resultado da soma dos segundos é: ");
        System.out.println(Dias * 24 * 60 * 60 + Horas * 60 * 60 + Minutos * 60 + Segundos);

    }
}
