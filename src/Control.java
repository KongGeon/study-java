import java.util.ArrayList;
import java.util.Arrays;

public class Control {
    public static void main(String[] args) {
        /* -----------------if------------------*/
        int money = 2000;
        if (money >= 3000) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }
        /* -----------------switch/case------------------*/
        int month = 8;
        String monthString = "";
        switch (month) {  // 입력 변수의 자료형은 byte, short, char, int, enum, String만 가능하다.
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);

        /* -----------------while------------------*/
        int treeHit = 0;
        //중간에 종료할 떄에는 break
        //다음 루프로 넘어갈 때에는 continue
        while (treeHit < 10) {
            treeHit++;  // treeHit += 1 로도 표현 가능
            System.out.println("나무를  " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
            }
        }

        /* -----------------for------------------*/
        int[] marks = {90, 25, 67, 45, 80};
        for(int i=0; i<marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i+1)+"번 학생은 합격입니다.");
            }else {
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        }
        /* -----------------for each------------------*/
//        for each 문은 따로 반복 횟수를 명시적으로 주는 것이 불가능하고, 한 단계씩 순차적으로 반복할 때만 사용이 가능하다는 제약이 있다
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number : numbers) {
            System.out.println(number);
        }

    }
}
