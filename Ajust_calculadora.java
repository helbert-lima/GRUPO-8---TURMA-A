/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_5;

import java.util.Scanner;

/**
 *
 * @author Helbert
 */
public class Ajust_calculadora {
    public static void main(String[] args) {
        double a, b;
        String operacaoStr;
        String operaInf;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("<A>dição");
        System.out.println("<S>ubtração");
        System.out.println("<M>ultiplição");
        System.out.println("<D>ivisão");
        System.out.println("<P>otencia");
        System.out.print("Escolha a Operação: ");
        
        operacaoStr = entrada.next();
        
        switch (operacaoStr) {
            case "a":
            case "A":
            case "Adição":
                operacaoStr = "soma";
                break;
            case "s":
            case "S":
            case "Subtração":
                operacaoStr = "Diferença";
                break;
            case "m":
            case "M":
            case "Multiplicação":
                operacaoStr = "Vezes";
                break;
            case "d":
            case "D":
            case "Divisão":
                operacaoStr = "Quociente";
                break;
            case "p":
            case "P":
            case "Elevado":
            case "e":
            case "E":
                operacaoStr = "Potencia";
                break;
            default:
                System.out.println("A operação "+"'"+operacaoStr+"'"+" não é válida!");
                entrada.close();
                break;
            }
            System.out.print("1° operando: ");
            a = entrada.nextDouble();
            System.out.print("2° operando: ");
            b = entrada.nextDouble();
        
        switch ( operacaoStr ) {
            case "soma":
                System.out.println("Soma: "+(a + b));
                break;
            case "Diferença":
                System.out.println("Diferença: "+(a - b));
                break;
            case "Vezes":
                System.out.println("Produto: "+(a * b));
                break;
            case "Quociente":
                System.out.println("Quociente: "+(a / b));
                break;
            case "Potencia":
                System.out.println("Potencia: "+(a * b));
                break;
            default:
                System.out.println("A operação "+"'"+operacaoStr+"'"+" não é válida!");
                break;
            }
            //System.out.println("Isso não se refere à uma Operaçãoo!");     
    }
}