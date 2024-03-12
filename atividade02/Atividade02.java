package atividade02;
import java.util.Arrays;

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
    
}
