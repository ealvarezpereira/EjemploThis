/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplothis;

/**
 *
 * @author quique
 */
public class EjemploThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo(8,9);        
        System.out.println("Rect1: "+rec1.toString());
        
        //Rectangulo rec2 = new Rectangulo(6);
        //System.out.println("Rect2: "+rec2.toString());
        
        Rectangulo rec3 = rec1.incrementar();
        System.out.println("Rect3: "+rec3);
        
        rec1.calcularArea();
        
        Rectangulo rec4 = rec1.mudarBase();
        System.out.println("Rect4: "+rec4);
    }
    
}
