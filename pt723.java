/**
 * Created by InKyung on 2017-01-11.
 */
public class pt723 {
    public static void main (String[] args){
        Fighter f=new Fighter() ;

        if(f instanceof  Unit)//f를 unit의 형으로 변환이 가능한지의 여부를 알려준다.
        {
            System.out.println("f는 unit의 자손입니다. ") ;
        }

        if(f instanceof  fable)
        {
            System.out.println("f는 fable의 인터페이스를 구현했습니다. ");
        }
        if(f instanceof  mable)
        {
            System.out.println("f는 mable의 인터페이스를 구현했습니다. ");
        }
        if(f instanceof  aable)
        {
            System.out.println("f는 aable의 인터페이스를 구현했습니다. ");
        }


    }
}

class Fighter extends Unit implements fable {
    public void move (int x, int y){}
    public void attack (Unit u){

    }
}

class Unit {
    int current ;
    int x, y ;
}

interface fable extends mable, aable {}
interface mable{}
interface  aable{
}
