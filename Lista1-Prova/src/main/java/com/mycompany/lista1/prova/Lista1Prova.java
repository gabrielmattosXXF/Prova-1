/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista1.prova;
import java.util.Scanner;

/**
 *
 * @author Gabriel Mattos
 */
public class Lista1Prova {

    public static double perimetro(double l1, double l2)
    {
        return (l1+l2)*0.02;
    }
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double l1,l2;
        
        /*for(int i=0; i<3; i++)
        {
            System.out.println("Informe o tamanho do lado "+(i+1));
            
        }*/
        System.out.println("Informe o tamanho do lado 1");
        l1=teclado.nextDouble();
        
        System.out.println("Informe o tamanho do lado 2");
        l2=teclado.nextDouble();
        
        
        System.out.println("O perímetro do retângulo informado he "+perimetro(l1, l2)+" metros");
    }
}
