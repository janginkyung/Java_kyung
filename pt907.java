import java.util.Objects;

/**
 * Created by InKyung on 2017-01-12.
 *///clone의 사용
public class pt907 {
    public static void main (String[] args){
        Point1 original=new Point1(3,5) ;
        Point1 copy=(Point1)original.clone() ;
        System.out.println(original);
        System.out.println(copy);
    }
}

class Point1 implements Cloneable{//Cloneable의 인터페이스를 구현한 클래스에서만 clone을 사용
    int x, y;
    Point1(int a, int b){
        this.x=a;
        this.y=b ;
    }
    public String toString(){
        return "x="+x+", y"+ y ;
    }


    public Object clone(){//clone메서드는 object클래스에서 정의되어 있고 오버라이딩
        Object obj=null ;
        try{
            obj=super.clone() ;//clone메서드에서는 예외가 선언 되어 있으므로 try catch 구문으로 사용해야 한다.
        }catch(CloneNotSupportedException e){

        }
        return obj;
    }
}
