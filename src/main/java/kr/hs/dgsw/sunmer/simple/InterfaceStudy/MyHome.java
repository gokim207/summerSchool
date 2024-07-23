package kr.hs.dgsw.sunmer.simple.InterfaceStudy;

public class MyHome {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.eat("사료");
        System.out.println(animal1.makeSound());

        animal2.eat("사료");
        System.out.println(animal2.makeSound());
    }
}
