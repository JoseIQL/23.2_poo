import house.Cat;
import house.SilentCat;
import house.Turtle;
import house.WildCat;

public class Main {
    public static void main(String[] args) {
        SilentCat bolaDeNieve = new SilentCat();
        WildCat miMichi = new WildCat();
        Turtle donatelo = new Turtle();
//bolaDeNieve y miMichi son los objetos.
        donatelo.setName("Donatelo");
        donatelo.setAge(50);
        donatelo.setSpeed(5);
        donatelo.setColor(3);

        bolaDeNieve.setEnergy(1);
        bolaDeNieve.setAge(6);
        bolaDeNieve.setColor(1);
        bolaDeNieve.setName("Bola de Nieve");

        miMichi.setEnergy(1);
        miMichi.setAge(6);
        miMichi.setColor(1);
        miMichi.setName("Mi michi");

        System.out.println("Rutina de entrenamiento\n");
        for (int i = 0; i < 4; i++) {
            miMichi.jump();
            bolaDeNieve.jump();
        }

        System.out.println(miMichi.getName() + " "+ miMichi.jump());
        System.out.println(bolaDeNieve.getName() + " " + bolaDeNieve.jump());
        System.out.println(donatelo.getName() + " " + donatelo.swim());
    }
}