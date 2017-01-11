/**
 * Created by InKyung on 2017-01-11.
 */
//형변환
public class pt715 {
    public static void main (String[] args){
        //Car1 car =new Car1() ; 이 경우 다운캐스팅이 되지 않는다.
        Car1 car=null ;
        FireEngine fe=new FireEngine() ;
        FireEngine fe2=null ;

        fe.water();
        car=fe ;//다운캐스팅

        //car.water() ; 조상클래스이기 떄문에 water의 함수가 실행될 수 없다.
        fe2=(FireEngine)car ;//car을 Car의 객체로 형성시킬 경우 에러가 발생
        fe2.water();
    }
}
class Car1{
    String color ;
    int door ;

    void drive(){
        System.out.println("drive barr~");
    }

}
class FireEngine extends Car1{
    void water (){
        System.out.println("water !");
    }

}
