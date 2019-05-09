/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoswitch;

/**
 *
 * @author Granda
 */
public class UsoSwitch {
    public static void main(String[] args){
        //Todo code applications logic here
        
        String cadena = "Martes1";
        switch(cadena){
            case "Lunes":
                System.out.printf("Día %s", cadena);
                break;
            case "Martes":
                System.out.printf("Día %s", cadena);
                break;
            default:
            System.out.printf("Ninguna opcion es encontrada");    
        }
    }
}
