//접근제어자
public class AccessModifier {

    //    private : 오직 AccessModifier 클래스에서만 접근이 가능하고 다른 클래스에서는 접근이 불가능하다.
    private String secret;
    private String getSecret() {
        return this.secret;
    }

    //    default : 접근 제어자를 별도로 설정하지 않는다면 변수나 메서드는 default 접근 제어자가 자동으로 설정되어 동일한 패키지 안에서만 접근이 가능하다.
    String lastname = "kim";  // lastname은 default 접근제어자로 설정된다.

    //    protected : protected가 붙은 변수나 메서드는 동일 패키지의 클래스 또는 해당 클래스를 상속받은 클래스에서만 접근이 가능하다.
    protected String lastname02 = "park";

    //    public : public 접근 제어자가 붙은 변수나 메서드는 어떤 클래스에서도 접근이 가능하다.
    public String info = "this is public message.";


}