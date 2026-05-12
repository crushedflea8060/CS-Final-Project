import javax.swing.*;
import java.awt.*;
public abstract class MapPart{
    public int myX, myY;
    public static Graphics b;
    public MapPart(int x, int y){
        myX = x;
        myY = y;
        draw();
    }
    
    public void setGraphics(Graphics c)
    {
        b = c;
    }
    public abstract void draw(Graphics myBuffer);
    public abstract void delete(Graphics myBuffer);
}
