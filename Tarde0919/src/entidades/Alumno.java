package entidades;

public class Alumno extends Persona{
    // Atributos
    private String matricula;
    
    // Metodo Construtor
    public Alumno(){
        
    }
    
    public Alumno(String nombre, int edad, String matricula){
        super(nombre,edad);
        //this.setNombre(nombre);
        //this.setEdad(edad);
        this.matricula=matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    @Override
    public String toString(){
        return "Alumno:"+super.toString()+" matricula:"+matricula;
    }
}
