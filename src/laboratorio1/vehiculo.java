/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 *
 * @author mgacosta
 */
public class vehiculo {
    
    private String modelo;
    private double potencia;
    private boolean cRuedas;
   
  
    public vehiculo(String modelo){
        this.modelo=modelo;
    } 
    public void SetPotencia(double potencia){
        this.potencia=potencia;
    }
    public void SetTraccion(boolean traccion){
        this.cRuedas=traccion;
    }
    public double GetPotencia(){
        return potencia;
    }
    public boolean GetTraccion(){
        return cRuedas;
    }
  
    public String muestraVehiculo(){
        if (cRuedas==true){
            return "Modelo: "+ modelo+" Potencia " + potencia +" Tracción cuatro ruedas.";
        }
        else{
            return "Modelo: "+ modelo+" Potencia " + potencia +" Sin Tracción cuatro ruedas.";
        }
    }
}
