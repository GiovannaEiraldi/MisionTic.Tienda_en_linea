/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57321
 */
public class PlataformaDePago {
    private String metodoPago;
    private String numeroTarjeta;
    private String pin;
    private String nombre;
    
    
    
//Setters y Getters
public void setMetodoPago(String metodoPago){
    this.metodoPago = metodoPago;
}   
public String getMetodoPago(){
    return metodoPago;
}
public void setNumeroTarjeta(String numeroTarjeta){
    this.numeroTarjeta = numeroTarjeta;
}
public String getNumeroTarjeta(){
    return numeroTarjeta;
}
public void setPin(String pin){
    this.pin = pin;
}
public String getPin(){
    return pin;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public String getNombre(){
    return nombre;
}
}