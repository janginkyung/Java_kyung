/**
 * Created by InKyung on 2017-01-10.
 */
public class pt624 {
    public static void main (String[] args) {
        product p1 =new product() ;
        product p2 =new product() ;
        product p3 =new product() ;

        System.out.println("p1의 제품번호는 "+p1.serialno);
        System.out.println("p1의 제품번호는 "+p2.serialno);
        System.out.println("p1의 제품번호는 "+p3.serialno);
        System.out.println("셍산된 제품의 수는 모두 "+product.count+"개 입니다 .");
    }

}

class product{
    static int count=0 ;
    int serialno ;
    {
        ++count ;
        serialno=count;
    }
    public product(){}
}
