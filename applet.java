
import java.awt.Frame;
import java.awt.Graphics;

public class applet extends Frame {
    public void paint(Graphics g) {
        g.drawString("Hello World!", 100, 100);
    }

    public static void main(String[] args) {
        applet f = new applet();
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
