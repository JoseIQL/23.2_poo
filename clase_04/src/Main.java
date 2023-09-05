// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Cat {
//  ATRIBUTOS
    private int age;
    private int color;
//  METODOS
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    public String jump() {
        return "juuumping";
    }
    

}
// HERENCIA
class SilentCat extends Cat{
    public String jump() {
        return "....";
    }

}

public class Main {
    public static void main(String[] args) {
        Cat miMichi = new Cat();
        miMichi.setAge(6);
        miMichi.setColor(1);
        System.out.println(miMichi.jump());


    }
}