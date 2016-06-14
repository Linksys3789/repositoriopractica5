/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_ed04_actividad;

import java.util.Date;
/**
 *
 * @author Samantha
 */
public class Banquero {
     protected String nombre_Banco;
    protected String direccion_Banco;
    protected Date Horario_banco;

    /**
     * @return the nombre_Banco
     */
    public String getNombre_Banco() {
        return nombre_Banco;
    }

    /**
     * @param nombre_Banco the nombre_Banco to set
     */
    public void setNombre_Banco(String nombre_Banco) {
        this.nombre_Banco = nombre_Banco;
    }

    /**
     * @return the direccion_Banco
     */
    public String getDireccion_Banco() {
        return direccion_Banco;
    }

    /**
     * @param direccion_Banco the direccion_Banco to set
     */
    public void setDireccion_Banco(String direccion_Banco) {
        this.direccion_Banco = direccion_Banco;
    }

    /**
     * @return the Horario_banco
     */
    public Date getHorario_banco() {
        return Horario_banco;
    }

    /**
     * @param Horario_banco the Horario_banco to set
     */
    public void setHorario_banco(Date Horario_banco) {
        this.Horario_banco = Horario_banco;
    }
    
    
}
