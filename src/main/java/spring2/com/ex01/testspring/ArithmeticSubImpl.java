package spring2.com.ex01.testspring;

public class ArithmeticSubImpl implements Arithmetic{
    @Override
    public double calc(double num1, double num2) {
        return num1 - num2;
    }
}
