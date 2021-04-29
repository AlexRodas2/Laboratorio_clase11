/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Proceso_Datos {
    
    private ArrayList<Object> a= new ArrayList<Object>();
    
    public Proceso_Datos(){
    
}
    public Proceso_Datos(ArrayList<Object> a){
    this.a=a;
}
    public void crearRegistro(Datos_Personales p){
        this.a.add(p);
    }
    
    public void modificarRegistro(int i,Datos_Personales p){
        this.a.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.a.remove(i);
    }
 
    public Datos_Personales obtenerRegistro(int i){
        return (Datos_Personales)a.get(i);
    }
    
    public int cantidadRegistros(){
        return this.a.size();
    }
    
    public int buscarEdad(int edad){
        for (int i=0; i<cantidadRegistros(); i++){
            if(edad==obtenerRegistro(i).getEdad())return i;
        }
        return -1;
    }
}
