package ObjectOrientation;

class Dog extends Animal {
    Dog() { //디폴트생성자 :  디폴트 생성자를 구현하면 new Dog()로 Dog 클래스의 객체가 만들어질때 디폴트 생성자 Dog()가 실행
    }
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}