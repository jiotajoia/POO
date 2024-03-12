package com.mycompany.p.o.atividade_1;

public class SituacaoFinanceira {
    
    double valorCreditos;
    double valorDebitos;
    
    double saldo(){
        return valorCreditos - valorDebitos;
    }
    
    public static void main(String[] args) {
        
        SituacaoFinanceira situacao = new SituacaoFinanceira();
        
        situacao.valorCreditos = 150;
        situacao.valorDebitos = 50;
        
        double saldo1 = situacao.saldo();
        
        System.out.println("O saldo atual é de: R$ " + saldo1);
        
    }
}
