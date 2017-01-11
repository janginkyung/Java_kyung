/**
 * Created by InKyung on 2017-01-11.
 */
//super의 개념과 조상클래스의 생성자 자동 생략
public class pt708 {
    public static void main (String[] args){
        Point3d p3=new Point3d() ;
        System.out.println("p3.x="+p3.x);
        System.out.println("p3.y="+p3.y);
        System.out.println("p3.z="+p3.z);
    }
}

class Point
{
    int x=10 ;
    int y=20 ;

    Point(int x, int y){
        //super () ;가 생략되어 있다. Point의 조상인 object class의 생성자를 의미한다.
        this.x=x ;
        this.y=y ;
    }
}
class Point3d extends Point
{
    int z=3 ;
    Point3d (){
        this (100,200,300) ;}
    Point3d(int a, int b, int c){super(a,b) ;//만약 여기 super (a,b)가 없었으면 Point의 기본 생성자가 있어야한다.
    this.z=c ;}
}
