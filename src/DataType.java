public class DataType {
    public static void main(String[] args) {

        /* -----------------숫자------------------*/

//      정수
//      int	-2147483648 ~ 2147483647
//      long	-9223372036854775808 ~ 9223372036854775807
        int age = 10;
        long countOfStar = 8764827384923849L; //int 자료형의 최댓값인 2147483647보다 크면 8764827384923849L처럼 끝에 접미사로 L 자를 붙여 주어야 한다. 만약 큰 숫자에 접미사 L을 누락하면 컴파일 오류가 발생한다.

//        실수
        float pi = 3.14F; // float 변수에 값을 대입할 때에는 3.14F처럼 끝에 접미사로 F 자를 꼭 붙여 주어야 한다. float 자료형에 값을 대입할 때 접미사를 누락하면 컴파일 오류가 발생한다. 대문자 F 대신 소문자 f를 사용해도 된다.
        double morePi = 3.14159265358979323846;
//      실수의 지수표현
        double d1 = 123.4;
        double d2 = 1.234e2; //d1과 d2의 값은 123.4로 같다. d2의 e2는 10의 제곱을 의미한다.

//      8진수와 16진수
        int octal = 023;    // 십진수: 19 , 숫자 0으로 시작하면 8진수
        int hex = 0xC;     // 십진수: 12 , 숫자 0과 알파벳 x로 시작하면 16진수

//      숫자 연산
        System.out.println(7 % 3);  // 1 출력
        System.out.println(3 % 7);  // 3 출력

//      증감 연산
        int i = 0;
        int j = 10;
        i++;
        j--;

        System.out.println(i);  // 1 출력
        System.out.println(j);  // 9 출력


        /* -----------------참/거짓------------------*/
        boolean isSuccess = true;
        boolean isTest = false;

        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if (isTall) {
            System.out.println("키가 큽니다.");
        }

        /* -----------------문자------------------*/
        char a1 = 'a';  // 문자로 표현
        char a2 = 97;  // 아스키코드로 표현
        char a3 = '\u0061';  // 유니코드로 표현

        System.out.println(a1);  // a 출력
        System.out.println(a2);  // a 출력
        System.out.println(a3);  // a 출력


        /* -----------------문자열------------------*/
        String a = "Happy Java"; // 리터널방식(고정된 값을 그대로 대입하는 방법), 가급적이면 이 방법으로 사용하자
        String b = new String("a"); //항상 새로운 String 객체를 만든다

//        원시자료형(int, long, double, float, boolean, char)은 리터널 방식으로 정의한다.
//        String은 원시자료형은 아니지만 리터널 방식을 사용할 수 있도록 자바에서 특별대우해주는 자료형이다.

//        문자열 내장 메서드

//        equals : 문자열 2개가 같은지를 비교하여 결괏값을 리턴한다.
        String d = "hello";
        String e = "java";
        String f = new String("hello");;
        System.out.println(d.equals(e)); // false 출력
        System.out.println(d.equals(f)); // true 출력
        System.out.println(d == f);  // false, 이처럼 문자열의 비교에는 꼭 equals를 사용해야 한다. '=='는 리터널과 new로 생성한 것을 다르다고 평가함

//        indexOf : 문자열에서 특정 문자열이 시작되는 위치(인덱스값)를 리턴한다.
        String g = "Hello Java";
        System.out.println(g.indexOf("Java"));  // 6 출력, 0부터 세기 시작함

//        contains : 문자열에서 특정 문자열이 포함되어 있는지 여부를 리턴한다.
        System.out.println(g.contains("Java"));  // true 출력

//        charAt : 문자열에서 특정 위치의 문자를 리턴한다.
        System.out.println(g.charAt(6));  // "J" 출력

//        replaceAll : 문자열에서 특정 문자열을 다른 문자열로 바꿀 때 사용
        System.out.println(g.replaceAll("Java", "World"));  // Hello World 출력

//        substring : 문자열에서 특정 문자열을 뽑아낼 때 사용
        System.out.println(g.substring(0, 4));  // Hell 출력

//        toUpperCase : 문자열을 모두 대문자로 변경할 때 사용, 소문자는 toLowerCase
        System.out.println(g.toUpperCase());  // HELLO JAVA 출력

//        split : 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴
        String h = "a:b:c:d";
        String[] result = h.split(":");  // result는 {"a", "b", "c", "d"}

//        문자열 포매팅
       /*
        %s  문자열(String), 그런데 어떤 형태도 들어감
        %c	문자 1개(character)
        %d	정수(Integer)
        %f	부동소수(floating-point)
        %o	8진수
        %x	16진수
        %%	Literal % (문자 % 자체)
        */
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", 3, "five"));  // "I ate 3 apples. so I was sick for five days." 출력
        System.out.println(String.format("Error is %d%%.", 98));  // "Error is 98%." 출력, %는 %%로 적어야함
        System.out.println(String.format("%10s", "hi"));  // "        hi" 출력
        System.out.println(String.format("%-10sjane.", "hi"));  // "hi        jane." 출력
        System.out.println(String.format("%.4f", 3.42134234));  // 3.4213 출력
        System.out.println(String.format("%10.4f", 3.42134234));  // '    3.4213' 출력, 전체길이 10개 점 뒤에 4개

//        String.format 안쓰고 println대신 printf써도 사용가능하다
        System.out.printf("I eat %d apples.", 3);  // "I eat 3 apples." 출력
//        String.format은 문자열을 리턴하는 메서드이고, System.out.printf는 문자열을 출력하는 메서드라는 점에서 차이가 있다.


        /* -----------------숫자------------------*/

        /* -----------------숫자------------------*/

        /* -----------------숫자------------------*/

        /* -----------------숫자------------------*/

        /* -----------------숫자------------------*/

        /* -----------------숫자------------------*/

        /* -----------------숫자------------------*/

        /* -----------------숫자------------------*/
    }
}