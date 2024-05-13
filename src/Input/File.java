package Input;

import java.io.*;

public class File {
    //    -------------파일입출력-----------------

    //파일쓰기 : 관리자권한으로 켜고 실행해야 진행됨
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/out01.txt"); //byte 단위로 데이터를 처리
        //FileOutputStream : 파일 생성
        //파일 내용 입력
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            output.write(data.getBytes()); // write : 입력
        }
        output.close(); // 사용한 파일 객체를 닫아 주기 위한 코드, 생략해도 돌아가긴 하지만 추후 오류나올수 있으니 해주는 것이 좋다.

        //------------ byte 배열 대신 문자열을 사용 ------------
        FileWriter fw = new FileWriter("c:/out02.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();
        //------------

        //파일 수정
        FileWriter fw2 = new FileWriter("c:/out02.txt", true);  // 파일을 추가 모드로 연다.
//        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true)); //혹은 이렇게
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();

        //파일 읽기
        BufferedReader br = new BufferedReader(new FileReader("c:/out02.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
        }
//        BufferedReader의 readLine 메서드는 더 이상 읽을 라인이 없을 경우 null을 리턴한다.
        br.close();
    }
}
