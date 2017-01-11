/**
 * Created by InKyung on 2017-01-11.
 */
// 다형성 및 인터페이스의 이해 A->I->B/C 인터페이스에 의한 간접적 관계
public class pt727 {
    public static void main (String[] args){
      A a=new A() ;
      a.autoplay(new B() );// B의 인스턴스가 인터페이스의 참조 변수로 다형성이 가능하다.
        a.autoplay(new C() );//C의 인스턴스가 인터페이스의 참조변수로 다형성이 가능하다.
    }
}

class A{
    void autoplay(I i ){
        i.play() ;
    }
}

interface  I {
    void play() ;
}

class B implements I {
    public void play(){
        System.out.println("play in b class ");
    }
}

class C implements I {
    public void play(){
        System.out.println("play in c class ");
    }
}