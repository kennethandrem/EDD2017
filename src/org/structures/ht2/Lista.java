package org.structures.ht2;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OscarIvan
 */
public class Lista {
    
    protected Nodo Cabeza; 
    
    public void AgregarNodo(String valor)
    {
        Nodo Cola = ObtenerUltimo();
        //si no existe ningun nodo, crea la cabeza, de lo contrario agrega el nuevo Nodo al siguiente de la cola
        if ( Cola== null)
            Cabeza = new Nodo (valor);
        else                    
            Cola.setSiguiente(new Nodo(valor));                                            
    }
    public Nodo ObtenerCabeza()
    {
        return Cabeza;
    }
    public Nodo ObtenerUltimo(){
        Nodo NodoActual = Cabeza;
        if (NodoActual == null)
            return null;
        while (NodoActual.getSiguiente() !=  null)
        {
            NodoActual = NodoActual.getSiguiente();
        }
        return NodoActual;
        
    }
    public Nodo EliminarNodo()
    {
        Nodo NodoADevolver = Cabeza;
        try{
            Cabeza = Cabeza.getSiguiente();
        }catch (Exception e){
            return NodoADevolver;
        }

        return NodoADevolver;
    
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        if (Cabeza != null)
        {
            Nodo NodoActual = Cabeza;
            while (NodoActual!= null)
            {
                sb.append(NodoActual.getValor());
                sb.append ("->");
                NodoActual = NodoActual.getSiguiente();
            }
            
        }
        sb.append("null");
        return sb.toString();

    }
    
    
}
