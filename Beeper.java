import javax.swing.*;
import java.awt.*;
public class Beeper extends MapPart{
    public Beeper(int x, int y){
        //the range can only be on the lines and should increase by the distance between lines
        super(x, y);
    }
    
    public void draw(Graphics myBuffer)
    {
        //TODO: actually make a circle with the center at myX, myY
    }
    public void delete(Graphics myBuffer)
    {
        //TODO: paint over the beeper by setting the color to the background color
    }
}
