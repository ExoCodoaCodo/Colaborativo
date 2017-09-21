package animales;

public class Ave extends Animal{
    @Override
    public void desplazarse(){
        System.out.println("Soy un ave y me desplazo volando");
    }
    
    public Ave(){
        
    }
    
    public Ave(String nombre){
        this.nombre=nombre;
    }
    
    public Ave(String nombre, int peso, int altura){
        this.nombre=nombre;
        this.setPeso(peso);
        this.setAltura(altura);
    }
    
    public String toString(){
        return "Ave:"+super.toString();
    }
}

