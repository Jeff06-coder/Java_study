// Desafio: Criar uma calculadora simples que lê dois números e uma operação do usuário e exibe o resultado.

package aula07;
// Importando a classe Scanner para ler a entrada de dados
import java.util.Scanner;

public class Desafio07 {

    public static void main(String[] args) {
        
        System.out.print("Digite o número: ");
        Scanner teclado1 = new Scanner(System.in);
        float numero = teclado1.nextFloat();

        System.out.print("Digite o segundo valor: ");
        Scanner teclado2 = new Scanner(System.in);
        float valor = teclado2.nextFloat();

        

        System.out.println("Escolha a operação, Digite 1 para somar, 2 para subtrair, 3 para multiplicar, 4 para dividir, 5 para a sobra da divisão: ");
        Scanner teclado3 = new Scanner(System.in);
        float operacao = teclado3.nextFloat();
        

        switch ( (int) operacao ) {
            case 1:

                numero += valor;
                System.out.println("O resultado da soma é " + numero);

                break;

            case 2:

                numero -= valor;
                System.out.println("O resultado da subtração é " + numero);

                break;

            case 3:

                numero *= valor;
                System.out.println("O resultado da multiplicação é " + numero);

                break;

            case 4:

                numero /= valor;
                System.out.println("O resultado da divisão é " + numero);

                break;
            case 5:

                numero %= valor;
                System.out.println("O resultado da sobra da divisão é " + numero);

                break;

            default:
                System.out.println("Valor inválido!");

                

        } // fim do switch

        // Para colocar dois resultados decimais, usamos o printf na mesma linha do System.out, é necessário colocar os resultados tudo no final, para sair na linha de código
        //e a ordem é definida pela colocação crescente, sao colocados na ordem dos '%.f' que aparecem na frase.Os valores são substituídos na ordem crescente quando sair o código executado.
        System.out.printf("Alem disso, seu número ao cubo é %.2f e a raiz quadrada é %.2f", Math.pow(operacao, 3), Math.sqrt(operacao));
        
    }
}