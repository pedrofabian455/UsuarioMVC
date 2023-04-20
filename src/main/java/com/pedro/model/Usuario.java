/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedro.model;

/**
 *
 * @author Fabian
 */
public class Usuario {
     private String nombre;
     private String email;
     
     public Usuario(){
         
     }
     
     public void setNombre(String name){
     this.nombre = name; 
     }
     public String getNombre(){
     
     return nombre;
     }
     
     public void setEmail(String email){
     this.email = email;
     }
     public String getEmail(){
     return email;
     }
}
