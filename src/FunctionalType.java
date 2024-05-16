import java.util.*;

@FunctionalInterface // 람다식에서 사용할 인터페이스틑 메서드가 1개를 넘으면 사용할수 없으므로 함수가 1개만 있도록 강제하는 어노테이션을 사용하는 것이 좋다
interface Calculator {
    int sum(int a, int b);
}

// --- 기존방식
class MyCalculator implements Calculator {
    public int sum(int a, int b) {
        return a+b;
    }
}
// --- 기존방식

public class FunctionalType {
    public static void main(String[] args) {

        // --- 기존방식
        MyCalculator mc = new MyCalculator();
        int result = mc.sum(3, 4);
        System.out.println(result);  // 7 출력
        // --- 기존방식

        // --- 람다방식
        Calculator mc02 = (int a, int b) -> a +b;  // 람다를 적용한 코드
        int result02 = mc02.sum(3, 4);
        System.out.println(result02); // 7 출력
        // --- 람다방식

        // --- 스트림 안쓴 기본방식
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};

        // 짝수만 포함하는 ArrayList 생성
        ArrayList<Integer> dataList = new ArrayList<>();
        for(int i=0; i<data.length; i++) {
            if(data[i] % 2 == 0) {
                dataList.add(data[i]);
            }
        }

        // Set을 사용하여 중복을 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        // Set을 다시 List로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        // 역순으로 정렬
        distinctList.sort(Comparator.reverseOrder());

        // Integer 리스트를 정수 배열로 변환
        int[] result03 = new int[distinctList.size()];
        for(int i=0; i< distinctList.size(); i++) {
            result03[i] = distinctList.get(i);
        }
        // --- 스트림 안쓴 기본방식

        // --- 스트림
        int[] result04 = Arrays.stream(data)  // IntStream을 생성한다.
                .boxed()  // IntStream을 Stream<Integer>로 변경한다.
                .filter((a) -> a % 2 == 0)  //  짝수만 뽑아낸다.
                .distinct()  // 중복을 제거한다.
                .sorted(Comparator.reverseOrder())  // 역순으로 정렬한다.
                .mapToInt(Integer::intValue)  // Stream<Integer>를 IntStream으로 변경한다.
                .toArray()  // int[] 배열로 반환한다.
                ;
        // --- 스트림

    }

}
