package kr.hs.dgsw.sunmer.web.controller;

import kr.hs.dgsw.sunmer.web.service.FactorialService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MathController {

    private final FactorialService factorialService;

    @GetMapping("/factorial")
    public String factorial(Model model,
                            @RequestParam("value") int value) {

        int answer = factorialService.factorial(value);

        model.addAttribute("num", value);
        model.addAttribute("factorial", answer);

        return "factorial";
    }
}
