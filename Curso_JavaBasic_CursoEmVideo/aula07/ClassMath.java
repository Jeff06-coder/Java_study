package aula07;

    public class ClassMath {
        public static void main(String[] args) {
    
           float numero = 23.1f;
              numero = (float) Math.sqrt(numero);
              System.out.println("A raiz quadrada é " + numero);
            
              System.out.printf("O valor de PI é %.2f" , Math.PI);

                // Arredondando valores, 'round' faz automaticamente para cima ou baixo, enquanto 'ceil' sempre para cima e 'floor' sempre para baixo
              float valor = 4.6f;
                int arredondar = (int) Math.round(valor);
                System.out.println("\nO valor arredondado é " + arredondar);

                //Fazendo aparecer números aleatórios
                System.out.printf("O valor aleatório é %.0f", Math.random() * 100);
        }
        
    }