/**
 * Created by InKyung on 2017-01-11.
 */
import java.io.* ;
class pt822 {
    public static void main (String[] args){
        try{
            File f=createFile(args[0]) ;
            System.out.println(f.getName()+"파일이 성공적");
        }
        catch(Exception e){
            System.out.println(e.getMessage()+"다시 입력해주세요 ");

        }

    }
    static File createFile(String name) throws Exception{
        if(name==null|| name.equals(""))
            throw new Exception("파일이름이 유효ㄴ");
        File f=new File(name) ;
        f.createNewFile() ;
        return  f;
    }
}


