/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista4.prova;
import java.util.*;

/**
 *
 * @author Gabriel Mattos
 */
public class Lista4Prova
{
    public static int movimento(char mov, char[][] matriz, Jogador j1)
    {
        int retorno=-1;
        switch(mov)
        {
            case 'w':
                if(j1.getPosiY()-1>=0)
                {
                    matriz[j1.getPosiY()][j1.getPosiX()]='_';
                    j1.setPosiY(-1);
                    
                    if(matriz[j1.getPosiY()][j1.getPosiX()]=='T')
                    {
                        j1.setExp(1);
                        System.out.println("Parabéns, você encontrou um tesouro! Nova pontuação de experiência:\n" + j1.getExp());
                        retorno=1;
                    }
                    else if(matriz[j1.getPosiY()][j1.getPosiX()]=='_')
                    {
                        retorno=0;
                    }
                    matriz[j1.getPosiY()][j1.getPosiX()]='J';
                }
                else
                    System.out.println("Movimentacao invalida!");
                break;
                
            case 'a':
                if(j1.getPosiX()-1>=0)
                {
                    matriz[j1.getPosiY()][j1.getPosiX()]='_';
                    j1.setPosiX(-1);
                    
                    if(matriz[j1.getPosiY()][j1.getPosiX()]=='T')
                    {
                        j1.setExp(1);
                        System.out.println("Parabéns, você encontrou um tesouro! Nova pontuação de experiência:\n" + j1.getExp());
                        retorno=1;
                    }
                    else if(matriz[j1.getPosiY()][j1.getPosiX()]=='_')
                    {
                        retorno=0;
                    }
                    matriz[j1.getPosiY()][j1.getPosiX()]='J';
                }
                else
                    System.out.println("Movimentacao invalida!");
                break;
                
            case 's':
                if(j1.getPosiY()+1<matriz.length)
                {
                    matriz[j1.getPosiY()][j1.getPosiX()]='_';
                    j1.setPosiY(1);
                    
                    if(matriz[j1.getPosiY()][j1.getPosiX()]=='T')
                    {
                        j1.setExp(1);
                        System.out.println("Parabéns, você encontrou um tesouro! Nova pontuação de experiência:\n" + j1.getExp());
                        retorno=1;
                    }
                    else if(matriz[j1.getPosiY()][j1.getPosiX()]=='_')
                    {
                        retorno=0;
                    }
                    matriz[j1.getPosiY()][j1.getPosiX()]='J';
                }
                else
                    System.out.println("Movimentacao invalida!");
                break;
                
            case 'd':
                if(j1.getPosiX()+1<matriz[0].length)
                {
                    matriz[j1.getPosiY()][j1.getPosiX()]='_';
                    j1.setPosiX(1);
                    
                    if(matriz[j1.getPosiY()][j1.getPosiX()]=='T')
                    {
                        j1.setExp(1);
                        System.out.println("Parabéns, você encontrou um tesouro! Nova pontuação de experiência:\n" + j1.getExp());
                        retorno=1;
                    }
                    else if(matriz[j1.getPosiY()][j1.getPosiX()]=='_')
                    {
                        retorno=0;
                    }
                    matriz[j1.getPosiY()][j1.getPosiX()]='J';
                }
                else
                    System.out.println("Movimentacao invalida!");
                break;
                
            default:
                retorno = -1;
                
        }
        return retorno;
    }
    
    public static char[][] criaMatriz(int ordemMatriz, char[][] matriz, int quantTesouros)
    {
        Random gerador = new Random();
        
        matriz = new char[ordemMatriz][ordemMatriz];
        
        for(int i=0; i<ordemMatriz; i++)
        {
            for(int j=0; j<ordemMatriz; j++)
            {
                if(i==0 && j==0)
                {
                    matriz[i][j]='J';
                }
                else
                    matriz[i][j]='_';
            }
        }
        
        int i, j;
        if(quantTesouros>ordemMatriz*ordemMatriz-1)
        {
            System.out.println("Quantidade de tesouros inválida! Digite uma quantidade inferior à "+(ordemMatriz*ordemMatriz-1)+".");
            quantTesouros=new Scanner(System.in).nextInt();
        }
        for(int auxTesouros=quantTesouros; auxTesouros>0;)
        {
            i=gerador.nextInt(ordemMatriz-1);
            j=gerador.nextInt(ordemMatriz-1);
            
            if(matriz[i][j]=='_')
            {
                matriz[i][j]='T';
                auxTesouros--;
            }
        }
        
        return matriz;
    }
    
    public static void imprimeMatriz(char[][] matriz, int ordemMatriz)
    {
       for(int i=0; i<ordemMatriz; i++)
        {
            for(int j=0; j<ordemMatriz; j++)
            {
                System.out.printf("%c ", matriz[i][j]);
            }
            System.out.println("");
        } 
    }

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        
        int ordemMatriz;
        int quantTesouros;
        String nomeJogador;
        int expJogador;
        
        System.out.println("Informe a ordem da matriz (N x N):");
        ordemMatriz=teclado.nextInt();
        
        System.out.println("Informe a quantidade de tesouros: ");
        quantTesouros=teclado.nextInt();
        
        System.out.println("Informe o nome do jogador: ");
        teclado.nextLine();
        nomeJogador=teclado.nextLine();
        
        System.out.println("Informe os pontos de experiecia do jogador: ");
        expJogador=teclado.nextInt();
        
        Jogador j1 = new Jogador(nomeJogador, expJogador);
        
        char[][] matriz = new char[ordemMatriz][ordemMatriz];
        matriz=criaMatriz(ordemMatriz, matriz, quantTesouros);
        //criaMatriz(ordemMatriz, matriz, quantTesouros);
        imprimeMatriz(matriz, ordemMatriz);
        
        int acao=0;
        char mov;
        
        while(acao!=2)
        {
            System.out.println("EXP: "+j1.getExp());
            System.out.println("Informe a opcao: ");
            System.out.println("1 - Para movimentar o jogador");
            System.out.println("2 - Para sair");
            
            acao=teclado.nextInt();
            if(acao==2)
            {
                System.out.println("O jogador "+j1.getNome()+" se encontra na posicao ("+j1.getPosiY()+", "+j1.getPosiX()+") e sua pontuacao de experiencia he "+j1.getExp()+".");
                continue;
            }
            
            System.out.println("Informe a movimentacao:");
            
            mov=teclado.next().charAt(0);
            
            movimento(mov, matriz, j1);
            
            imprimeMatriz(matriz, ordemMatriz);
        }
    }
}
