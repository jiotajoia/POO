package com.mycompany.p.o.atividade_1;

public class Circulo {
    
        double raio;
        double PI = 3.14;

        double calcularArea(){
            return PI*raio*raio;
        }

        double calcularPerimetro(){
            return 2*PI*raio;
        }
    
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();

        circulo1.raio = 3;

        double area = circulo1.calcularArea();
        
        System.out.println("A área é: " + area);
        
        double perimetro = circulo1.calcularPerimetro();

        System.out.println("O perímetro é: " + perimetro);

    }
    
}
