/**
 * Created by InKyung on 2017-01-13.
 */
//hash set의 사용
    import java.util.* ;
    public class pt1118 {
        public static void main(String[] args){
            Object[] obj={"1","2","2","3","3","3",new Integer(1)} ;
            //중복을 허락하지 않는다
            // 하지만, string과 integer의 인스턴스는 다르게 간주
            Set set=new HashSet() ;

            for(int i=0 ; i<obj.length;i++){
                set.add(obj[i]) ;

            }
            System.out.println(set);
        }
}
