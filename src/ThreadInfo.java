// 스레드

import java.util.ArrayList;

//Thread 객체를 만들 때 앞서 살펴본 예처럼 Thread 클래스를 상속하여 만들기도 하지만 주로 Runnable 인터페이스를 사용한다. 왜냐하면 Thread 클래스를 상속하면 Thread 클래스를 상속한 클래스가 다른 클래스를 상속할 수 없기 때문이다.
public class ThreadInfo implements Runnable {
    int seq;
    public ThreadInfo(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq+" thread start.");
        try {
            Thread.sleep(1000);
        }catch(Exception e) {
        }
        System.out.println(this.seq+" thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i=0; i<10; i++) {
            Thread t = new Thread(new ThreadInfo(i));
            t.start();
            threads.add(t);
        }

        for(int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); //스레드가 모두 종료된 후 그다음 작업을 진행해야 할 때 join 메서드를 꼭 기억하자.
            }catch(Exception e) {
            }
        }
        System.out.println("main end.");
    }
}