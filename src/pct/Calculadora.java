/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;


/**
 *
 * @author B1-08
 */
public class Calculadora {
    public static void main(String[] args) {
        //Declaração de variáveis
        int n1, n2, total;
        
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Soma Simples --\n");
        
        //Entradas
        System.out.print("Informe N1: ");
        n1 = entrada.nextInt();
        
        System.out.print("Informe N2: ");
        n2 = entrada.nextInt();
        
        
        //Processamento
        total = n1 + n2;
        
        
        //Saída
        System.out.println("\n\n" + n1 + " + " + n2 + " = " + total);
        
        
        
    }
    
}
