package ObjectOrientation;

class HouseDog extends Dog {

    HouseDog(String name) { //생성자 : 1)클래스명과 메서드명이 같음 2)리턴타입 정의하지 않고 void도 사용안함 => 인스턴스 강제함
        this.setName(name);
    }
    HouseDog(int type) { //생성자 오버로딩
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }
    void sleep() {
        System.out.println(this.name + " zzz in house"); //오버라이딩
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");//오버로딩
    }
}