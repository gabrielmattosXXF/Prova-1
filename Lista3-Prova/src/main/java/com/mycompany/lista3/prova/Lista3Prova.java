/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista3.prova;

/**
 *
 * @author Gabriel Mattos
 */
public class Lista3Prova
{
    public static void confronto(Jogador desafiante, Jogador desafiado)
    {
        System.out.println("Ataque: "+desafiante.getNome()+" -> "+desafiado.getNome());
        
        if(desafiante.getAtaque()>desafiado.getDefesa())
        {
            System.out.println(desafiante.getNome()+" venceu!!!");
            
            desafiado.setVida(desafiante);
            desafiante.aumentaNivel();
            
            System.out.println("Pontos de vida de "+desafiado.getNome()+": "+desafiado.getVida());
            System.out.println("Novos dados "+desafiado.getNome()+":");
            System.out.println(desafiante);
        }
        else if(desafiante.getAtaque()<desafiado.getDefesa())
        {
            System.out.println("O ataque não gerou danos");
        }
        else if(desafiante.getAtaque()==desafiado.getDefesa())
        {
            System.out.println("Empate");
            
            desafiante.aumentaNivel();
            desafiado.aumentaNivel();
            
            System.out.println(desafiante);
            System.out.println(desafiado);
        }
    }

    public static void main(String[] args)
    {
        Jogador j1 = new Jogador("J1", 999, 5, 4);
        
        Jogador j2 = new Jogador("J2", 600, 6, 2);
        
        for(int i=0; i<10; i++)
        {
            System.out.println("\nRodada: "+(i+1));
            
            confronto(j1, j2);
            if(j1.getVida()<=0 || j2.getVida()<=0)
            {
                break;
            }
            System.out.println("");
            
            confronto(j2, j1);
            if(j1.getVida()<=0 || j2.getVida()<=0)
            {
                break;
            }
            
            
            
        }
    }
}
