import java.util.Scanner;

/**
 * Created by InKyung on 2017-01-12.
 */
//Scanner 클래스의 사용
public class pt1158 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in) ;//스캐너의 생성자중에서 입력을 매개변수로 가지는 생성자
        String input="" ;

        do{
            System.out.println("원하는 값을 입력하세요 입력을 마치려면 Q를 입력하세요 ->");
            input=scan.nextLine() ;//입력한 값을 읽어오는 함수.
            System.out.println("입력하신 값은 "+input+"입니다. ");
        }while(!input.equalsIgnoreCase("Q")) ;
        System.out.println("프로그램을 종료합니다.");
    }
}
