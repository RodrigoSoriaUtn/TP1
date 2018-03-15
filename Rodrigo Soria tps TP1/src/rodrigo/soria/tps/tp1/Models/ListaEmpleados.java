/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigo.soria.tps.tp1.Models;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class ListaEmpleados {
    private Map<Integer,Empleado> empleados = new HashMap<>();
    private int lastInsertedID = 0;
    
    public ListaEmpleados(){
        
    }
    
    public void agregarEmpleado(Empleado empleado){
        empleados.put(this.lastInsertedID+1, empleado);
        this.lastInsertedID++;
        
    }
    
    public Empleado quitarEmpleado(Integer idEmpleado){
        Empleado x = empleados.get(idEmpleado);
        empleados.remove(idEmpleado);
        return x;
    }
    
    public Double calcularSueldos(){
        Double result = 0d;
        
        for(Empleado e : empleados.values()){
            result += e.getSueldo();
        }
        
        return result;
    }
    
    public int cantidadEmpleados(){
        return empleados.size();
    }
    
}
