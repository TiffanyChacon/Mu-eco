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
public class Cuadro {
    boolean Ganar=false;
    
    String[][] pantalla = new String[21][51];
    NumAleatorio A=new NumAleatorio();
    int Metax=0,Metay=0;
    int Posx=1, Posy=1;
    public void CrearCuadro(){
        for(int x=0; x<21;x++)
        {
            for(int y=0; y<51;y++)
            {
                if((y==0||y==50)&&x>0)
                {
                    pantalla[x][y]="|";
                }
                else if((x==0||x==20)&&y>0)
                {
                    pantalla[x][y]="_";
                }
                else
                {
                    pantalla[x][y]=" ";
                }
            }  
        }
        Metax=A.Num(20);
        Metay=A.Num(50);
        pantalla[Metax][Metay]="#";
        pantalla[Posx][Posy]="O";
    }

    public void ImprimirCuadro(){
        for(int x=0; x<21;x++)
        {
            for(int y=0; y<51;y++)
            {               
                System.out.print(pantalla[x][y]);             
            }
            System.out.println();
        }
    }
  
    
    public void MDerecha(){
        if(Posy+1>50)
        {
            System.out.println("No se puede ejecutar movimiento, intenta con otro");
        }
        else
        {
           pantalla[Posx][Posy]=" ";
           Posy++;
           pantalla[Posx][Posy]="O";
        } 
    }
    
    public void MIzquierda(){
        if(Posy-1==0)
        {
            System.out.println("No se puede ejecutar movimiento, intenta con otro");
        }
        else
        {
            pantalla[Posx][Posy]=" ";
            Posy--;
            pantalla[Posx][Posy]="O";
        } 
    }
      
    public void MArriba(){
        if(Posx-1==0)
        {
            System.out.println("No se puede ejecutar movimiento, intenta con otro");
        }
        else
        {
            pantalla[Posx][Posy]=" ";
            Posx--;
            pantalla[Posx][Posy]="O";
        } 
    }

    public void MAbajo(){
        if(Posx+1>20)
        {
            System.out.println("No se puede ejecutar movimiento, intenta con otro");
        }
        else
        {
            pantalla[Posx][Posy]=" ";
            Posx++;
            pantalla[Posx][Posy]="O";
        } 
    }    
    
    
    
    public int ganador(){
        int x=5;
        if(Posx == Metax && Posy==Metay)
        {
            x=0;
            Ganar=true;
        }
        return x;
    }
    
    public void ImprimirLineas(){
        System.out.println("\n \n \n \n \n \n ");
        System.out.println("\n \n \n \n \n \n ");
        System.out.println("\n \n \n \n \n \n ");
        System.out.println("\n \n \n \n \n \n ");
        System.out.println("\n \n \n \n ");

    }
    
    
    
    
}
