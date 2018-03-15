/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigo.soria.tps.tp1.Models;

import java.util.Calendar;

/**
 *
 * @author usuario
 */
public class Jefe extends EmpleadoPermanente{
    private ListaEmpleados empleadosAcargo;
    private Double saldoExtra;

    public Jefe(int anio_ingreso, String nombre, Double sueldoBasico, Double porcentaje) {
        super(anio_ingreso, nombre, sueldoBasico, porcentaje);
        this.empleadosAcargo = new ListaEmpleados();
        this.saldoExtra = 200.0;
    }
     @Override
    public Double getSueldo() {
       Double sueldo;
       sueldo = super.getSueldo() + (this.saldoExtra * empleadosAcargo.cantidadEmpleados());
       return sueldo;
    }
    
    public void agregarEmpleado(Empleado emp){
        empleadosAcargo.agregarEmpleado(emp);
    }
    
}
