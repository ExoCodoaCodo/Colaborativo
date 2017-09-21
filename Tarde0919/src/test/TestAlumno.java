package test;

import entidades.Alumno;

public class TestAlumno {

    public static void main(String[] args) {
        Alumno alu = new Alumno();
        // Le voy a dar estado con los metodos set
        alu.setNombre("Juan Perez");
        alu.setEdad(25);
        alu.setMatricula("His12987");
        System.out.println(alu);
        Alumno alu1 = new Alumno("Bart Simpson", 10, "Psi985432");
        System.out.println(alu1);
        System.out.println(alu1.esMayor());
        Alumno alu2 = new Alumno();
        alu2.obtener();
        alu2.esMayor();
        if (alu2.esMayor()) System.out.println("El alumno "+alu2.getNombre()+
                " es mayor de edad"); 
    }
}
