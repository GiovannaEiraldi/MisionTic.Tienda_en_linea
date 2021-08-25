
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57321
 */
public class CarritoDeCompras {
//Atributos
private Producto producto;
private ArrayList<Producto> listaProductos;
private int cantidad;
private float costoUnidad;
private float totalCompras;



//Constructor
public CarritoDeCompras(ArrayList listaProductos, int cantidad, float costoUnidad, float totalCompras){
    this.listaProductos = listaProductos;
    this.cantidad = cantidad;
    this.costoUnidad = costoUnidad;
    this.totalCompras = totalCompras;
}

//Métodos

public void agregarProducto(Producto producto, ArrayList listaProductos){
    listaProductos.add(producto);   
}

public void eliminarProducto(String id){
    int i = 0;    
    while( i < listaProductos.size()){
        if  (listaProductos.get(i).getId().equals(id)){
            listaProductos.remove(i);
            break;
        }          
        i =+ 1;
          
}

//SETTERS Y GETTERS

}
public float getTotalCompras(){
    return totalCompras;
}

}
