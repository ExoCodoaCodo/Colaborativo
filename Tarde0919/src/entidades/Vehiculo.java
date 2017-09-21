package entidades;

public class Vehiculo {
    private String fabricante;
    private String matricula;
    private int anioFabricacion;
    private double velocidadMaxima;

    // Metodo constructor
    public Vehiculo(){
        
    }
    
    public Vehiculo(String fabricante,String matricula,int anioFabricacion,
    double velocidadMaxima){
     this.fabricante=fabricante;
     this.matricula=matricula;
     this.anioFabricacion=anioFabricacion;
     this.velocidadMaxima=velocidadMaxima;
    }
    
    @Override
    public String toString(){
        return "fabricante:"+fabricante+" matricula:"+matricula+
                " Año Fabricacion:"+anioFabricacion+
                " Velocidad Maxima:"+velocidadMaxima;
    }
    
    public void arrancar(){
        System.out.println("Estoy arrancando el vehiculo");
    }
    public void acelerar(double valor){
        System.out.println("Estoy acelerando en:"+valor+" km/h");
    }
   public void frenar(double valor){
        System.out.println("Estoy frenando en:"+valor+" km/h");
    }
   public void apagar(){
       System.out.println("Estoy apagando el vehiculo");
   }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
}
