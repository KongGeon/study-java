import java.text.SimpleDateFormat;
import java.util.Date;

class Counter {
    static int count = 0;
    //항상 값이 변하지 않는다면 static을 사용해 메모리 낭비를 줄일 수 있다.
    //static을 사용하는 또 다른 이유는 값을 공유할 수 있기 때문이다. static으로 설정하면 같은 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유하게 되는 것이다.
    Counter() {
        count++;  // count는 더이상 객체변수가 아니므로 this를 제거하는 것이 좋다.
        System.out.println(count);  // this 제거
    }
}

//스태틱 메서드 예제
class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}

//싱글톤 예제 :  단 하나의 객체만을 생성하게 강제하는 디자인 패턴
class Singleton {


    private Singleton() { // 이렇게 생성자를 private으로 만들어 버리면 Singleton 클래스를 다른 클래스에서 new를 이용하여 생성할 수 없게 된다.
    }

    public static Singleton getInstance() {
        return new Singleton();  // 같은 클래스이므로 생성자 호출이 가능하다.
    }

    //아래처럼 해야 맞음
    private static Singleton one;
    public static Singleton getInstance02() {
        if(one==null) {
            one = new Singleton();
        }
        return one;
    }


}

public class Static {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        //스태틱 메서드 예제 : 객체 생성 없이도 클래스를 통해 메서드를 직접 호출할 수 있다.
        System.out.println(Util.getCurrentDate("yyyyMMdd"));  // 오늘 날짜 출력

        //싱글톤 예제
//        Singleton singleton = new Singleton();  // 컴파일 오류가 발생한다.
        Singleton singleton = Singleton.getInstance(); // getInstance를 호출할 때마다 새로운 객체가 생성되기 때문에 이 역시 싱글톤이 아니다.

        Singleton singleton1 = Singleton.getInstance02();
        Singleton singleton2 = Singleton.getInstance02();
        System.out.println(singleton1 == singleton2);  // true 출력
    }
}
