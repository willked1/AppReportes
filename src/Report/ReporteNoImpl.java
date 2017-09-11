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
public class ReporteNoImpl extends AbstractReporte{

    public ReporteNoImpl(ConexionBD conexionBD) {
        super(conexionBD);
    }

    @Override
    public void generarReporte(String nombreTabla, List<Atributo> atributosMostrar, List<Condicion> condiciones) throws Exception{
        System.out.println("Nombre tabla: " + nombreTabla);
        System.out.println("Atributos a mostrar: ");
        for (Atributo atributo : atributosMostrar) {
            System.out.println("    " + atributo.getNombre() + " tipo: " + atributo.getTipoDato() + " longitud: " + atributo.getLongitud());
        }
        System.out.println("Condiciones: ");
        for (Condicion condicion : condiciones) {
            System.out.println("    " + condicion.toString());
        }
    }
}
