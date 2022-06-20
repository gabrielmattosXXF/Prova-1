/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista5.prova;
import java.util.*;

/**
 *
 * @author Gabriel Mattos
 */
public class Lista5Prova
{
    public static char[][] criaMatriz(int ordemMatriz, char[][] matriz, int quantTesouros, Jogador j1, Jogador j2)
    {
        Random gerador = new Random();
        
        matriz = new char[ordemMatriz][ordemMatriz];
        
        for(int i=0; i<ordemMatriz; i++)
        {
            for(int j=0; j<ordemMatriz; j++)
            {
                matriz[i][j]='_';
            }
        }
        
        int i, j;
        
        //posição jogador 1
        j1.setPosiX(gerador.nextInt(ordemMatriz-1));
        j1.setPosiY(gerador.nextInt(ordemMatriz-1));
        
        for(int veri=0; veri==0;)
        {
            j2.setPosiX(gerador.nextInt(ordemMatriz-1));
            j2.setPosiY(gerador.nextInt(ordemMatriz-1));
            
            if(j2.getPosiX()!=j1.getPosiX() || j2.getPosiY()!=j1.getPosiY())
            {
                veri=1;
            }
        }
        
        matriz[j1.getPosiY()][j1.getPosiX()]=j1.getNome().charAt(0);
        matriz[j2.getPosiY()][j2.getPosiX()]=j2.getNome().charAt(0);
        
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
    
    public static int movimento(char mov, char[][] matriz, Jogador j1, Jogador j2)
    {
        int retorno=-1;
        switch(mov)
        {
            case 'w':
                if(j1.getPosiY()-1>=0)
                {
                    if(matriz[j1.getPosiY()-1][j1.getPosiX()]==j2.getNome().charAt(0))
                    {
                        Tabuleiro.desafia(j1, j2);
                    }
                    else
                    {
                        matriz[j1.getPosiY()][j1.getPosiX()]='_';
                        j1.setPosiY(-1);

                        if(matriz[j1.getPosiY()][j1.getPosiX()]=='T')
                        {
                            Tabuleiro.coletaTesouro(j1, matriz);
                            retorno=1;
                        }
                        else if(matriz[j1.getPosiY()][j1.getPosiX()]=='_')
                        {
                            retorno=0;
                        }
                        matriz[j1.getPosiY()][j1.getPosiX()]=j1.getNome().charAt(0);
                    }
                }
                else
                    System.out.println("Movimentacao invalida!");
                break;
                
            case 'a':
                if(j1.getPosiX()-1>=0)
                {
                    if(matriz[j1.getPosiY()][j1.getPosiX()-1]==j2.getNome().charAt(0))
                    {
                        Tabuleiro.desafia(j1, j2);
                    }
                    else
                    {
                        matriz[j1.getPosiY()][j1.getPosiX()]='_';
                        j1.setPosiX(-1);

                        if(matriz[j1.getPosiY()][j1.getPosiX()]=='T')
                        {
                            Tabuleiro.coletaTesouro(j1, matriz);
                            retorno=1;
                        }
                        else if(matriz[j1.getPosiY()][j1.getPosiX()]=='_')
                        {
                            retorno=0;
                        }
                        matriz[j1.getPosiY()][j1.getPosiX()]=j1.getNome().charAt(0);
                    }
                }
                else
                    System.out.println("Movimentacao invalida!");
                break;
                
            case 's':
                if(j1.getPosiY()+1<matriz.length)
                {
                    if(matriz[j1.getPosiY()+1][j1.getPosiX()]==j2.getNome().charAt(0))
                    {
                        Tabuleiro.desafia(j1, j2);
                    }
                    else
                    {
                        matriz[j1.getPosiY()][j1.getPosiX()]='_';
                        j1.setPosiY(1);

                        if(matriz[j1.getPosiY()][j1.getPosiX()]=='T')
                        {
                            Tabuleiro.coletaTesouro(j1, matriz);
                            retorno=1;
                        }
                        else if(matriz[j1.getPosiY()][j1.getPosiX()]=='_')
                        {
                            retorno=0;
                        }
                        matriz[j1.getPosiY()][j1.getPosiX()]=j1.getNome().charAt(0);
                    }
                }
                else
                    System.out.println("Movimentacao invalida!");
                break;
                
            case 'd':
                if(j1.getPosiX()+1<matriz[0].length)
                {
                    if(matriz[j1.getPosiY()][j1.getPosiX()+1]==j2.getNome().charAt(0))
                    {
                        Tabuleiro.desafia(j1, j2);
                    }
                    else
                    {
                        matriz[j1.getPosiY()][j1.getPosiX()]='_';
                        j1.setPosiX(1);

                        if(matriz[j1.getPosiY()][j1.getPosiX()]=='T')
                        {
                            Tabuleiro.coletaTesouro(j1, matriz);
                            retorno=1;
                        }
                        else if(matriz[j1.getPosiY()][j1.getPosiX()]=='_')
                        {
                            retorno=0;
                        }
                        matriz[j1.getPosiY()][j1.getPosiX()]=j1.getNome().charAt(0);
                    }
                }
                else
                    System.out.println("Movimentacao invalida!");
                break;
                
            default:
                retorno = -1;
                
        }
        return retorno;
    }

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        
        int ordemMatriz;
        int quantTesouros;
        String nomeJogador1;
        String nomeJogador2;
        
        System.out.println("Informe a ordem da matriz (N x N):");
        ordemMatriz=teclado.nextInt();
        
        System.out.println("Informe a quantidade de tesouros: ");
        quantTesouros=teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Informe o nome do jogador 1: ");
        nomeJogador1=teclado.nextLine();
        
        System.out.println("Informe o nome do jogador 2: ");
        nomeJogador2=teclado.nextLine();
        
        Jogador j1 = new Jogador(nomeJogador1, 0, 0);
        Jogador j2 = new Jogador(nomeJogador2, 0, 0);
        
        char[][] matriz = new char[ordemMatriz][ordemMatriz];
        
        matriz=criaMatriz(ordemMatriz, matriz, quantTesouros, j1, j2);
        
        imprimeMatriz(matriz, ordemMatriz);
        
        int acao=0;
        char mov;
        
        while(acao!=2)
        {
            if(j1.getVida()<=0 || j2.getVida()<=0)
            {
                System.out.println("Fim do jogo!");
            }
            
            System.out.println(j1.getNome());
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
            
            movimento(mov, matriz, j1, j2);
            
            imprimeMatriz(matriz, ordemMatriz);
            
            //simplificar com um doc de turnos
            if(j1.getVida()<=0 || j2.getVida()<=0)
            {
                System.out.println("Fim do jogo!");
            }
            System.out.println(j2.getNome());
            System.out.println("Informe a opcao: ");
            System.out.println("1 - Para movimentar o jogador");
            System.out.println("2 - Para sair");
            
            acao=teclado.nextInt();
            if(acao==2)
            {
                System.out.println("O jogador "+j2.getNome()+" se encontra na posicao ("+j2.getPosiY()+", "+j2.getPosiX()+") e sua pontuacao de experiencia he "+j2.getExp()+".");
                continue;
            }
            
            System.out.println("Informe a movimentacao:");
            
            mov=teclado.next().charAt(0);
            
            movimento(mov, matriz, j2, j1);
            
            imprimeMatriz(matriz, ordemMatriz);
        }
    }
}
