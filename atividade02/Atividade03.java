
package atividade03;

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


    }
    


