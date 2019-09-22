/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muñeco.buscador;

import java.util.Scanner;

/**
 *
 * @author Tiffany
 */
public class MuñecoBuscador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Scanner leer = new Scanner(System.in);
        boolean ganador=false;
        int ganar=0;
        Cuadro C= new Cuadro();
        //NumAleatorio A=new NumAleatorio();
        C.CrearCuadro();
        C.ImprimirCuadro();
        
        do{
            System.out.println("Elige que movimiento deseas hacer");
            System.out.println("1: Mover Arriba \t2: Mover Abajo \t3: Mover Izquierda \t4: Mover Derecha \t0: Salir");
            System.out.print("Respuesta: ");
            ganar= leer.nextInt();
            switch(ganar)
            {
          
                case 0: 
                    C.ImprimirLineas();
                    C.ImprimirCuadro();
                    break;
                case 1:
                    C.ImprimirLineas();
                    C.MArriba();
                    C.ImprimirCuadro();
                    ganar=C.ganador();
                    break;
                
                case 2:
                    C.ImprimirLineas();
                    C.MAbajo();
                    C.ImprimirCuadro();
                    ganar=C.ganador();
                    break;
                
                case 3:
                    C.ImprimirLineas();
                    C.MIzquierda();
                    C.ImprimirCuadro();
                    ganar=C.ganador();
                    break;
                    
                case 4:
                    C.ImprimirLineas();
                    C.MDerecha();
                    C.ImprimirCuadro();
                    ganar=C.ganador();
                    break;
                
                default:
                    C.ImprimirLineas();
                    System.out.println("INGRESA UNA OPCION VALIDA");
                    C.ImprimirCuadro();
                    break;
            }
                    
           
        }while(ganar!=0);
        
        
        
        ganador=C.Ganar;
           if(ganador)
           {
               System.out.print("\n\n\n");
               System.out.println("\t\t\tFELICIDADES HAS LLEGADO A LA META");
           }
           else
           {
               System.out.print("\n\n\n");
               System.out.println("\t\t\tHAS ELEGIDO SALIR SUERTE EN TU PROXIMO INTENTO");
           }
      
        
    }
        
        
        
    }
    

