package kr.hs.dgsw.sunmer.web.controller;

import kr.hs.dgsw.sunmer.web.service.FactorialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MathApiController {

    private final FactorialService factorialService;

    @GetMapping("/api/factorial")
    public ResponseEntity<?> factorial(@RequestParam("value") int value) {
        int result = factorialService.factorial(value);

        return ResponseEntity.ok(result);
    }
}
