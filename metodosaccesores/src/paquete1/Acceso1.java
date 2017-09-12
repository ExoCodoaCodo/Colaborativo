
package paquete1;


public class Acceso1 {
    
     private int edad;
     private double altura;
     private String nombre;
     private double peso;
     private String nacionalidad;
     
     public void setEdad(int e){
     edad=e;
     }
   
     public int getEdad(){
      return edad;
     }
      
    
    public static void main(String [] args){
    
    Acceso1 obj1 = new Acceso1();
    
        obj1.edad=15;
        obj1.nombre="juan";
        obj1.altura=1.5;
        obj1.peso=65;
        
     Acceso1 obj2 = new Acceso1();
    
        obj2.edad=15;
        obj2.nombre="pepe";
        obj2.altura=1.5;
        obj2.peso=65;
        
        System.out.println(obj1.nombre.toUpperCase());
        System.out.println(obj2.nombre);
   
    
    }
    
}
