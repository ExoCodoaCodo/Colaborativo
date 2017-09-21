package entidades;

import java.util.Scanner;

public class Persona {
    // Atributos

    private String nombre;
    private int edad;

    public Persona(String nombre,int edad){
      this.nombre=nombre;
      this.edad=edad;
    }
    
    public Persona(){
        
    }
    // Metodos
    public void obtener() {
        System.out.println("Ingrese nombre:");
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();
        do {
            System.out.println("Ingrese edad:");
            edad = teclado.nextInt();
        } while (edad < 0);
    }

    public boolean esMayor() {
        boolean es;
        es = false;
        if (edad > 18) {
            es = true;
        }
        return es;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Nombre:"+nombre+" edad:"+edad;
    }
  
}
