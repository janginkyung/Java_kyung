/**
 * Created by InKyung on 2017-01-13.
 */
class Account{
    private  int total =0 ;
    synchronized  void deposit(){
        total=total+1000 ;
    }
    int gettotal(){return total;}
}
class Customer extends Thread{
    Account sa ;
    Customer(Account a, String s){
     sa=a ;
     setName(s);
    }
    public  void run(){
        for(int i=0 ; i<200 ; i++){
            System.out.println(getName()+":"+i+"번째");
            sa.deposit();
            if(sa.gettotal()>=5000000)break ;
        }
    }
}
public class pt1206 {
    public static void main(String[] args)throws Exception{
        Account s_a=new Account() ;
        Customer d1=new Customer(s_a,"1번째 성금자 ") ;
        Customer d2=new Customer(s_a,"2번째 성금자 ") ;
        Customer d3=new Customer(s_a,"3번째 성금자 ") ;
        Customer d4=new Customer(s_a,"4번째 성금자 ") ;
        Customer d5=new Customer(s_a,"5번째 성금자 ") ;

        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();


        d1.join();
        d2.join();
        d3.join();
        d4.join();
        d5.join();






    }
}
