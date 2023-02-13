package draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author 叶磊
 */
public class PaintTank extends JFrame{

    private MyPanel2 myPanel2 = null;

    public static void main(String[] args) {
        new PaintTank();
    }

    public PaintTank(){
        myPanel2 = new MyPanel2();
        this.add(myPanel2);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}

class MyPanel2 extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.CYAN);
        g.fill3DRect(10,10,10,70,true);
        g.drawRect(20,25,30,40);
        g.fillOval(20,30,30,30);
        g.fill3DRect(34,5,2,30,true);
        g.fill3DRect(50,10,10,70,true);

    }
}