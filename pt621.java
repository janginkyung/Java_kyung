/**
 * Created by InKyung on 2017-01-10.
 */
public class pt621 {
    public static void main (String[] args){

        Car c1=new Car() ;
        Car c2=new Car(c1) ;

        System.out.println("c1의 color="+c1.color+", geartype="+c1.type+", door="+c1.door);
        System.out.println("c2의 color="+c2.color+", geartype="+c2.type+", door="+c2.door);

        c1.door=100 ;
        System.out.println("c1.door=100 실행후 ") ;
        System.out.println("c1의 color="+c1.color+", geartype="+c1.type+", door="+c1.door);
        System.out.println("c2의 color="+c2.color+", geartype="+c2.type+", door="+c2.door);
    }
}

class Car{
    String color ;
    String type ;
    int door ;

    Car (){this("white","auto",4);}
    Car(Car c){
        color=c.color;
        type=c.type;
        door=c.door ;}
    Car (String color,String type, int door){
        this.color=color;
        this.type=type;
        this.door=door ;
    }
}
