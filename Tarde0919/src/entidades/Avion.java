package entidades;

public class Avion extends Vehiculo{
    // Atributos
    private int cantPasajeros;
    
    // Metodo constructor
    public Avion(){
        
    }
    
    public Avion(String fabricante,String matricula,int anioFabricacion,
    double velocidadMaxima,int cantPasajeros){
        super(fabricante,matricula,anioFabricacion,velocidadMaxima);
        this.cantPasajeros=cantPasajeros;
    }
    
    public String toString(){
        return super.toString()+" cant. pasajeros:"+cantPasajeros;
    }
    
    public int getCantPasajeros(){
        return cantPasajeros;
    }
    
    public void setCantPasajeros(int cantPasajeros){
        this.cantPasajeros=cantPasajeros;
    }
    
    public void aterrizar(){
        System.out.println("Soy un avion y estoy aterrizando");
    }
    
    public void despegar(){
        System.out.println("Soy un avion y estoy despegando");
    }
}


