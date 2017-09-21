package animales;

public class Animal {
    // atributos
    private int peso;
    private int altura;
    protected String nombre;
    
    public void desplazarse(){
        System.out.println("Soy un animal y me desplazo");
    }
    
    public void presentarse(){
        System.out.println("Mi nombre es:"+nombre);
    }
    
    public int getPeso(){
        return peso;
    }
    public int getAltura(){
        return altura;
    }
    public String getNombre(){
        return nombre;
    }
    public void setPeso(int peso){
        this.peso=peso;
    }
    public void setAltura(int altura){
        this.altura=altura;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    @Override
    public String toString(){
        return "nombre:"+nombre+" peso:"+peso+" altura:"+altura;
    }
    
    public Animal(String nombre,int peso,int altura){
        this.nombre=nombre;
        this.peso=peso;
        this.altura=altura;
    }
    
    public Animal(){
        
    }
    
}
