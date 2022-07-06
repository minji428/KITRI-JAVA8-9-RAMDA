package kr.re.kitri.interfacedemo;

public class TestInterface implements ClassicInterface{
    public static void main(String[] args) {
        System.out.println(ClassicInterface.MY_INT);
    }

    @Override
    public int addTwoNumbers(int a, int b) {
        return 0;
    }
}
