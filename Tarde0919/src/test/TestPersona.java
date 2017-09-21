package test;

import entidades.Persona;

public class TestPersona {

    public static void main(String[] args) {
       
        System.out.println("**** accedo a objeto mediante metodos getter y setter------");
        // Pruebo clase de persona con getter y setter
        // Creo un objeto 
        Persona persona11 = new Persona();
        // Ingreso los datos
        persona11.obtener();
        // Muestro los datos y ya no lo puedo hacer directamente
        // a las variables de instancias
        // Debo acceder a traves de un metodo
        System.out.println("Nombre:" + persona11.getNombre());
        System.out.println("Edad:" + persona11.getEdad());
        if (persona11.esMayor()) System.out.println("La persona "+persona11.getNombre()+
                " es mayor de edad"); 

        
    }
}
