package kr.hs.dgsw.sunmer.simple;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    @PostConstruct
    public void init() {
        System.out.println("MyBean 생성됨");
    }



}
