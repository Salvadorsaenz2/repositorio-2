/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseleccion66136;

import java.util.Scanner;
/**
 *
 * @author salva
 */
public class EjercicioSeleccion66136 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner datousuario = new Scanner(System.in);
        
        System.out.println("Escribe el primer numero");    
    int cargador1 = datousuario.nextInt()
            ;
        System.out.println("Escribe el segundo numero");  
    int cargador2 = datousuario.nextInt();
    
        System.out.println("Escribe el tercer numero");  
    int cargador3 = datousuario.nextInt();
    
    if (cargador1 > cargador2 && cargador1 > cargador3)
        
        System.out.println("El numero mayor es: " + cargador1 );
        
    if (cargador2 > cargador1 && cargador2 > cargador3)
         System.out.println("El numero mayor es: " + cargador2);
         
    if (cargador3>cargador1 && cargador3>cargador2)
            System.out.println("El numero mayor es: "+ cargador3);
    
    
    
        
       
     
     
     }
    }
        
        
        
        
        
        
        
    
    
    

