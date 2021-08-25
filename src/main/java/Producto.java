/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57321
 */
//Atributos


public class Producto {
private String id;
private String nombre;
private Object imagen;
private String descripcion;
private int cantidadProducto = 0;


//Constructor
public Producto(String id,String nombre, Object imagen,String descripcion){
    this.id = id;
    this.nombre = nombre;
    this.imagen = imagen;
    this.descripcion = descripcion;
 
}
//Métodos


public void sumarInventario(int cantidad){
    setCantidadProducto(getCantidadProducto()+ cantidad);
}
public void restarInventario(int cantidadFacturada){
    if (cantidadFacturada < cantidadProducto){
        setCantidadProducto(getCantidadProducto() - cantidadFacturada);
    }
    else{
        System.out.println("Lo sentimos,no hay suficientes productos disponibles");
}
    
}

// Setters y Getters

public String getId(){
    return id;
}
public void setId(String id){
    this.id = id;
}
public int getCantidadProducto(){
    return cantidadProducto;
}
public void setCantidadProducto(int cantidadProducto){
    this.cantidadProducto =  cantidadProducto;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public Object getImagen(){
    return imagen;
}
public void setImagen(Object imagen){
    this.imagen = imagen;
}
public String getDescripcion(){
    return descripcion;
}
public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
}


}