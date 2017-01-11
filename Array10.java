/**
 * Created by InKyung on 2017-01-10.
 */
class Array10 {
    public static void main (String[] args) {
      int[][] score ={{100,100,100},{20,20,20},{30,30,30},{40,40,40},{50,50,50}} ;

      int ktotal=0 ;
      int etotal=0 ;
      int mtotal=0 ;

      System.out.println("번호 국어 영어 수학 총점 평균 ");
      System.out.println("============================== ");

      for(int i=0 ; i<score.length ; i++){
          int sum=0 ;
          ktotal+=score[i][0] ;
          etotal+=score[i][1] ;
          mtotal+=score[i][2] ;

          System.out.print(" "+(i+1)+" ") ;

          for(int j=0 ; j<score[i].length;j++){
              sum+=score[i][j] ;
              System.out.print(score[i][j]+" ") ;
          }
          System.out.println(sum+" "+ sum/(float)score[i].length);
      }
      System.out.println("=====================================");
        System.out.println("총점; "+ktotal+" "+etotal+" "+mtotal);
    }
}