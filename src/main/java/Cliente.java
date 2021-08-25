/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57321
 */
public class Cliente {
//Atributos
private String id;
private String nombre;
private String correo;
private String direccion;
private String numeroTlf;

public Cliente(String id,String nombre, String correo, String direccion, String numeroTlf){
    this.id = id;
    this.nombre = nombre;
    correo = correo;
    direccion = direccion;
    numeroTlf = numeroTlf;
    
}
public String getId(){
    return id;
}
}