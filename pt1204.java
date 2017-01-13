/**
 * Created by InKyung on 2017-01-13.
 */
//join함수의 사용
    class DoubleThread extends Thread{
        public DoubleThread(String str){
            setName(str);
        }
        public void run(){
            for(int i=0 ;i <=3 ; i++){
                System.out.println(i+getName());//스레드의 이름을 반환
            }
            System.out.println("끝"+getName());
        }

}
public class pt1204  {
        public static void main(String[] args)throws Exception{//join을 사용하기 위해 작성해야 하는 부분
            DoubleThread t1=new DoubleThread("배우기 쉬운 자바") ;
            DoubleThread t2=new DoubleThread("배우기 어려운 자바 ") ;

            System.out.println("*****스레드 시작전 *********");
            t1.start();
            t2.start();
            t1.join();//t1,t2의 스레드가 종료 후에 스레드 종료 후가 뜨게 된다.
            t2.join();
            System.out.println("*****스레드 종료 후 *********");
        }
}
