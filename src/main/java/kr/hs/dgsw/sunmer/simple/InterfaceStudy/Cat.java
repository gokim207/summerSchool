package kr.hs.dgsw.sunmer.simple.InterfaceStudy;

public class Cat implements Animal{
    @Override
    public void eat(String food) {
        System.out.printf("고양이가 %s를 먹습니다\n" , food);
    }

    @Override
    public String makeSound() {
        return "야옹";
    }
}
