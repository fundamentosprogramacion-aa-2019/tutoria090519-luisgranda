/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetelaboratorio;

import java.util.Scanner;

public class EjemploSwitch2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String placa;
        
        //Codigo que permite reconocer las placas de vehiculos de la región amazonica
        
        System.out.println("¿Cual es la Placa de su Vehiculo?");
        placa = entrada.nextLine();
        // Char se va a utilizar para ubicar la posicion cero de la placa que
        // el usuario ingrese
        char lplaca = placa.charAt(0); 
        
        switch(lplaca){
            case 'k':
            case 'K':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Sucumbíos\n", 
                        placa.toUpperCase());
                break;
            case 'q':
            case 'Q':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Orellana\n", 
                        placa.toUpperCase());
                break;
            case 'N':
            case 'n':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Napo\n", 
                        placa.toUpperCase());
                break;
            case 's':
            case 'S':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Pastaza\n", 
                        placa.toUpperCase());
                break;
            case 'v':
            case 'V':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Morona Santiago\n", 
                        placa.toUpperCase());
                break;
            case 'z':
            case 'Z':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Zamora Chinchipe\n", 
                        placa.toUpperCase());
                break;
            default:
                System.out.printf("La placa %s ingresada no pertenece a la "
                        + "regiòn amazonica\n", 
                        placa.toUpperCase ());
        }
    }
}
