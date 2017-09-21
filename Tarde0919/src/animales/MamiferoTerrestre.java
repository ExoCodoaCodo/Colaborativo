package animales;

public class MamiferoTerrestre extends Animal{
    private String TipoAlimentacion;
    
    public String getTipoAlimentacion(){
        return TipoAlimentacion;
    }
    
    public void setTipoAlimentacion(String TipoAlimentacion){
        this.TipoAlimentacion=TipoAlimentacion;
    }
    
    @Override
    public void desplazarse(){
        System.out.println("Soy un mamifero terrestre y"
                + " me deplazo caminando");
    }
    // Constructores
    public MamiferoTerrestre(String nombre){
        this.nombre=nombre;
    }
    public MamiferoTerrestre(){
        
    }
    
    public MamiferoTerrestre(String nombre,int peso,int altura){
        super(nombre,peso,altura);
    }
    
    public MamiferoTerrestre(String nombre,int peso,int altura,
            String tipoAlimentacion){
         super(nombre,peso,altura);
         this.TipoAlimentacion= tipoAlimentacion;
    }
    
    public String toString(){
        return "Mamifero terrestre:"+super.toString()+
                " Alimentacion:"+TipoAlimentacion;
    }
}
