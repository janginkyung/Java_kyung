/**
 * Created by InKyung on 2017-01-12.
 */
//wrapper클래스의 사용
public class pt923 {
    public static void main(String[] args){
        int i=10 ;
        Integer intg=(Integer) i ;//wrapper클래스의 사용, 형변환
        Object obj=(Object)i ;

        Long lng=100L;
        int i2=intg+10 ;//기본형 변수와 참조형의 연산이 가능
        long l=lng+intg ;

        Integer intg2=new Integer(20) ;
        int i3=(int)intg2 ;//참조형을 기본형으로 변환

        System.out.println("i  :"+i);
        System.out.println("intg  :"+intg);
        System.out.println("obj  :"+obj);
        System.out.println("lng  :"+lng);
        System.out.println("intg+10  :"+i2);
        System.out.println("intg+lng  :"+l);
        System.out.println("i3  :"+i3);
    }
}
