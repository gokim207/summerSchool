package kr.hs.dgsw.sunmer.simple.house;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class House {
    // 방
    private final Room room;

    // 문
    private final Door door;

    public House(Room room, Door door){
        this.room = room;
        this.door = door;
    }

    @PostConstruct
    public void init(){
        System.out.println("Room is " + ((room == null) ? "null" : "exist"));
    }
}
