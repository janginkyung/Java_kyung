import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by InKyung on 2017-01-12.
 */
//유용한 클래스의 사용
public class pt1155 {
    public static void main (String[] args){
        String[] data={"bat","baby","cat","cake","coke","apple"} ;

        /*
       c[a-z]*: c로 시작하는 영단어
        c[a-z]:c로 시작하는 두자리 영단어
        .*:모든 문자열
        c.:c로 시작하는 두자리
        c,*:c로 시작하는 모든 문자열
        c.*t:c로 시작해서 t로 끝나는 문자열
         */
        Pattern p=Pattern.compile("c[a-z]*") ;//patten클래스의 인스턴스를 얻는 과정
        for(int i=0 ; i<data.length ; i++){
            Matcher m=p.matcher(data[i]) ;//비교하기 위해 matcher클래스의 인스턴스를 얻음
            if(m.matches())//정규식과 matcher인스턴스와 맞는지 확인
                System.out.println(data[i]+",");
        }
    }
}
