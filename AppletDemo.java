import java.applet.Applet;
import java.awt.Graphics;

public class AppletDemo extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World", 100, 100);
    }
}

/*
 <html>
 <applet code="AppletDemo.class" CodeBase="" ,width=100 height=100>
 </applet>
 </html>
 */
