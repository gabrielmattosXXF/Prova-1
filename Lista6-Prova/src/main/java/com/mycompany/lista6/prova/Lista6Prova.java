/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista6.prova;
import java.util.*;

/**
 *
 * @author Gabriel Mattos
 */
public class Lista6Prova
{

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        String IP;
        String idioma;
        String regiao;
        String link;
        
        Map<String, Servidor> mapa = new HashMap<>();
        
        int opcao=0;
        
        while(opcao!=4)
        {
            System.out.println("Digite:\n" +
                               "1 - Adicionar;\n" +
                               "2 - Remover;\n" +
                               "3 - Listar;\n" +
                               "4 - Encerrar.");
            opcao=teclado.nextInt();
            teclado.nextLine();
            
            switch(opcao)
            {
                case 1:
                    System.out.println("Informe o ip: ");
                    IP=teclado.nextLine();
                    System.out.println("Informe o link: ");
                    link=teclado.nextLine();
                    System.out.println("Informe a regiao: ");
                    regiao=teclado.nextLine();
                    System.out.println("Informe o idioma: ");
                    idioma=teclado.nextLine();
                    
                    while(mapa.containsKey(link))
                    {
                        System.out.println("Link já cadastrado. Informe outro link: ");
                        
                        link=teclado.nextLine();
                    }
                    mapa.put(link, new Servidor(IP, idioma, regiao, link));
                    break;
                    
                case 2:
                    System.out.println("Informe o link a ser removido: ");
                    link=teclado.nextLine();
                    
                    if(mapa.containsKey(link))
                    {
                        mapa.remove(link);
                    }
                    else if(mapa.isEmpty())
                    {
                        System.out.println("Nenhum servidor foi cadastrado!");
                    }
                    else
                    {
                        System.out.println("Chave invalida!");
                    }
                    break;
                    
                case 3:
                    for(String chave : mapa.keySet())
                    {
                        System.out.println("Link: "+chave);
                        System.out.println("Regiao: "+mapa.get(chave).getRegiao());
                        System.out.println("Idioma: "+mapa.get(chave).getIdioma());
                        System.out.println("");
                    }
                    break;  
            }
        }
    }
}
