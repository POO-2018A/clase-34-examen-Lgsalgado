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
public class Escaleno extends Triangulo implements Calculos {
double lado1;
    double lado2;
    double lado3;

    public Escaleno(double lado1, double lado2, double lado3, String nombre) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    
    
    @Override
    public double obtenerArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     double p=obtenerPerimetro()/2;
        double aux=p*(p-lado1)*(p-lado2)*(p-lado3);
        double res= (double)Math.sqrt(aux);
        return  res;
   
    }

    @Override
    public double obtenerPerimetro() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return lado1+lado2+lado3;
    }

    @Override
    public double obtenerAltura() {
        double aux= (double) 2/lado1;
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return aux * obtenerArea();
    }
    
}
