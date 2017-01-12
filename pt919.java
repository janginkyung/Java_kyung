/**
 * Created by InKyung on 2017-01-12.
 */
//stringbuffer 클래스의 사용
public class pt919 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        if (sb1 == sb2) {//참조변수의 값이 같은지의 여부
            System.out.println("sb1 == sb2 ?  true ");
        } else {
            System.out.println("sb1 == sb2 ?  false");
        }

        if (sb1.equals(sb2)) {//equal이 오버라이딩 되어있지 않다.
            System.out.println("sb1 equals(sb2) ?  true ");
        } else {
            System.out.println("sb1 equals(sb2) ?  false");
        }

        String s1 = sb1.toString();//toString의 경우 오버라이딩이 되어있다.
        String s2 = sb2.toString();
        if (s1.equals(s2)) {//문자열을 비교하는 경우 같다
            System.out.println("s1 equals(s2) ?  true ");
        } else {
            System.out.println("s1 equals(s2) ?  false");
        }
    }
}