package br.academiaCapgemini;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
    public List<String> degraus = new ArrayList<>();
    String varEspeciais = "!@#$%^&*()-+\n";
    String letraMinusculo = "abcdefghijklmnopqrstuvxzwyk";
    String letraMaiuscula = "ABCDEFGHIJKLMNOPQRSTUVXZWYK";
    String numero = "0123456789";

    char c, compare;
    int contanum = 0;
    int contaMaiusculo = 0;
    int contaMinusculo = 0;
    int contaCaracter = 0;
    int criterioForte = 0;


    public Exercicio() {

    }

    /*
    Método criado para solucionar a primeira questão, onde vai percorrer a lista inserindo o espaço e o
    '*' necessário para montar a escada
     */
    public void escada(int n) {
        for (int i = 0; i < n; i++) {
            degraus.add(" ".repeat(n - i) + "*".repeat(i + 1));
        }

        for (String d : degraus) {
            System.out.println(d);
        }
    }

    /*
    OBS: O exercício ão ficou muito claro
    Esse método foi criado para que seja verificado se o tem algum caracter especial, letra minuscula,
    letra Maiuscula, numeros foi criado a variável critério forte, a cada item verdadeiro ela armazena

     */
    public String senhaTamanho(String senha1) {

        if (senha1.length() < 6) {
            System.out.println("Asua senha é insegura, pois possui menos de 6 caracter: " + senha1.length());
            return "A";
        } else {
            for (int i = 0; i < senha1.length(); i++) {
                c = senha1.charAt(i);
                senhaNumero(c);
            }
        }

        if (criterioForte == 4)
            System.out.println("A Senha é Forte!");
        else System.out.println("Favor, revisar sua senha! A senha atende apenas: "+criterioForte +" requisitos!");

        return "a";
    }

    public int senhaNumero(char x) {
        if (contanum == 0) {
            for (int y = 0; y < numero.length(); y++) {
                compare = numero.charAt(y);
                if (compare == x) {
                    contanum++;
                    criterioForte++;
                    return criterioForte;
                }
            }
        }
        senhaMaiuscula(x);
        return criterioForte;
    }

    public int senhaMaiuscula(char x) {
        if (contaMaiusculo == 0) {
            for (int y = 0; y < letraMaiuscula.length(); y++) {
                compare = letraMaiuscula.charAt(y);
                if (compare == x) {
                    contaMaiusculo++;
                    criterioForte++;
                    return criterioForte;
                }
            }
        }
        senhaMinuscula(x);
        return criterioForte;
    }

    public int senhaMinuscula(char x){
        if (contaMinusculo == 0) {
            for (int y = 0; y < letraMinusculo.length(); y++) {
                compare = letraMinusculo.charAt(y);
                if (compare == x) {
                    contaMinusculo++;
                    criterioForte++;
                    return criterioForte;
                }
            }
        }

        caracterEspeciais(x);
        return criterioForte;
    }

    public int caracterEspeciais(char x){
        if (contaCaracter == 0){
            for (int y = 0; y < varEspeciais.length(); y++) {
                compare = varEspeciais.charAt(y);
                if (compare == x) {
                    contaCaracter++;
                    criterioForte++;
                    return criterioForte;
                }
            }
        }
        return criterioForte;
    }
    public void imprimeAnagramas(String prefix, String word) {
        if (word.length() <= 1) {
            System.out.println(prefix + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String cur = word.substring(i, i + 1);
                String before = word.substring(0, i);
                String after = word.substring(i + 1);
                imprimeAnagramas(prefix + cur, before + after);
            }
        }
    }
}