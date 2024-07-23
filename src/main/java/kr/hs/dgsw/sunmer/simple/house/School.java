package kr.hs.dgsw.sunmer.simple.house;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class School {

//    @Qualifier("computer")
    private final Subject subject;

//    @PostConstruct
    public void run() {
        subject.teach();
    }
}
