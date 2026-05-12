import javax.swing.*;
import java.awt.*;
public class Wall{
    public int myX, myY, myX2, myX3;
    public static Graphics b;
    public MapPart(int x, int y, int x2, int y2){
        myX = x;
        myY = y;
        myX2 = x2;
        myY2 = y2;
        draw();
    }
    
    public void setGraphics(Graphics c)
    {
        b = c;
    }
    public void draw(Graphics myBuffer)
    {
        //draw a line from x2 y2 to x1 y1
    }
    public void delete(Graphics myBuffer)
    {
        // be rid of it
    }
}
