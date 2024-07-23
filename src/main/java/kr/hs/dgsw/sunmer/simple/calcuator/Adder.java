package kr.hs.dgsw.sunmer.simple.calcuator;

import org.springframework.stereotype.Component;

@Component
public class Adder implements ArithmeticOperator {
    public int calculate(Operands operands) {
        return calculate(operands.getOperand1(), operands.getOperand2());
    }

    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 + operand2;
    }

    @Override
    public String getOperator() {
        return "+";
    }
}
