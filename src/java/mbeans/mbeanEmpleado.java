/*
 * Managed Bean para el formulario empleado.
 */
//declaramos nuestro paquete (donde esta almacenado este archivo Managed Bean)
package mbeans;

//imports necesarios para que el bean funcione (segundo import es para un alcance tipo request)
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author JR
 * 18/05/2019
 */
@ManagedBean
@RequestScoped
public class mbeanEmpleado {
    

    /**
     * contructor de la clase
     */
    public mbeanEmpleado() {
    }

    //variables privadas donde se almacenan los datos recibidos
    private String nombre;
    private String apellido;
    private String diastrabajados; 
    private String salariodia;
    private String sueldototal;
    private String sexo; //proceso especial para la variable sexo
    private String ciudad;
    private String idiomas[]; //materias es una matriz tipo string (metodos un poco diferentes)

    //funciones para accesar a las variables privadas
    //set asigna valor a la variable
    //get nos permite ver el valor de la variable
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

    public String getSexo() {
        return sexo;
    }

    
    //proceso especial para la variable sexo
    public void setSexo(String sexo) {
        //sexo recibe valores M o F .
        //haremos un corto proceso para que en lugar de M asigne el valor Masculino
        //y si es F asigne Femenino
        if (sexo.equals("M")) {
            this.sexo = "Masculino";
        } else {
            this.sexo = "Femenino";
        }

    }

        public String getDiasTrabajados() {
        return diastrabajados;
    }
      public void setDiasTrabajados (String diastrabajados) {
        this.diastrabajados = diastrabajados;
    }  
      
           public String getSalarioDia() {
        return salariodia;
    }
           
      public void setSalarioDia (String salariodia) {
        this.salariodia = salariodia;
    }
      
                 public String getSueldoTotal() {
        return sueldototal;
    }
           
      public void setSueldoTotal (String sueldototal) {
        this.sueldototal = sueldototal;
    }
      
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //materias es una matriz, por lo cual recibe y devuelve una matriz
    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }
    
}
