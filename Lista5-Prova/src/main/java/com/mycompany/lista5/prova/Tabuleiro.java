/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista5.prova;
import com.mycompany.lista5.prova.Jogador;
import java.util.*;

/**
 *
 * @author Gabriel Mattos
 */
public class Tabuleiro
{
    public static void coletaTesouro(Jogador jog, char[][] matriz)
    {
        jog.setExp(1);
        //remove tesouro da posição
        System.out.println("Parabéns, você encontrou um tesouro!");
        System.out.println(jog);
        
    }
    
    public static void desafia(Jogador desafiante, Jogador desafiado)
    {
        System.out.println("Você deseja desafiar "+desafiado.getNome()+" para um confronto(s/n)?");
        char resp=new Scanner(System.in).nextLine().charAt(0);
        
        if(resp=='s')
        {
            System.out.println("Ataque: "+desafiante.getNome()+" -> "+desafiado.getNome());
        
            if(desafiante.getAtaque()>desafiado.getDefesa())
            {
                System.out.println(desafiante.getNome()+" venceu!!!");

                desafiado.setVida(-1);
                
                desafiante.aumentaNivel(1);
                desafiante.setVida(1);
            }
            else if(desafiante.getAtaque()<desafiado.getDefesa())
            {
                System.out.println("O ataque não gerou danos");
                desafiante.setVida(-1);
                
                desafiado.aumentaNivel(1);
                desafiado.setVida(1);
            }
            else if(desafiante.getAtaque()==desafiado.getDefesa())
            {
                System.out.println("Empate");

                desafiante.aumentaNivel(1);
                desafiante.setVida(1);
                
                desafiado.aumentaNivel(1);
                desafiado.setVida(1);
            }
            System.out.println(desafiante);
            System.out.println(desafiado);
            
            System.out.println("Ataque: "+desafiado.getNome()+" -> "+desafiante.getNome());
        
            if(desafiado.getAtaque()>desafiante.getDefesa())
            {
                System.out.println(desafiado.getNome()+" venceu!!!");

                desafiante.setVida(-1);
                
                desafiado.aumentaNivel(1);
                desafiado.setVida(1);
            }
            else if(desafiado.getAtaque()<desafiante.getDefesa())
            {
                System.out.println("O ataque não gerou danos");
                desafiado.setVida(-1);
                
                desafiante.aumentaNivel(1);
                desafiante.setVida(1);
            }
            else if(desafiante.getAtaque()==desafiado.getDefesa())
            {
                System.out.println("Empate");

                desafiante.aumentaNivel(1);
                desafiante.setVida(1);
                
                desafiado.aumentaNivel(1);
                desafiado.setVida(1);
            }
            System.out.println(desafiante);
            System.out.println(desafiado);
        }
        else if(resp=='n')
        {
            System.out.println("Oponente nao desafiado.");
        }
        else
        {
            System.out.println("Resposta invalida.");
            desafia(desafiante, desafiado);
        }
            
        
    }
}