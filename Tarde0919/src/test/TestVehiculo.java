package test;

import entidades.Auto;
import entidades.Avion;
import entidades.Vehiculo;
import java.util.Scanner;

public class TestVehiculo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        System.out.println("**** accedo a clase vehiculo------");
//        // Creo vehiculo1 e ingreso los valores
//        Vehiculo vehiculo1 = new Vehiculo();
//        System.out.println("Ingrese Fabricante del vehiculo1:");
//        vehiculo1.setFabricante(entrada.nextLine());
//        System.out.println("Ingrese Matricula del vehiculo1:");
//        vehiculo1.setMatricula(entrada.nextLine());
//        System.out.println("Ingrese año de fabricacion del vehiculo1:");
//        vehiculo1.setAnioFabricacion(entrada.nextInt());
//        System.out.println("Ingrese Velocidad maxima del vehiculo1:");
//        vehiculo1.setVelocidadMaxima(entrada.nextDouble());
//        // Muestro los valores
//        System.out.println("Los datos del vehiculo son:");
//        System.out.println("Vehiculo 1 Fabricante:" + vehiculo1.getFabricante());
//        System.out.println("Vehiculo 1 Matricula:" + vehiculo1.getMatricula());
//        System.out.println("Vehiculo 1 año de fabricacion:" + vehiculo1.getAnioFabricacion());
//        System.out.println("Vehiculo 1 Velocidad maxima:" + vehiculo1.getVelocidadMaxima());

//        // Accedo a metodos de la clase vehiculo
//        vehiculo1.arrancar();
//        double dl;
//        System.out.println("Ingrese aceleracion:");
//        dl = entrada.nextDouble();
//        vehiculo1.acelerar(dl);
//        System.out.println("Ingrese frenado:");
//        vehiculo1.frenar(entrada.nextDouble());
//        vehiculo1.apagar();
//        System.out.println(vehiculo1.toString());
//        
//        Vehiculo vehiculo2=new Vehiculo("Peugeot","KIY88765f",2000,350);
//        vehiculo2.arrancar();
//        vehiculo2.acelerar(88);
//        vehiculo2.frenar(44.5);
//        vehiculo2.apagar();
//        System.out.println(vehiculo2.toString());
        Auto auto1 = new Auto();
        auto1.setAnioFabricacion(2000);
        auto1.setFabricante("Peugeot");
        auto1.setMatricula("Peu3476HJ");
        auto1.setModelo("207 SW");
        auto1.setPatente("POJ 124");
        auto1.setVelocidadMaxima(200);
        System.out.println(auto1.toString());
        auto1.tocarBocina();
        auto1.arrancar();
        auto1.acelerar(100);
        auto1.frenar(50);
        auto1.apagar();
        System.out.println("==========================");
        Avion avion1=new Avion("Fadea"," C-130H",2005,593,20);
        avion1.despegar();
        avion1.aterrizar();
        System.out.println(avion1);
        System.out.println("----------------------------");
        Avion avion2=new Avion("Embraer", " E-190", 2009, 890, 108);
        System.out.println(avion2);
        
    }
}
