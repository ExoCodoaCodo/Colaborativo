/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Gaby
 */
public class PersonaGabriela {
    private int idusuario;
    private String nombre;
    private int edad;
    private String domicilio;
    private String dni;
    private String telefono;
    
    public void setIdUduario(int idusuario){
        this.idusuario = idusuario;
    }
    
    public int getIdUsuario(){
        return idusuario;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
      public void setEdad  (int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setdomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    
    public String getDomicilio(){
        return domicilio;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public String getDni(){
        return dni;
    }
     public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
}
