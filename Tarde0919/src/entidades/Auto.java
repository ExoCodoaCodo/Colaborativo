package entidades;

public class Auto extends Vehiculo{
    //Atributos
    private String patente;
    private String modelo;

    // Metodo constructor
    public Auto(){
        
    }
    public void setPatente(String patente){
        this.patente=patente;
    }
    public String getPatente(){
        return patente;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return modelo;
    }
    @Override
    public String toString(){
       return super.toString()+" modelo:" + modelo +" patente:"+patente;
    }
    
    public void tocarBocina(){
        System.out.println("pi pi pi pi pi");
    }
    
    public void apagar(){
        System.out.println("Estoy apagando el auto!!!");
    }
    
}
