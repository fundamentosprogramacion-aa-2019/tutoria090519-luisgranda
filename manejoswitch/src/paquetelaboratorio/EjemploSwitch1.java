/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetelaboratorio;

import java.util.Scanner;

public class EjemploSwitch1 {
    public static void main(String[] args) {
        Scanner dentrada = new Scanner(System.in);
        String placa;
        
        // Codigo que permite reconocer las placas de vehiculos de la región Costa
        
        System.out.println("¿Cual es la Placa de su Vehiculo?");
        placa = dentrada.nextLine();
        // Char se va a utilizar para ubicar la posicion cero de la placa que
        // el usuario ingrese
        char lplaca = placa.charAt(0);
        
        
        switch(lplaca){
            case 'e':
            case 'E':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Esmeraldas\n", 
                        placa.toUpperCase());
                break;
            case 'j':
            case 'J':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Santo Domingo de los Tsáchilas\n", 
                        placa.toUpperCase());
                break;
            case 'M':
            case 'm':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Manabí\n", 
                        placa.toUpperCase());
                break;
            case 'r':
            case 'R':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Los Ríos\n", 
                        placa.toUpperCase());
                break;
            case 'g':
            case 'G':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Guayas\n", 
                        placa.toUpperCase());
                break;
            case 'y':
            case 'Y':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Santa Elena\n", 
                        placa.toUpperCase());
                break;
            case 'o':
            case 'O':
                System.out.printf("Su placa %s es de la provincia de "
                        + "El Oro\n", 
                        placa.toUpperCase());
                break;            
            default:
                System.out.printf("La placa %s no pertenece a la "
                        + "regiòn de la Costa\n", 
                        placa.toUpperCase ());
        }
    }
}
