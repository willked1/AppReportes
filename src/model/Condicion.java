/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kecc
 */
public class Condicion {
    public final static String[] TIPO_CONDICIONES = new String[]{"=", "<", ">", "like"};
    
    private Atributo atributo;
    private Object valor;
    private String tipoCondicion;

    public Condicion(Atributo atributo, String tipo_condicion, Object valor) {
        this.atributo = atributo;
        this.tipoCondicion = tipo_condicion;
        this.valor = valor;
    }

    public Atributo getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public String getTipoCondicion() {
        return tipoCondicion;
    }

    public void setTipoCondicion(String tipoCondicion) {
        this.tipoCondicion = tipoCondicion;
    }

    @Override
    public String toString() {
        if(valor instanceof String){
            return atributo.getNombre() + " " + this.tipoCondicion + " '" + valor.toString() + "'";
        }
        return atributo.getNombre() + " " + this.tipoCondicion + " " + valor.toString();
    }        
}
