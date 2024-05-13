package ObjectOrientation;

public class Sample {
    public static void main(String[] args) {
        //HouseDog houseDog = new HouseDog();
        //houseDog.setName("happy");
        //houseDog.sleep();
        //houseDog.sleep(3);
        HouseDog happy = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name);  // happy 출력
        System.out.println(yorkshire.name);  // yorkshire 출력

        Predator Lion = new Lion(); //인터페이스
        ZooKeeper.feed(Lion); //feed banana
        ZooKeeper.printfeed(Lion); //my food is banana

        //다형성 예제
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
