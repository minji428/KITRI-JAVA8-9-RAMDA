package kr.re.kitri.firstdemo;

public class LambdaDemo {

    public static void main(String[] args) {
        System.out.println("LamdaDemo");
        for (int i=1; i<= 10; i++){
            System.out.println("Main thread: " +i);
        }

        Thread anotherThread = new Thread(r);
        anotherThread.start();
    }

    static Runnable r = () -> {
        for (int i=1; i<= 10; i++){
            System.out.println("Another thread: " +i);
        }
    };
}
