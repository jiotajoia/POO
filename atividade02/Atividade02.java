<<<<<<< HEAD:atividade02/Atividade02.java
package atividade02;
=======
package atividade03;
<<<<<<< HEAD
import java.util.Arrays;

public class Atividade03 {

    public static void main(String[] args) {
      Runnable ola = ()-> System.out.println("Olá");
    
      ola.run();
      
       int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

       int[] pares = Arrays.stream(array)
               .filter(num -> num % 2 == 0)
               .toArray();
       
       System.out.println("\nFilter para pegar os números pares do array: ");
       
       for (int num : pares){
           System.out.print(num + " ");
       }
       
       int[] dobrado = Arrays.stream(array)
               .map(num -> num * 2)
               .toArray();
       
       System.out.println("\n\nMap para dobrar os valores do array: ");
       
       for(int num : dobrado){
           System.out.print(num + " ");
       }
    }

=======
>>>>>>> eb48bcd476f2f3e0a65e1cb3af17b7a944cba9bf:atividade03/Atividade03.java

public class Atividade02 {

    public static void main(String[] args) {
       
    }

    /*1 - Crie uma função que recebe como parâmetro um número e retorna true se o
número for par e false se for ímpar.*/
    public static boolean eh_par(int n) {
        return n % 2 == 0;
    }

    /*2 - Crie uma função que recebe como parâmetro um número e retorna true se o
número for primo e false caso contrário.*/
    public static boolean eh_primo(int n){

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /*3 - Crie uma função que receba como parâmetros um nome e um pronome de
tratamento opcional. Caso esse último não seja fornecido, deve ser considerado o
valor “Sr”. Ao final, imprima uma saudação semelhante a “Sra. Sávia”.*/
    
    public static String saudacao(String nome, String pronome){
        
        String saudacao;
        
        if (pronome.isEmpty()){
            pronome = "Sr.";
        }       
        
        saudacao = pronome + " " + nome;
        
        return saudacao;
    }
    
    /*4 - Crie uma função que retorne os números de um array passados por parâmetro
separados por traço (-) no formato string. Para isso, use o método forEach dos
arrays.*/
    
        
    public static String numeros_array(int array[]){
        int i = 0;
        String numeros = "";
        
        /*for(int i = 0; i < array.length; i++){
            numeros += array[i];
            
            if (i != (array.length - 1)){
                numeros += " - ";
            }
        }*/
        

        for(int numero : array){
            
            i++;
            
            numeros += numero + " - ";
        }
        
        return numeros;
    }
    
    /*6 - Crie uma função exibir receba como parâmetro um “rest parameter” representando
    strings. A função deve exibir no log cada um dos elementos do “rest parameter”.
    Chame a função usando diferentes quantidade de parâmetros conforme abaixo:

    exibir(“a”, “b”);
    exibir(“a”, “b”, “c”);
    exibir(“a”, “b”, “c”, “d”);*/
    
    public static String exibir(String... parameters){
        
        String exibido = "";
        
        for (String parameter: parameters){
            exibido += parameter + "\n";
        }
        
        return exibido;
    }
    
>>>>>>> 812350557dbd2edd8b3c34c5980110aad4019625
}
