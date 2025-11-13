/*Fazer o java capitar qual idioma meu sistema esta usando*/

import java.util.Locale;

  public class Desafio02 {
    public static void main(String[] args) {
        
         Locale idioma = Locale.getDefault();
         System.out.print("Seu sistema esta sendo usado em: " + idioma);
        
       }
    
   }
