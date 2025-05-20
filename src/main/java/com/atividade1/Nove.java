package main.java.com.atividade1;

import java.util.Scanner;

public class Nove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número para a:");
        double a = scanner.nextDouble();
        System.out.println("Digite o número para b:");
        double b = scanner.nextDouble();
        System.out.println("Digite o número para c:");
        double c = scanner.nextDouble();


        System.out.println("O resultado da equação (b² - 4ac)) / (2a) é: ");
        System.out.println( (b*b-4*a*c)/2*a);
}
}
