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
public abstract class Empleado {
    
    private static int ultimoRegistro = 1;
    private int id_empleado;
    private int anio_ingreso;
    private String nombre;
    
    protected Empleado(int anio_ingreso, String nombre){
        this.anio_ingreso = anio_ingreso;
        this.nombre = nombre;
        this.id_empleado = this.ultimoRegistro;
        this.ultimoRegistro++;
    }
    
    public abstract Double getSueldo();
    
    public static int getUltimoRegistro() {
        return ultimoRegistro;
    }

    public int getId_empleado() {
        return id_empleado;
    }
    
    public int getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setAnio_ingreso(int anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
