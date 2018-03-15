/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigo.soria.tps.tp1;

import rodrigo.soria.tps.tp1.Models.EmpleadoTemporal;
import rodrigo.soria.tps.tp1.Models.ListaEmpleados;

/**
 *
 * @author Rodrigo Soria
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaEmpleados empleados = new ListaEmpleados();
        for(int i = 0; i < 3; i++){
            EmpleadoTemporal emptemp = new EmpleadoTemporal(2017,"Numero"+i,50+Double.valueOf(i),8);
            empleados.agregarEmpleado(emptemp);
            System.out.println(emptemp.toString());
        }
        System.out.println(empleados.calcularSueldos());
        
    }
    
}
