import javax.swing.*;

/**
 * Created by InKyung on 2017-01-10.
 */
public class Array16 {
    public static void main (String[] args)
    {
        int answer=(int) (Math.random()*100)+ 1 ;
        int input=0 ;
        int count=0 ;
        String temp="" ;

        do {
            count++ ;
            temp= JOptionPane.showInputDialog("1-100사이의 숫자를 입력하세요 ."+"끝내려면 -1을") ;

            if(temp==null||temp.equals("-1"))break ;
            System.out.println("입력값 : "+temp);
            input=Integer.parseInt(temp) ;
            if(answer>input){
                System.out.println("더 큰수를 입력");
            }else if (answer<input){System.out.println("더 작은수 입력 ");}
            else{
                System.out.println("맞춤");
                System.out.println("시도횟수는 "+count+"입니다");
                break;
                }
        }
        while(true);
    }
}
