/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 *
 * @author mgacosta
 */
public class Laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       // int contador=3;
        Resultado valor;
        vehiculo v=new vehiculo("600");
      // valor= v.Valor();
     
     // System.out.println(" Valor " +  valor.GetTexto());
        v.SetPotencia(2000);
        v.SetTraccion(true);
        System.out.println("Las caracteristicas de mi Coche son "+ v.muestraVehiculo());
    }
}
