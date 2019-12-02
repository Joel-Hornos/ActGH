/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actgithub;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class ActGitHub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.print("Introduce primer número: ");
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        numero2 = sc.nextInt();
        resultado = sumar(numero1, numero2);
        System.out.println("Suma: " + resultado);
        
        sc = new Scanner(System.in);
        int num1, num2, resultat;
        num1=0;
        num2=0;
        System.out.print("Introdueix el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introdueix el segon número: ");
        num2 = sc.nextInt();
        resultat = multiplicar(num1, num2);
        System.out.println("Multiplicacio: " + resultat);
        
        
        
        
    }
    
    public static int sumar(int a, int b){
           int c;
           c = a + b;
           return c;
    }
    
    public static int  multiplicar(int a, int b){
         int resultat;
         
         resultat = a*b;
         
         return resultat;
        
    }
    
}