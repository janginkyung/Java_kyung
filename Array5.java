/**
 * Created by InKyung on 2017-01-10.
 */
 class Array5 {
    public static void main (String[] args) {
        int[] num=new int[10] ;

        for(int i=0 ; i<num.length;i++){
            System.out.print(num[i]=(int)(Math.random()*10));
        }
        System.out.println();

        for(int i=0 ; i<num.length ; i++){
            boolean change=false;

            for(int j=0 ; j<num.length-1 ;j++)
            {
                if(num[j]>num[j+1]){
                    int temp=num[j] ;
                    num[j]=num[j+1] ;
                    num[j+1]=temp ;
                    change=true ;

                }
            }
            if (!change) break ;

            for(int k=0 ; k<num.length ; k++)
                System.out.print(num[k]);
            System.out.println();

        }
    }
}
