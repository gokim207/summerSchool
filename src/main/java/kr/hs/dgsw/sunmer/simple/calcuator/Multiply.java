package kr.hs.dgsw.sunmer.simple.calcuator;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Multiply implements ArithmeticOperator{

    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 * operand2;
    }

    @Override
    public String getOperator() {
        return "*";
    }
}
