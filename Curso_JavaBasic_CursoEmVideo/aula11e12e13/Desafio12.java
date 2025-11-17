package aula11e12e13;

import java.util.Scanner;
//Desafio 12: Crie um programa que leia vários números inteiros do usuário até que ele digite o número 0.
// Após a entrada dos números, o programa deve exibir: quantidade total de números digitados, quantidade de números pares e ímpares,
// quantidade de números maiores que 100, soma total dos números digitados e a média dos números.
public class Desafio12 {
    
    public static void main(String[] args) {
        
       //Estrutura talvez não seja das melhores e nem a mais eficiente, mas funciona corretamente.Foi do jeito que consegui pensar no momento.

       int numCont = 0;
       int cont = 0;
       int par = 0;
       int impar = 0;
       int maior = 0;
       int total = 0;
       int media = 0;

       do {

            Scanner teclado = new Scanner(System.in);
            System.out.print("Digite um número para ver sua tabuada (Número 0 para sair): ");
            int num = teclado.nextInt();

            
            if (num % 2 == 0) {
                par++;
            }else {
                impar++; }


            if (num > 100) {
                maior++;
            }


            total += num;
            cont = num;
            numCont++;
            media = total / numCont;

       }while(cont > 0);

       System.out.println("Total de números digitados: " + numCont);
       System.out.println("Total de números pares: " + par);
       System.out.println("Total de números ímpares: " + impar);
       System.out.println("Total de números maiores que 100: " + maior);
       System.out.println("Soma total dos números digitados: " + total);
       System.out.println("Média dos números digitados: " + media);



    }
    
}
