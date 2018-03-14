/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigo.soria.tps.tp1.Models;

/**
 *
 * @author Rodrigo Soria
 */
public class EmpleadoTemporal extends Empleado {
    
    private Double sueldoXhora;
    private int horasTrabajo;

    public EmpleadoTemporal(int anio_ingreso, String nombre, Double sueldoXhora, int horasTrabajo) {
        super(anio_ingreso, nombre);
        this.sueldoXhora = sueldoXhora;
        this.horasTrabajo = horasTrabajo;
    }
    
    @Override
    public Double getSueldo() {
       Double sueldo;
       sueldo = sueldoXhora * horasTrabajo;
       return sueldo;
    }

    public Double getSueldoXhora() {
        return sueldoXhora;
    }

    public void setSueldoXhora(Double sueldoXhora) {
        this.sueldoXhora = sueldoXhora;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }
    
     @Override
    public boolean equals(Object o) {
        boolean resp = false;
        
        if(o != null && o instanceof Empleado ){
            EmpleadoTemporal e = (EmpleadoTemporal) o;
            resp = super.equals(o) && sueldoXhora.equals(e.getSueldoXhora()) && horasTrabajo == e.getHorasTrabajo();
        }
        
        return resp;
    }
    
    @Override
    public  EmpleadoTemporal clone() throws CloneNotSupportedException{
        
        EmpleadoTemporal x = (EmpleadoTemporal)super.clone(); 
        return x;
    }
    
    @Override
    public String toString(){
        return super.toString() 
                + " | Sueldo Por hora: $" + sueldoXhora
                + " | Horas de trabajo: " + horasTrabajo;
    
    
    }
}
