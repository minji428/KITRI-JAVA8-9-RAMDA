package kr.re.kitri.interfacedemo;

public class TestModernInterface implements ModernInterface{

    @Override
    public int addTwoNumbers(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        TestModernInterface test = new TestModernInterface();

        System.out.println(test.subTwoNumber(5, 3));

        ModernInterface.multiplyTowNumber(3, 5);


    }
}
