/**
 * Created by InKyung on 2017-01-13.
 */
// hash set의 사용
    import java.util.* ;
public class pt1121 {
    public static void main(String[] args){
        Set set=new HashSet( ) ;
        int[][] board =new int[5][5] ;
        for(int i=0 ;set.size()<25 ; i++){//중복을 허락하지 않으니까 set.size가 범위가 된다.
            set.add((int)(Math.random()*50)+1+"" ) ;
        }
        Iterator it=set.iterator() ;

        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board[i].length ; j++){
                board[i][j]=Integer.parseInt((String)it.next()) ;
                System.out.print((board[i][j]<10? " ":" ")+board[i][j]);
            }
            System.out.println();
        }
    }
}
