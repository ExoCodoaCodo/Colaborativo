package animales;

public class TestAnimales {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.desplazarse();
        Ave ave=new Ave();
        ave.desplazarse();
        Pez pez=new Pez();
        pez.desplazarse();
        MamiferoTerrestre mt=new MamiferoTerrestre();
        mt.desplazarse();
        ave.setNombre("Angry Birds");
        System.out.println("el nombre del ave es:"+ave.getNombre());
        System.out.println("---------------------------------------");
        Pez pez1=new Pez("Nemo");
        System.out.println("el nombre del pez es:"+pez1.getNombre());
        System.out.println("---------------------------------------");
        pez1.desplazarse();
        pez1.presentarse();
        ave.desplazarse();
        ave.presentarse();
        MamiferoTerrestre mt1=new MamiferoTerrestre("Monsta");
        mt1.desplazarse();
        mt1.presentarse();
        System.out.println(mt1);
        System.out.println(mt1.toString());
        System.out.println(pez1);
        System.out.println(ave);
        mt1.setAltura(2);
        mt1.setPeso(200);
        System.out.println("--------------------");
        pez1.setAltura(1);
        pez1.setPeso(10);
        ave.setAltura(1);
        ave.setPeso(5);
        System.out.println(mt1);
        System.out.println(pez1);
        System.out.println(ave);
        System.out.println("---------------------");
        Ave ave2=new Ave("Pajaro Loco",1,1);
        System.out.println(ave2);
        MamiferoTerrestre mt2=new MamiferoTerrestre("Rinoceronte",
        800,1);
        System.out.println(mt2);
        Pez pez2=new Pez("Tiburon",200,1);
        System.out.println(pez2);
        System.out.println("-----------------------");
        MamiferoTerrestre mt3=new MamiferoTerrestre("Elefante",
        1000,3);
        mt3.setTipoAlimentacion("Herbivoro");
        System.out.println(mt3);
        MamiferoTerrestre mt4=new MamiferoTerrestre("Leon",350,
        2,"carnivoro");
        System.out.println(mt4);
    }
}
