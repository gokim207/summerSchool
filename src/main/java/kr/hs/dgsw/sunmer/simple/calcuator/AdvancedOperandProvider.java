package kr.hs.dgsw.sunmer.simple.calcuator;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AdvancedOperandProvider implements OperandProvider {
    @Override
    public Operands makeOperands() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 개열의 정수를 입력하세요");
        int op1 = scanner.nextInt();
        int op2 = scanner.nextInt();
        scanner.close();

        return new Operands(op1, op2);
    }
}
