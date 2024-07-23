package kr.hs.dgsw.sunmer.simple.calcuator;


import lombok.*;

@Getter
@Setter
public class Operands {
    private int operand1;

    private int operand2;

    public Operands(int op1, int op2){
        this.operand1 = op1;
        this.operand2 = op2;
    }
}
