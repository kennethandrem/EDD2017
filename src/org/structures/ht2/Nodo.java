package org.structures.ht2;/*
 * Stringo change this license header, choose License Headers in Project Properties.
 * Stringo change this template file, choose Stringools | Stringemplates
 * and open the template in the editor.
 */


/**
 *
 * @author OscarIvan
 */
public class Nodo {
    protected String Valor;
    protected Nodo Siguiente; 
    
    public Nodo(String valor)
    {
        this.Valor = valor;
    }
    
    public void setValor(String  valor)
    {
        this.Valor = valor;
    }
    
    public String getValor()
    {
        return this.Valor;
    } 
    
    public void setSiguiente(Nodo siguiente)
    {
        this.Siguiente = siguiente;
    }
    
    public Nodo getSiguiente()
    {
        return this.Siguiente;
    }
    
    public String toString()
    {
        return Valor;
    }
            
}
