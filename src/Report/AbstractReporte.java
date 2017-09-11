/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;


import BD.ConexionBD;
import java.util.List;
import model.Atributo;
import model.Condicion;

/**
 *
 * @author kecc
 */
public abstract class AbstractReporte {
    
    protected ConexionBD conexionBD;

    public AbstractReporte(ConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    public abstract void generarReporte(String nombreTabla, List<Atributo> atributosMostrar, List<Condicion> condiciones) throws Exception;
    
}
