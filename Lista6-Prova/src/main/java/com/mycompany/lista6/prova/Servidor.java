/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista6.prova;

/**
 *
 * @author Gabriel Mattos
 */
public class Servidor
{
    private String IP;
    private String idioma;
    private String regiao;
    private String link;
    
    public Servidor(String ip, String idioma, String regiao, String link)
    {
        this.IP=ip;
        this.idioma=idioma;
        this.regiao=regiao;
        this.link=link;
    }
    
    public String getIP()
    {
        return this.IP;
    }
    
    public String getIdioma()
    {
        return this.idioma;
    }
    
    public String getRegiao()
    {
        return this.regiao;
    }
    
    public String getLink()
    {
        return this.link;
    }
    
    public void setIP(String ip)
    {
        this.IP=ip;
    }
    
    public void setIdioma(String idioma)
    {
        this.idioma=idioma;
    }
    
    public void setRegiao(String regiao)
    {
        this.regiao=regiao;
    }
    
    public void getLink(String link)
    {
        this.link=link;
    }
    
}
