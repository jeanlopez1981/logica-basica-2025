package main.java.com.atividade2;


import java.util.Scanner;

public class um {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu Nome:");
        String Nome = scanner.nextLine();

        System.out.println(  Nome   +  "Digite a Distancia percorrida em Km:");
        double Distancia = scanner.nextDouble();

        System.out.println(  Nome   +  " o tempo em Horas:");
        double horas = scanner.nextDouble();

        System.out.println(  Nome   +  "O resultado da velocidade media é: ");
        System.out.println(Distancia / horas);
    }
}
