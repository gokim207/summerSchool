package kr.hs.dgsw.sunmer.simple.calcuator;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Calculator {

    private final OperandProvider operandProvider;

    private final ArithmeticOperator arithmeticOperator;

    @PostConstruct
    public void execute() {

        // 피연산자를 입력받는다.
        Operands operands = operandProvider.makeOperands();
//        OperandProvider operandProvider = new OperandProvider();
//        Operands operands = operandProvider.makeOperands();

        // 개산을 수행한다.
        int result = arithmeticOperator.calculate(operands.getOperand1(), operands.getOperand2());

        // 결과를 출력한다.
        ResultPrinter printer = new ResultPrinter();
        printer.printResult(operands, result, arithmeticOperator.getOperator());
    }

//    public void setOperandProvider(OperandProvider operandProvider) {
//        this.operandProvider = operandProvider;
//    }
//
//    public void setArithmeticOperator(ArithmeticOperator arithmeticOperator) {
//        this.arithmeticOperator = arithmeticOperator;
//    }

//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        calculator.setOperandProvider(new AdvancedOperandProvider());
//        calculator.setArithmeticOperator(new Adder());
//        calculator.setArithmeticOperator(new Subtractor());
//        calculator.execute();
//    }
}
