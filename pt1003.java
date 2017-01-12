/**
 * Created by InKyung on 2017-01-12.
 */
// 내부클래스의 접근성
public class pt1003 {
    public static void main(String[] args) {
        Outer oc = new Outer();
        Outer.instanceinner ii = oc.new instanceinner();//outer의 클래스를 먼저 선언을 해준뒤에 인스턴스 이너클래스를 접근해야한다.
        System.out.println("ii.iv= "+ii.iv);
        System.out.println("Outer.static class cv= "+Outer.staticinner.cv );
        //스태틱 내부 클래스의 인스턴스는 외부클래스를 생성하지 않아도 된다.
        Outer.staticinner si=new Outer.staticinner() ;
        System.out.println("si .iv : "+si.iv);
    }

}
class Outer {
    class instanceinner {
        int iv = 100;
    }

    static class staticinner {
        int iv = 200;
        static int cv = 300;
    }
    void method(){
        class Localinner{
            int iv=400 ;
            //지역 클래스의 경우에는 외부클래스의 final이 붙은 변수에만 접근이 가능하다.
        }
    }

}

