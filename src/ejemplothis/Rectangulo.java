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
public class Rectangulo {
    
    float base, altura;
    
    public Rectangulo(){
    }
    
    public Rectangulo (float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    //Llamamos al constructor con this
    public Rectangulo (float b){
        this (b, 4);
        
    }
    
    public void setBase (float base){   
        this.base = base;   
    }    
    public void setAltura (float altura){
        this.altura = altura;  
    }    
    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }
   
    
    public Rectangulo incrementar(){
        base++;
        altura = altura + 2; //altura+=2;
        return this;
    
    }
    
    public void calcularArea (){
        float area = base*altura;
        System.out.println("Area: "+area);
    }
    
    //Metodo llamado mudarBase que le de el valor 15 a base y que retorne un objeto de tipo Rectangulo
    public Rectangulo mudarBase (){
        base = 15;
        return this;
    }
    
    @Override
public String toString(){
    return "Base: "+ base + "   Altura: " + altura;
}
}



