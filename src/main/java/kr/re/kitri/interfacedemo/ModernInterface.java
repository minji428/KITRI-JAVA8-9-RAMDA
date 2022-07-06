package kr.re.kitri.interfacedemo;

public interface ModernInterface {

    int MY_INT =5;

    int addTwoNumbers(int a, int b);

    // 자바8에서 구상 메소드(Concrete method)가 추가
    default int subTwoNumber(int a, int b){
        someMethod();
        return a - b;
    }

    // static 메소드 추가
    static int multiplyTowNumber(int a, int b){
        return a * b;
    }

    // 자바9에서 하나 더 추가
    private void someMethod(){
        System.out.println("Hello world!");
    }
}
