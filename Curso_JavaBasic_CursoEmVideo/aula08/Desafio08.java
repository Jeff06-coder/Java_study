package aula08;

import java.util.Scanner;

// Vendo se é maior de idade com operador ternário
public class Desafio08 {

    public static void main(String[] args) {
        
        Scanner idade = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int anos = idade.nextInt();

        String resultado = (anos >= 18) ? "Você é maior de idade!" : "Você é menor de idade!";
        System.out.println(resultado);
        
    }
    
}
