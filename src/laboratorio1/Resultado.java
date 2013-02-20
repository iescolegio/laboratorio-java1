/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.sql.ResultSet;

/**
 *
 * @author mgacosta
 */
public class Resultado {
    private String Texto;
    private ResultSet Datos;
    Resultado(String v){
        Texto=v;
    }
    public void SetTexto(String Texto){this.Texto=Texto;}
    public String GetTexto() {return (Texto);}
    public ResultSet GetDatos(){return (Datos);};
    
            
    
}
