package animales;

public class Pez extends Animal{
    
    @Override
    public void desplazarse(){
        System.out.println("Soy un pez y me desplazo nadando");
    }
    
    // Constructor
    public Pez (String nombre){
        this.nombre=nombre;
    }
    
    public Pez(){
        
    }
    
    public Pez (String nombre, int peso, int altura){
        super(nombre,peso,altura);
    }
    
    @Override
    public String toString(){
        return "Pez:"+super.toString();
    }
}
