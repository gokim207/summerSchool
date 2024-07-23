package kr.hs.dgsw.sunmer.simple.InterfaceStudy;

public class Dog implements Animal{
    @Override
    public void eat(String food) {
        System.out.printf("강아지가 %s를 먹습니다\n", food);
    }

    @Override
    public String makeSound() {
        return "멍멍";
    }
}
