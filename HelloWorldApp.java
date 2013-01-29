import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class HelloWorldApp extends Applet {

    public static final long serialVersionUID = 12334812939234L;

    public String test() {
        return "Hello World!"; // Display the string.
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Rectangle r = g.getClipBounds();
        g.setColor(Color.cyan);
        g.fillRect(r.x, r.y, r.width, r.height);
    }

}
