/**
 * Created by InKyung on 2017-01-12.
 */
// Pattern 클래스의 사용법
import java.util.regex.* ;
public class pt1157 {
    public static void main(String[] args ){
        String source="A broken hand works, but not a broken heart" ;
        String pattern="broken" ;
        StringBuffer sb=new StringBuffer() ;

        Pattern p=Pattern.compile(pattern) ;//Pattern class은 내가 찾고 싶은 pattern 변수가 들어가야 한다.
        Matcher m=p.matcher(source) ;//matcher class의 인스턴스를 source를 매개변수로 하여 생성한다.
        System.out.println("source:"+source);

        int i=0 ;
        while (m.find()){//반복문을 통해 2번의 broken을 찾는다.
            System.out.println(++i+"번째 매칭 : "+m.start()+"~"+m.end());
         m.appendReplacement(sb,"drunken") ;//broken->drunken임과 동시에
            // broken 앞까지 drunken으로 대채해서 저장해놓는다.
}
        m.appendTail(sb) ;//heart를 더해주는 역할
        System.out.println("replacement count : "+i);
        System.out.println("result :"+sb.toString());
    }
}
