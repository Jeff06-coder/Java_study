package aula15fim;

public class Desafio15 {
    public static void main(String[] args) {
        
        //Criando um objeto da classe MetodosD para usar seus métodos
        MetodosD dobro = new MetodosD();
        //Chamando o método calcularDobro
        dobro.calcularDobro(15);
        //Usando os métodos da classe MetodosD para exibir o resultado
        System.out.println(dobro.getFormula());
        System.out.println("Valor final: " +dobro.getDobro());
    }
    
}
