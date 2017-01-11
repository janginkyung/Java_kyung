/**
 * Created by InKyung on 2017-01-11.
 */
public class pt719 {
    public static void main (String[] args){
        Parent p=new Child() ;
        Child c=new Child() ;

        System.out.println("p.x="+p.x);//x=100인데 인스턴스 변수는 참조변수의 타입에따라 달라진다.
        p.method();//child의 인스턴스이기에 child의 메소드가 구현
        System.out.println();
        System.out.println("c.x="+c.x);
        c.method();

    }
}

class Parent{
    int x=100 ;
    void method(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    int x=200 ;
    void method(){
        System.out.println("x="+x);
        System.out.println("super x="+super.x);
        System.out.println("this x="+this.x);
    }
}
