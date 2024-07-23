package kr.hs.dgsw.sunmer.simple.calcuator;

public class StupidOperandProvider implements OperandProvider {
    public Operands makeOperands() {
        return new Operands(3, 5);
    }
}
