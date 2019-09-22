/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muñeco.buscador;

/**
 *
 * @author Tiffany
 */
public class NumAleatorio {
     public void numero(){
        int NumeroAleatorio=0;
        NumeroAleatorio=(int)(Math.random()*50);
        System.out.print(NumeroAleatorio);
        //return NumeroAleatorio;
    }
    public int  Num(int rango){
        int NumeroAleatorio=0;
        
        do{
            NumeroAleatorio=(int)(Math.random()*rango);
            
        }while(NumeroAleatorio<1);
        
        return NumeroAleatorio;
    }
}
