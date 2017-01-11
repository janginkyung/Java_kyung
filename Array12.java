/**
 * Created by InKyung on 2017-01-10.
 */
class Array12 {
    public static void main (String[] args) {
    char [] abc={'a','b','c','d' } ;
    char[] num={'0','1','2','3','4','5','6','7','8','9'} ;

    System.out.println(new String (abc));
    System.out.println(new String(num));

    char[] result=new char[abc.length+num.length] ;
        System.arraycopy(abc,0,result,0,abc.length);
        System.arraycopy(num,0,result,abc.length,num.length);
        System.out.println(new String(result));
    }
}
