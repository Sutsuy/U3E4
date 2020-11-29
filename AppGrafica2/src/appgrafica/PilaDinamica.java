/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgrafica;
import java.util.*;
/**
 *
 * @author sause
 */
public class PilaDinamica {
    
    NodoPila cima;
    int tamanio;
    
    public boolean EstaVacia()
    {
        return cima==null;
    }
    
    public void Empujar(int elemento){
        NodoPila nodo = new NodoPila(elemento);
       nodo.siguiente=cima;
            cima = nodo;
             tamanio++;
    }
    
    
    
    public      int  SacarPila()
    {
        int auxiliar=cima.elemento;       
        cima=cima.siguiente;
        tamanio --;
        
    
        return auxiliar; 
    }
    
    
    public void mostrarPila(){
        NodoPila recorre = cima;
        
            while(recorre!= null){
                System.out.println(recorre.elemento);
                recorre = recorre.siguiente;
            }
            
        }
    
}
