package kr.hs.dgsw.sunmer.simple;

public class Hello {

    public void sayHello(String name){
        System.out.printf("Hello %s\n" , name);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Hello hello1 = new Hello();
        Hello hello2 = new Hello();
        Hello hello3 = new Hello();
        hello1.sayHello("Pole");
    }
}
