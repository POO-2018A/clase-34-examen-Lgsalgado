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
public class Equilatero extends Triangulo implements Calculos {
    double lado1;

    public Equilatero(double lado1, String nombre) {
        super(nombre);
        this.lado1 = lado1;
    }

    
     @Override
    public double obtenerArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     
        double aux= (double)Math.sqrt(3)/2;
        double lado=(double)Math.pow(lado1,3);
        
        return  aux*lado;
        
    
    }

    @Override
    public double obtenerPerimetro() {
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return lado1*3;
    }

    @Override
    public double obtenerAltura() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    double aux= (double)Math.sqrt(3)/2;
    return aux*lado1;
    }
    
    
}
