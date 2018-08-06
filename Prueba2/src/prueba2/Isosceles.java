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
public class Isosceles extends Triangulo implements Calculos{
    double lado1;
    double lado2;

    public Isosceles(double lado1, double lado2, String nombre) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    
    
     @Override
    public double obtenerArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
       double aux=(double)Math.sqrt(Math.pow(lado1,2)-(Math.pow(lado2,2)/4));
        
        
    return (lado2*aux)/2;
    }

    @Override
    public double obtenerPerimetro() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return (2*lado1)+ lado2;
    }

    @Override
    public double obtenerAltura() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return Math.sqrt(Math.pow(lado1,2)-(Math.pow(lado2,2)/4)); 
    
    }
    
}
