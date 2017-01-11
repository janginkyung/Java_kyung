/**
 * Created by InKyung on 2017-01-11.
 */
//패키지와 import의 사용

    import java.text.SimpleDateFormat ;//import 패키지명. 클래스명
    import java.util.Date;// import .패키지명.* 패키지안에있는 모든 클래스를 포함한다.
public class pt710 {
    public static void main (String[] args){
        Date today=new Date() ;

        SimpleDateFormat date=new SimpleDateFormat("yyyy/MM/dd") ;
        SimpleDateFormat time=new SimpleDateFormat("hh:mm:ss a") ;

        System.out.println("오늘의 날씨는 "+date.format(today));
        System.out.println("현재시간은 "+time.format(today));

    }
}

