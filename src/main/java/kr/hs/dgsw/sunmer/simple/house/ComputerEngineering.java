package kr.hs.dgsw.sunmer.simple.house;


import org.springframework.stereotype.Component;

@Component(value = "computer")
public class ComputerEngineering implements Subject{

    @Override
    public void teach() {
        System.out.println("컴퓨터공학을 가르친다.");
    }
}
