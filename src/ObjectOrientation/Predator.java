package ObjectOrientation;

interface Predator {
    String getFood(); // getFood 메서드는 인터페이스를 implements한 클래스들이 강제적으로 구현해야 하는 규칙이 된다.
    default void printFood() { //디폴트메서드
        System.out.printf("my food is %s\n", getFood());
    }
}

//추상 클래스 예제
abstract class Predator02 extends Animal {
    abstract String getFood();

}
