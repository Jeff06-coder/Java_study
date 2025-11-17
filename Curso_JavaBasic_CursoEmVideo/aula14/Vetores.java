package aula14;

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        


        //Vetor(é um objeto) é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo.
          int n[] = {3,4,6,1};
               
        // or
       /*int n[] = new int[3];
       n[0] = 3;
       n[1] = 4;
       n[2] = 6;
       n[3] = 1;*/

            System.out.println("Total de elementos no vetor: " + n.length);

            //Ordenando o vetor com um metodo da Class Arrays do JAVA
              Arrays.sort(n);

              for (int c=0; c < n.length; c++){
                System.out.println("Na posição "+ c +" do vetor, temos o número "+ n[c]);
            }

        //Usando vetor em string
          String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            for (int c=0; c < mes.length; c++){
                System.out.println("Mês do ano: "+ mes[c]);
            }
        
         //Laço especial
       // for it, funciona apenas para vetores
         double v[] = {2.5, 3.6, 4.1, 7.9, 8.0};
         for (double valor : v){
           System.out.println("Valor: " + valor);
       }

       //Usando o metodo da Class Arrays para achar a posição do valor desejado
         int pos = Arrays.binarySearch(v, 3.6);
         System.out.println("O valor 3.6 está na posição: " + pos);

       //Fazendo o vetor redefinir os valores gerais
         Arrays.fill(v, 0.0);
         for (double valor : v){
           System.out.println("Redefinindo valor: " + valor);
       }

        
    }
    
}
