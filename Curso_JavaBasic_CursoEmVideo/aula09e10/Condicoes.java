package aula09e10;

import java.util.Scanner;

public class Condicoes {
    
    public static void main(String[] args) {
        
        System.out.print("Digite sua idade para saber sua condição de voto: ");
        Scanner teclado = new Scanner(System.in);
        int idade = teclado.nextInt();
        
        if (idade < 16) {
            System.out.println("Não vota");
        } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
            System.out.println("Voto opcional");
        } else {
            System.out.println("Voto obrigatório");
        }
        
        if (idade < 18){
            System.out.println("Você não pode dirigir.");
        }else {
            if(idade >= 18 && idade < 70){
            System.out.println("Você pode dirigir.");
        } else {
            System.out.println("Você pode dirigir, mas com cautela.(Repense se vai dirigir mesmo!)");
        }
        }
    }
}
