package kr.hs.dgsw.sunmer.simple.house;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cooking implements Subject{

    @Override
    public void teach() {
        System.out.println("요리를 가르친다.");
    }
}
