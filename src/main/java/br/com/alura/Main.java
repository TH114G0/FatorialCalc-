package br.com.alura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static void imprimirResultado(int fatorial) {
        int resultado = calcularFatorial(fatorial);
        System.out.println();
        System.out.println("Fatorial de " + fatorial + " é: " + resultado);
    }

    private static int calcularFatorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.print("Informe o valor do Fatorial: ");
            int fatorial = 0;
            try {
                fatorial = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Informe valores inteiros! - " + ex.getMessage());
                scanner.nextLine();
            }
            if (fatorial < 0) {
                System.out.println("Não é possível calcular o fatorial de um número negativo.");
                continue;
            }

            imprimirResultado(fatorial);

            System.out.println("Deseja informar outro valor ? (s/n)");
            String resp = scanner.nextLine().trim().toUpperCase();
            if (resp.equals("N")) {
                System.out.println("Saindo....");
                break;
            }else if(!resp.equals("S")) {
                System.out.println("Informe apenas as letras 'S' para continuar e 'N' para sair!");
            }
        }
    }
}