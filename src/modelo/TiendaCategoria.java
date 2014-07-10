package modelo;
// Generated 10-jul-2014 15:21:40 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * TiendaCategoria generated by hbm2java
 */
public class TiendaCategoria  implements java.io.Serializable {


     private Integer idCategoria;
     private String nombre;
     private String icono;
     private String descripcion;
     private Set tiendaProductos = new HashSet(0);

    public TiendaCategoria() {
    }

	
    public TiendaCategoria(String nombre) {
        this.nombre = nombre;
    }
    public TiendaCategoria(String nombre, String icono, String descripcion, Set tiendaProductos) {
       this.nombre = nombre;
       this.icono = icono;
       this.descripcion = descripcion;
       this.tiendaProductos = tiendaProductos;
    }
   
    public Integer getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIcono() {
        return this.icono;
    }
    
    public void setIcono(String icono) {
        this.icono = icono;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getTiendaProductos() {
        return this.tiendaProductos;
    }
    
    public void setTiendaProductos(Set tiendaProductos) {
        this.tiendaProductos = tiendaProductos;
    }




}


