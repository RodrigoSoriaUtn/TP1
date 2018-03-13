/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigo.soria.tps.tp1.Models;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Rodrigo Soria
 */
public class EmpleadoPermanente extends Empleado{
      
    private Double sueldoBasico;
    private Double porcentaje;

    public EmpleadoPermanente(int anio_ingreso, String nombre, Double sueldoBasico, Double porcentaje) {
        super(anio_ingreso, nombre);
        this.porcentaje = porcentaje;
        this.sueldoBasico = sueldoBasico;
    }
    
    @Override
    public Double getSueldo() {
       Double sueldo;
       Calendar calendario = Calendar.getInstance();
       
       int diferenciaDeAnio = calendario.get(Calendar.YEAR) - super.getAnio_ingreso();
       
       return sueldo;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

}