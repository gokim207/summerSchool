package kr.hs.dgsw.sunmer.web.service.impl;

import ch.qos.logback.core.joran.conditional.IfAction;
import kr.hs.dgsw.sunmer.web.service.FactorialService;
import org.springframework.stereotype.Service;

@Service
public class FactorialServiceImpl implements FactorialService {

    @Override
    public int factorial(int value) {
        int total = 1;
        for (int i = 1; i <=value; i++) {
            total *= i;
        }

        return total;

//        if (value == 1){
//            return 1;
//        }
//        return value * factorial(value -1);
    }
}
