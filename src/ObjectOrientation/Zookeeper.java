package ObjectOrientation;
class Tiger extends Animal implements Predator {
    public String getFood() { //인터페이스의 메서드는 항상 public으로 구현해야 한다.
        return "apple";
    }
}

class Lion extends Animal implements Predator {
    public String getFood() {
        return "banana";
    }
}
class ZooKeeper {
    static void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }
    static void printfeed(Predator predator) { //디폴트 메서드 이용
        predator.printFood();
    }
}