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
    }
}
