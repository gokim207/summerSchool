package kr.hs.dgsw.sunmer.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    @GetMapping("/board/write")
    public String write() {
        return "write";
    }


    @GetMapping("/board/write.do")
    public String writeDo(){
        // 저장

        return "write-done";
    }
}
