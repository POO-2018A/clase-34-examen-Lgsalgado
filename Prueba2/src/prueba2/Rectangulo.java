/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

/**
 *
 * @author ESFOT
 */
public class Rectangulo extends Triangulo implements Calculos{
    double lado1;
    double lado2;
    double lado3;

    public Rectangulo(double lado1, double lado2,double lado3, String nombre) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 =lado3;
    }
 
    
     @Override
    public double obtenerArea() {
        
        
         System.out.println(""+lado1);
        System.out.println(""+lado2);
        System.out.println(""+lado3);
        double aux=(double) lado1*lado2;
        double ex=(double) aux/2;
         System.out.println(""+aux);
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return ex;
    }

    @Override
    public double obtenerPerimetro() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return lado1+lado2+lado3;
    }

    @Override
    public double obtenerAltura() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    
    return (lado1*lado2)/lado3;
    }
    
}
