/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4.prova;

/**
 *
 * @author Gabriel Mattos
 */
public class Jogador
{
    private String nome;
    private int exp=0;
    private int posiX;
    private int posiY;
    
    public Jogador(String nome, int exp)
    {
        this.nome=nome;
        this.exp=exp;
        this.posiX=0;
        this.posiY=0;
    }
    
    public int getPosiX()
    {
        return posiX;
    }
    
    public int getPosiY()
    {
        return posiY;
    }
    
    public int getExp()
    {
        return exp;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setPosiX(int x)
    {
        this.posiX+=x;
    }
    
    public void setPosiY(int y)
    {
        this.posiY+=y;
    }
    
    public void setExp(int exp)
    {
        this.exp+=exp;
    }
}
