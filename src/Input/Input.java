package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
//    -------------콘솔입출력-----------------
    //자바에서 사용자가 입력한 문자열을 얻기 위해서는 다음과 같이 System.in을 사용한다.
    public static void main(String[] args) throws IOException {
        //throws IOException : InputStream으로부터 값을 읽어 들일 때는 IOException라는 예외가 발생할 수 있기 때문에 이를 처리를 해야 하는데 throws로 예외 처리를 뒤로 미루게 한 것이다.

        InputStream in = System.in;

        int a;
        a = in.read();
        //read 메서드는 1byte 크기의 사용자의 입력을 받아들인다. int값은 0~255 사이의 정수값으로, 이는 아스키코드값이다.

        System.out.println(a);

//        ------------
//        3개의 글자를 받고싶으면 아래처럼 2개를 추가하면 된다
//        int b;
//        int c;
//
//        b = in.read();
//        c = in.read();
//
//        System.out.println(b);
//        System.out.println(c);
//        ------------
//        더 간단하게 하려면 이렇게도 가능
//        byte[] a = new byte[3];
//        in.read(a);
//
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        ------------

        //아스키코드로 출력이 아니라 문자값 그대로 출력하려면 이렇게
        InputStreamReader reader = new InputStreamReader(in);
//        InputStream in = System.in;
        char[] b = new char[3];
        reader.read(b);

        System.out.println(b);

        //위처럼 고정된 값을 받는 것이 아니라 길이 상관없이 입력값 받도록하려면 이렇게
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String c = br.readLine();
        System.out.println(c);

//        정리 :
//        InputStream: byte를 읽는다.
//        InputStreamReader: character(문자)를 읽는다.
//        BufferedReader: String(문자열)을 읽는다.


//        새로 추가된 입력방법
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next()); //Scanner 객체의 next() 메서드는 한 개의 토큰(token)을 읽어 들인다.
//        next: 토큰을 읽어 들일 수 있다.
//        nextLine: 라인을 읽어 들일 수 있다.
//        nextInt: 정수를 읽어 들일 수 있다.


//        출력방법
        System.out.println("일반 출력");
        System.err.println("에러 출력");
    }
}
