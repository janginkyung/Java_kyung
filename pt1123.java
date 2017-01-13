/**
 * Created by InKyung on 2017-01-13.
 */
//hash class의 equal의 오버라이딩
    import java.util.* ;

public class pt1123 {
    public static void main(String[] args){
        HashSet set=new HashSet( ) ;

        set.add(new String("abc")) ;
        set.add(new String("abc")) ;
        set.add(new person2("David",10)) ;
        set.add(new person2("David",10)) ;
        System.out.println(set);
    }
}
class person2{
    String name ;
    int age ;

    person2(String a, int b){
        this.name=a;
        this.age=b ;

    }
    public boolean equals(Object obj){//오버라이딩을 통해서 이름과 나이가 같으면 같음을 인식
        if(obj instanceof person2){
            person2 temp=(person2)obj ;
            return name.equals(temp.name)&&age==temp.age ;}
            return false ;
    }
    public String toString(){
        return name+":"+age ;
    }


    public int hashCode(){
        return (name+age).hashCode() ;

    }


}

