/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

// Esse é o comentário de teste

/**
 *
 * @author B1-08
 */
public class Calculadora {
    public static void main(String[] args) {
        //Declaração de variáveis
        int n1, n2, total, op;
                
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        
        do{
            //Apresentação do sistema
            System.out.println("\n\t\t\t -- Calculadora Simples --\n");

            //Menu
            System.out.println("1. Soma ");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");

            //Opção do usuário
            System.out.print("\n\tOpção: ");
            
            op = entrada.nextInt();


            if(op == 1){
                
                //Apresentação da soma
                System.out.println("\n\t\t\t -- Soma --\n");

                //Entradas
                System.out.print("Informe N1: ");
                n1 = entrada.nextInt();

                System.out.print("Informe N2: ");
                n2 = entrada.nextInt();

                //Processamento
                total = n1 + n2;

                //Resultado
                System.out.println("O resultado é: " + total);
                 
                //Saída
                System.out.println("\n\n" + n1 + " + " + n2 + " = " + total);
                
                
                
            }else if(op == 2){
                
                //Apresentação da Subtração
                System.out.println("\n\t\t\t -- Subtração --\n");
                
                //Entradas
                System.out.print("Informe N1: ");
                n1 = entrada.nextInt();
                
                System.out.print("Informe N2: ");
                n2 = entrada.nextInt();
                
                //Processamento
                total = n1 - n2;
                
                //Resultado
                System.out.println("O resultado é: " + total);
                
                //Saída
                System.out.println("\n\n" + n1 + " - " + n2 + " = " + total);
                
                
            }else if(op == 3){
                
                //Apresentação da multiplicação 
                System.out.println("\n\t\t\t -- Multiplicação -- \n");
                
                //Entradas
                System.out.print("Informe N1: ");
                n1 = entrada.nextInt();
                
                System.out.print("Informe N2: ");
                n2 = entrada.nextInt();
                
                //Processamento
                total = n1 * n2;
                
                //Resultado
                System.out.println("O resultado é: " + total);
                
                //Saída
                System.out.println("\n\n" + n1 + " * " + n2 + " = " + total);
                
                
                
            }else if(op == 4){
                
                // Apresentação da Divisão
                System.out.println("\n\t\t\t -- Divisão -- \n");

                //Entradas
                System.out.print("Informe N1: ");
                n1 = entrada.nextInt();
                
                System.out.print("InformeN2: ");
                n2 = entrada.nextInt();
                
                //Processamento
                total = n1 / n2;
                
                //Resultado
                System.out.println("O resuultado é: " + total);
                
                 //Saída
                System.out.println("\n\n" + n1 + " / " + n2 + " = " + total);
                
                
            } else if(op == 5){
                
                //Sair do sistema
                System.out.println("Obrigado pela preferência, Forte abraço!!! rsrsrs");
                
            }else{
                
                //Opção incorreta!
                System.out.println("A opção " + op + ", Eu não sugeri essa opção!!!  ");
                
            }
            
        }while(op != 5);
        
        
        
    }
    
}
