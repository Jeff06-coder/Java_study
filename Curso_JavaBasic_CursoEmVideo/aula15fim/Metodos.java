package aula15fim;

public class Metodos {

    // 'void' indica que o método não retorna valor (procedimento)
    // 'static' indica que o método pertence à classe e não a uma instância específica
    // 'args' é um array de Strings que pode receber argumentos da linha de comando

    public static void main(String[] args) {
        
        //Chamando o método soma
        soma(6,6);
        System.out.println("Vamos contar: ");
        //Chamando o método contador da classe Operacoes
        System.out.println(Operacoes.contador(1, 12));
    }

    //Criando procedimento de soma/método sem retorno
    //Fazendo virar 'static' para poder ser chamado no main
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é: " + s);
    }


}
