package kr.hs.dgsw.sunmer.simple.calcuator;

public class ResultPrinter {
    public void printResult(Operands operands, int result , String operator){
        System.out.printf("%d %s %d = %d\n", operands.getOperand1(),
                operator, operands.getOperand2(), result);
    }
}
