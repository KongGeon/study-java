//예외처리

class FoolException extends Exception {
}

public class ExceptionHandling {
    public static void shouldBeRun() {
        System.out.println("ok thanks");
    }

    public void sayNick(String nick) throws FoolException {
        if("바보".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

//    try catch finally
    public static void main(String[] args) {
        int c;
        try {
            c = 4 / 0;
        } catch(ArithmeticException e) {
            c = -1;  // 예외가 발생하여 이 문장이 수행된다.

        }finally {
            ExceptionHandling.shouldBeRun();  // 예외에 상관없이 무조건 수행된다.
        }

//        예외 던지기
        ExceptionHandling sample = new ExceptionHandling();
        try {
            sample.sayNick("바보");
            sample.sayNick("야호");
        } catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }


}
