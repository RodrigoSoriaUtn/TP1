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
        this.id_empleado = Empleado.ultimoRegistro;
        Empleado.ultimoRegistro++;
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
    
    @Override
    public boolean equals(Object o) {
        boolean resp = false;
        
        if(o != null && o instanceof Empleado ){
            Empleado e = (Empleado) o;
            resp = nombre.equals(e.getNombre()) && anio_ingreso == e.getAnio_ingreso();
        }
        
        return resp;
    }
    
    
    @Override
    public  Empleado clone() throws CloneNotSupportedException{
        
        Empleado x = (Empleado)super.clone(); 
        return x;
    }
    
    @Override
    public String toString(){
        return  " | Nombre: " + nombre
              + " | Año de ingreso: " + anio_ingreso ;
    }
    
}
