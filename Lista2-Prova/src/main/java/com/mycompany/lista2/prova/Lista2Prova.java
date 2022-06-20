/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista2.prova;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Mattos
 */
public class Lista2Prova
{

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        List<Integer> sequencia = new ArrayList<>();
        
        sequencia.add(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro termo:")));
        /*System.out.println("Informe o primeiro termo: ");
        sequencia.add(teclado.nextInt());*/
        
        sequencia.add(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo termo:")));
        /*System.out.println("Informe o segundo termo: ");
        sequencia.add(teclado.nextInt());*/
        
        for(int i=0; i<8; i++)
        {
            sequencia.add(sequencia.get(sequencia.size()-1) + 2*sequencia.get(sequencia.size()-2));
        }
        
        JOptionPane.showConfirmDialog(null, sequencia.toString());
        //System.out.println(sequencia.toString());
        
        
    }
}
