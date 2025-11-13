package aula06;

import java.util.Scanner;

public class TiposPrimitivos {
    
    public static void main(String[] args) {

        // Criando o objeto Scanner, faz o programa pedir a entrada de dados
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        // Primeiro metodo de declarar um float
        float nota =  teclado.nextFloat();
        System.out.println("A nota é " + nota);

        // Segundo metodo de declarar um float
        float nota1 = (float) 8.6;
        System.out.println("A nota 2 é " + nota1);
        
        // Terceiro metodo de declarar um float
        float nota2 = Float.parseFloat("9.1");
        System.out.println("A nota 3 é " + nota2);
        // Print com formatação, para mostrar as casas decimais
        System.out.format("A nota é %.1f", nota2);
        

    }
}
