/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3.prova;

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
    
    private int forcaDeDefesa;
    private int forcaDeAtaque;
    
    public Jogador(String nome, int pVida, int nivel, int exp)
    {
        this.nome = nome;
        this.pontosDeVida = pVida;
        this.nivel = nivel;
        this.experiencia = exp;
        
        calculoForca();
    }
    
    public void calculoForca()
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
    
    public void aumentaNivel()
    {
        this.nivel+=1;
        calculoForca();
    }
    
    public void setVida(Jogador jog)
    {
        this.pontosDeVida-=jog.getAtaque()-this.getDefesa();
        calculoForca();
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getVida()
    {
        return this.pontosDeVida;
    }
    
    @Override
    public String toString()
    {
        return "Nivel:" + this.nivel + "; Ataque:" + this.forcaDeAtaque + "; defesa:" + this.forcaDeDefesa + ".";
    }
    
}
