/**
 * Created by InKyung on 2017-01-11.
 */
public class pt812 {public static void main (String[] args){
    System.out.println(1);
    System.out.println(2);

    try{
        System.out.println(3);
        System.out.println(0/0);
        System.out.println(4);
    }
    catch(ArithmeticException ae){
        ae.printStackTrace();//예외발생 당시의 호출 스택에 있었던 메서드 정보, 예외메세지를 출력
        System.out.println("예외 메세지 : "+ae.getMessage());//예외 클래스의 인스턴스에 저장된 메세지 출력
    }
    catch(Exception e){

    }// 위의 catch문에서는 산술오류, 여기의 catch문에서는 그외의 예외를 다룸
    System.out.println(6);
}
}
