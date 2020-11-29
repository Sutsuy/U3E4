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
public class AppGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer=new Scanner (System.in);
        
        boolean continuar=true;
        
        int opc;
        int palabra [] = new int [10] ;
        PilaDinamica pila=new PilaDinamica();
        PilaDinamica2 pila2 = new PilaDinamica2();
        
        
        while(continuar){
        System.out.println("MENU");
        System.out.println("1.- Insertar");
        System.out.println("2.- Eliminar ");
        System.out.println("3.- Mostrar ");
        System.out.println("4.- Salir ");
        System.out.println("Elige una opcion--> ");
        opc=leer.nextInt();
        
        
        
        switch (opc)
        {
            case 1:
                int aux = 0;
                
                for(int i = 0 ; i < 10; i++){
                    System.out.println("Ingresa los digitos "); 
                    palabra[i]=leer.nextInt();
                }
                pila.Empujar(palabra[0]);
                
                for(int i = 0 ; i < 10; i++){
                    if(palabra[0] > palabra[i]){
                        pila2.Empujar(palabra[i]);
                    }
                    else if(palabra[0] < palabra[i] ){
                        pila.Empujar(palabra[i]);
                    }
                }
                
               
                break;
                
            case 2:
                
                pila.SacarPila();
               
             break;
             
            case 3:
                System.out.println("Pila 1.");
                pila.mostrarPila();
                System.out.println("********************");
                
                System.out.println("Pila 2");
                pila2.mostrarPila();
                
            break;
                
            case 4:
               continuar= false;
              
               break;
                
            default:
                {
                    System.out.println("Opcio´n incorrecta.....Vuelve a intentarlo");                                                  
            
                }
                
                
            
            
            
        }
        
        
        
        
        
    }
    
    
    
    
    }
    
}
