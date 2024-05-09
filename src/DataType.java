import java.util.*;

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
        int aa = 0;
        int bb = 10;
        aa++;
        bb--;

        System.out.println(aa);  // 1 출력
        System.out.println(bb);  // 9 출력


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


        /* -----------------StringBuffer------------------*/

//        append : 문자열을 생성
        StringBuffer sb01 = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb01.append("hello");
        sb01.append(" ");
        sb01.append("jump to java");
        String sbResult = sb01.toString(); //string자료형으로 변경
        System.out.println(sbResult);  // "hello jump to java" 출력

//        이걸 string자료형으로 제작하면
        String stResult = "";
        stResult += "hello";
        stResult += " ";
        stResult += "jump to java"; // + 연산이 있을 때마다 새로운 string객체를 생성하므로(String 자료형은 값이 한 번 생성되면 변경할 수가 없다.) 이렇게하면 총 4개의 string자료형 객체가 만들어진다.
        System.out.println(stResult);  // "hello jump to java" 출력

//        StringBuffer 자료형은 String 자료형보다 무거운 편에 속한다. new StringBuffer()로 객체를 생성하면 String을 사용할 때보다 메모리 사용량도 많고 속도도 느리다. 따라서 문자열을 추가하거나 변경하는 작업이 많으면 StringBuffer를, 적으면 String을 사용하는 것이 유리하다.

//        insert : 문자열을 삽입
        StringBuffer sb02 = new StringBuffer();
        sb02.append("jump to java");
        sb02.insert(0, "hello ");
        System.out.println(sb02.toString()); // hello jump to java 출력

//        substring : String 자료형의 substring 메서드와 동일하게 동작
        StringBuffer sb03 = new StringBuffer();
        sb03.append("Hello jump to java");
        System.out.println(sb03.substring(0, 4)); // Hell 출력, substring(시작 위치, 끝 위치)


        /* -----------------배열------------------*/

//        int[] odds = {1, 3, 5, 7, 9};
//        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

//        배열 길이 설정
        String[] weeks = new String[2];
        weeks[0] = "월";
        weeks[1] = "화";
//        배열의 길이 구하기
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
            //월
            //화
        }

//      배열오류
//      System.out.println(weeks[7]);
//      여덟 번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 오류 발생

        /* -----------------리스트------------------*/
//        제네릭스: 뒷 부분의 자료형은 명확하므로 굳이 적지 않아도 된다.
        ArrayList<String> pitches = new ArrayList<>();

//        add
        pitches.add("138");
        pitches.add(0,"111"); //0번째에 추가
        System.out.println(pitches); //[111, 138]

//        get
        System.out.println(pitches.get(1)); //138

//        size
        System.out.println(pitches.size()); //2, 개수 확인

//        contains
        System.out.println(pitches.contains("142")); //false
        System.out.println(pitches.contains("111")); //true

//        remove
        System.out.println(pitches.remove("111"));  // 111을 리스트에서 삭제하고, true를 리턴한다.
        System.out.println(pitches.remove(0));  // pitches의 첫 번째 항목이 138이므로, 138을 삭제한 뒤 138을 리턴한다.

//        Arrays, 이미 문자열 배열이 있으면 ArrayList를 좀 더 편하게 생성할 수 있다.
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches02 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches02);  // [138, 129, 142] 출력
        ArrayList<String> pitches03 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches03); // [138, 129, 142] 출력

//        String.join :  각 요소를 콤마(,)로 구분해서 1개의 문자열
//        String.join 없이 만들기
        ArrayList<String> pitches04 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result04 = "";
        for (int i = 0; i < pitches04.size(); i++) {
            result04 += pitches04.get(i);
            result04 += ",";  // 콤마를 추가한다.
        }
        result04 = result04.substring(0, result04.length() - 1);  // 마지막 콤마는 제거한다.
        System.out.println(result04);  // 138,129,142 출력
//        String.join 사용버전, 배열에도 사용가능
        ArrayList<String> pitches05 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result05 = String.join(",", pitches05); //String.join("구분자", 리스트 객체)
        System.out.println(result05);  // 138,129,142 출력

//        리스트 정렬하기 : sort, Comparator
        ArrayList<String> pitches06 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches06);  // [129, 138, 142] 출력
//        오름차순(순방향) 정렬 - Comparator.naturalOrder()
//        내림차순(역방향) 정렬 - Comparator.reverseOrder()

        /* -----------------맵------------------*/
//        HashMap : 맵의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는 것
//        put
        HashMap<String, String> map = new HashMap<>(); //HashMap의 제네릭스는 key, value 모두 String 자료형
        map.put("people", "사람");
        map.put("baseball", "야구");

//        get
        System.out.println(map.get("people")); // "사람" 출력

//        getOrDefault : key에 해당하는 value가 없을 때 get 메서드를 사용하면 null이 리턴된다. null 대신 기본값(default)을 얻고 싶다면 getOrDefault 메서드를 사용
        System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력

//        containsKey : 메서드는 맵에 해당 key가 있는지를 참(true) 또는 거짓(false)으로 리턴
        System.out.println(map.containsKey("people"));  // true 출력

//        remove
        System.out.println(map.remove("people"));  // "사람" 출력

//        size
        System.out.println(map.size()); // 1

//        keySet : 맵의 모든 key를 모아서 리턴
        System.out.println(map.keySet());  // [baseball] 출력



        /* -----------------집합------------------*/
//        집합과 관련된 것을 쉽게 처리하기 위해 만든 것으로 HashSet, TreeSet, LinkedHashSet 등이 있다

//        HashSet : 중복불가, 순서없음
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
//        교집합
        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력

//        합집합
        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

//        차집합
        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력

//        집합 자료형과 관련된 메서드 - add, addAll, remove
//        add
        HashSet<String> set02 = new HashSet<>();
        set02.add("Jump");
        set02.add("To");
        set02.add("Java");
        System.out.println(set02);  // [Java, To, Jump] 출력

//        addAll
        set02.addAll(Arrays.asList("ToTo", "JavaJava"));
        System.out.println(set02);  // [Java, ToTo, To, Jump, JavaJava] 출력

//        remove
        set02.remove("To");
        System.out.println(set02);  // [Java, ToTo, Jump, JavaJava] 출력

        /*
        TreeSet과 LinkedHashSet
        집합 자료형의 특징은 순서가 없다는 것이다. 그런데 집합에 입력한 순서대로 데이터를 가져오거나 오름차순으로 정렬된 데이터를 가져오고 싶을 수 있다. 이럴 때는 TreeSet과 LinkedHashSet을 사용하자.

        TreeSet : 값을 오름차순으로 정렬해 저장한다.
        LinkedHashSet : 값을 입력한 순서대로 정렬한다.
        */

        /* -----------------상수 집합------------------*/
//        enum 자료형은 서로 연관 있는 여러 개의 상수 집합을 정의할 때 사용
        enum CoffeeType { //main메서드 밖의 class바로 밑에 선언해서도 사용가능
            AMERICANO,
            ICE_AMERICANO,
            CAFE_LATTE
        };

        for(CoffeeType type: CoffeeType.values()) {
            System.out.println(type);  // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
        }


        /* -----------------형 변환------------------*/

        String num01 = "123";

        int n = Integer.parseInt(num01); //int로 변경
        System.out.println(n);  // 123 출력

        String num02 = "" + n; // 정수로 변경
        String num02_1 = String.valueOf(n); //정수로 변경 2
        String num02_2 = Integer.toString(n); //정수로 변경 3
        System.out.println(num02);  // 123 출력

        String num03 = "123.456";
        double d3 = Double.parseDouble(num03); // double(소수점있는 숫자)로 변경
        System.out.println(d3);

//        실수 사이의 형변환 : 자주사용안함
        int n2 = 123;
        double d4 = n2;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
        System.out.println(d4);  // 123.0 출력

        double d5 = 123.456;
        int n4 = (int) d5; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
        System.out.println(n4);  // 소숫점이 생략된 123 출력

        /* -----------------final------------------*/
//        단 한 번만 설정할 수 있게 강제하는 키워드
        final int n5 = 123;  // final로 설정하면 값을 바꿀 수 없다.
//        n5 = 456;  // 컴파일 오류 발생

//        리스트의 경우 final로 선언할 때 리스트에 값을 더하거나(add) 뺄(remove) 수 있다.
        final List<String> z01 = List.of("a", "b"); //List.of로 작성하면 더하거나 뺼수도 없다.
//        z.add("c");  // UnsupportedOperationException 발생
    }
}