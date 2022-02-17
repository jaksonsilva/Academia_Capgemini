package br.academiaCapgemini;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Exercicio ex = new Exercicio();
        int qtdDegraus;
        String senha;
        String anagrama;

        System.out.println("##########  Exercicio 01 ##########");
        do {
            System.out.print("Digite a quantidade de níveis da sua escada: ");
            qtdDegraus = scan.nextInt();
            if (qtdDegraus < 1) System.out.println("Valor Inválido");
            else ex.escada(qtdDegraus) ;
        }while (qtdDegraus < 1);

        System.out.println("##########  Exercicio 02 ##########");
        System.out.println("Digite sua senha: ");
        ex.senhaTamanho(senha = scan.next());

        System.out.println("##########  Exercicio 03 ##########");
        System.out.println("Digite a sua palavra: ");
        anagrama = scan.next();
        ex.imprimeAnagramas("", anagrama);
    }
}