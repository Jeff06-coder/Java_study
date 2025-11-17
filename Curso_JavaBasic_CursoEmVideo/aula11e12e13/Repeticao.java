package aula11e12e13;


public class Repeticao {
    
    public static void main(String[] args) {

       int cc = 0;
    
    while (cc<10){
        
        cc++;
        if (cc == 9 || cc == 5) {

            continue; //pula a repetição
        //  break; //interrompe a repetição e joga para fora do laço/loop

        }

        System.out.println("Cambalhota " + cc);
        
    }

    int a = 1;
    do {
        System.out.println("Executa pelo menos uma vez"); // Enquanto o resultado for true na condição ele continua execultando
        a++;
    } while (a < 6);

}
}
