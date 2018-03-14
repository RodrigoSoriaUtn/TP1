/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigo.soria.tps.tp1.Models;

import java.util.Calendar;

/**
 *
 * @author Rodrigo Soria
 */
public class EmpleadoPermanente extends Empleado{
      
    private Double sueldoBasico;
    private Double porcentajeGanancia;

    public EmpleadoPermanente(int anio_ingreso, String nombre, Double sueldoBasico, Double porcentaje) {
        super(anio_ingreso, nombre);
        this.porcentajeGanancia = porcentaje;
        this.sueldoBasico = sueldoBasico;
    }
    
    @Override
    public Double getSueldo() {
       Double sueldo;
       Calendar calendario = Calendar.getInstance();
       
       int diferenciaDeAnio = calendario.get(Calendar.YEAR) - getAnio_ingreso();
       
       sueldo = diferenciaDeAnio * ((porcentajeGanancia/100) * sueldoBasico);
       
       return sueldo;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Double getPorcentaje() {
        return porcentajeGanancia;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentajeGanancia = porcentaje;
    }
    
    @Override
    public boolean equals(Object o) {
        boolean resp = false;
        
        if(o != null && o instanceof Empleado ){
            EmpleadoPermanente e = (EmpleadoPermanente) o;
            resp = super.equals(o) && sueldoBasico.equals(e.getSueldoBasico()) && porcentajeGanancia.equals(e.getPorcentaje());
        }
        
        return resp;
    }
    
    @Override
    public  EmpleadoPermanente clone() throws CloneNotSupportedException{
        
        EmpleadoPermanente x = (EmpleadoPermanente)super.clone(); 
        return x;
    }
    
    @Override
    public String toString(){
        return super.toString() 
                + " | Sueldo Basico: $" + sueldoBasico
                + " | Porcentaje de ganancia: " + porcentajeGanancia;
    }
    
    
}