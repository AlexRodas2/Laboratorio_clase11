//Crear atributos datos personales/
package Principal;

/**
 *
 * @author Usuario
 */
public class Datos_Personales {
    private int edad;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String genero;
    private String dpi;
    
    //crear constructor vacio//
    
    public Datos_Personales(){
        
    }
    
    public Datos_Personales(int edad, String nombre, String apellido, String telefono, String direccion, String genero, String dpi) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
        this.dpi = dpi;
    }
 
    //set y get//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

  

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
