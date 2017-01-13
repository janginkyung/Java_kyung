/**
 * Created by InKyung on 2017-01-13.
 */
//tree set 의 사용
    import  java.util.* ;
public class pt1128 {
    public static void main(String[] args){
        TreeSet set=new TreeSet() ;//tree set 의 선언
        int[] score={80,95,50,35,45,65,10,100} ;

        for(int i=0 ; i<score.length;i++){
            set.add(new Integer(score[i])) ;//추가시 객체로 해야한다.
        }
        System.out.println("50보다 작은 값: "+set.headSet((new Integer(50))));
        System.out.println("50보다 큰 값: "+set.tailSet(new Integer(50)));
    }
}
