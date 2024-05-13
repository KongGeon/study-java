package ObjectOrientation;

//다형성 예제
class Bouncer {
    void barkAnimal(Animal animal) {
        if (animal instanceof Tiger) {
            System.out.println("Tiger: 어흥");
        } else if (animal instanceof Lion) {
            System.out.println("Lion: 으르렁");
        }
    }

    //위처럼 하면 새로 동물을 추가할떄마다 if문을 써줘야한다.
    //그럴때 인터페이스를 이용해서 제작하는게 낫다
    //void barkAnimal(Barkable animal) {
    //    animal.bark();
    //}
}

//interface Barkable {
//    void bark();
//}

//class Tiger extends Animal implements Predator, Barkable { //하나의 객체가 여러 개의 자료형 타입을 가질 수 있는 것을 객체 지향 세계에서는 다형성이라고 한다.
//    public String getFood() {
//        return "apple";
//    }
//
//    public void bark() {
//        System.out.println("어흥");
//    }
//}
