package aula15fim;

public class MetodosD {

    //Atributos
    private int dobro = 0;
    private String formula = "";

    public void calcularDobro(int num) {

        //Fazendo o cálculo do dobro
        dobro = num * 2;
    }

    public int getDobro() {

        //Retornando o resuldado de dobro
        return dobro;
    }

    public String getFormula() {

        //Retornando a fórmula usada
        formula = "O dobro de " + (dobro / 2) + " é " + dobro;
        return formula;
    }
    
}
