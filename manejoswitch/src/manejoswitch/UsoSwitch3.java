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
public class UsoSwitch3 {
    public static void main(String[] args){
        //Todo code applications logic here
        
        String nombre = "esmeraldAS";
        char valor = nombre.charAt(0);
        
        switch(valor){
            case 'a':
            case 'A':
                System.out.printf("Nombre con inicial %s de %s\n",
                        valor, nombre.toUpperCase());
                break;
            case 'e':
                System.out.printf("Nombre con inicial %s de %s\n",
                        valor, nombre.toLowerCase());
                break;
                
            default:
                System.out.println("Ninguna de las anteriores");
        }
    }
}
