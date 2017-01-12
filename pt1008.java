/**
 * Created by InKyung on 2017-01-12.
 */
//익명클래스
    import java.awt.*;
    import java.awt.event.* ;
public class pt1008 {
    public static void main(String[] args){
        Button b=new Button("start" ) ;
        //익명클래스의 형태: Object cv=new Object (){void method(){}};
        b.addActionListener(new ActionListener() {//익명클래스의 사용
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ationevent occured!!");
            }
        });


    }
}
