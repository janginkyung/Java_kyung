/**
 * Created by InKyung on 2017-01-12.
 */
//string 클래스의 사용
public class pt916 {
    public static void main (String[] args){
     String[] number={"1","2","3","4","5"} ;
     String result1="" ;
     int result2=0 ;

        for(int i=0 ; i<number.length;i++){
            result1+=number[i] ;
            result2+=Integer.parseInt(number[i]) ;//문자열->정수형
        }
        System.out.println("result : "+result1);
        System.out.println("result2 : "+result2);
    }
}
