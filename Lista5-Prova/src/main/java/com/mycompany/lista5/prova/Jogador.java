/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista5.prova;

/**
 *
 * @author Gabriel Mattos
 */
public class Jogador
{
    private String nome;
    private int pontosDeVida;
    private int nivel;
    private int experiencia;
    
    private int posiX;
    private int posiY;
    
    private int forcaDeDefesa;
    private int forcaDeAtaque;
    
    public Jogador(String nome, int posiX, int posiY)
    {
        this.nome = nome;
        this.pontosDeVida = 5;
        this.nivel = 1;
        this.experiencia = 1;
        this.posiX = posiX;
        this.posiY = posiY;
        
        calculoForca();
    }
    
    private void calculoForca()
    {
        this.forcaDeDefesa = this.nivel * this.experiencia * this.experiencia;
        this.forcaDeAtaque = 2 * this.experiencia * this.nivel * this.nivel;
    }
    
    public int getAtaque()
    {
        return this.forcaDeAtaque;
    }
    
    public int getDefesa()
    {
        return this.forcaDeDefesa;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getVida()
    {
        return this.pontosDeVida;
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
        return this.experiencia;
    }
    
    public int getNivel()
    {
        return this.nivel;
    }
    
    public void setPosiX(int x)
    {
        this.posiX+=x;
    }
    
    public void setPosiY(int y)
    {
        this.posiY+=y;
    }
    
    public void aumentaNivel(int nivel)
    {
        this.nivel+=nivel;
        calculoForca();
    }
    
    public void setVida(int pv)
    {
        this.pontosDeVida+=pv;
        calculoForca();
    }
    
    public void setExp(int exp)
    {
        this.experiencia+=exp;
        calculoForca();
    }
    
    @Override
    public String toString()
    {
        //return "Nivel:" + this.nivel + "; Ataque:" + this.forcaDeAtaque + "; defesa:" + this.forcaDeDefesa + ".";
        return "Nome: "+this.nome+
                "\nPosicao: ("+this.posiY+","+this.posiX+")"+
                "\nPontos de vida: "+this.pontosDeVida+
                "\nNivel: "+this.nivel+
                "\nExperiência: "+this.experiencia+
                "\nForça de Defesa: "+this.forcaDeDefesa+
                "\nForça de Ataque: "+this.forcaDeAtaque
                ;
    }
    
}

