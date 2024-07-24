package kr.hs.dgsw.sunmer.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(Model model,
                        @RequestParam(value = "name", defaultValue = "XXX") String name){


        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/time")
    public String time(Model model){
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.now();

        SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyy년 M월 d일 HH:mm:ss");
        String now = dateFormat.format(date);

        model.addAttribute("now", now);

        return "time";
    }

    @GetMapping("/square")
    public String square(Model model,
                         @RequestParam(value = "value") int value) {
        int answer = value * value;
        model.addAttribute("value" , value);
        model.addAttribute("answer" , answer);
        return "square";
    }
}
