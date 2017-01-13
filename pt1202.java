/**
 * Created by InKyung on 2017-01-13.
 */
//thread 의 사용
public class pt1202 {
    public static void main (String[] args){
        test t=new test() ;
        t.start();
    }
}
 class test extends Thread{//thread classs로부터 직접 만드는 경우
    public void run (){//run의 오버라이딩
        for(int i=1 ; i<=10 ; i++){
            System.out.println("재미있는 자바: "+ i);
        }

    }
}