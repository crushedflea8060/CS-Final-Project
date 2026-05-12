import javax.swing.*;
import java.awt.*;
public class Robot extends MapPart{
    private String myDir = "north";
    private final int gridDistance = 70; //PLACEHOLDER, CHANGE IN PRODUCTION
    //0,0 is top left
    private final String[] valid = {"north", "south", "east", "west"};
    public Robot(int x, int y)
    {
        super(x, y);
    }
    public void changeDirection(String e)
    {
        String b = e.toLowerCase();
        for(int i = 0; i<valid.length; i++)
        {
            if(b.equals(valid[i]))
            {
                myDir = valid[i];
                return;
            }
        }
        
    }
    public String getDirection()
    {
        return myDir;
    }
    
    public void move()
    {
        if(myDir.equals("north"))
        {
            myY -= gridDistance;
        }
        else if(myDir.equals("east"))
        {
            myX += gridDistance;
        }
        else if(myDir.equals("west"))
        {
            myX -= gridDistance;
        }
        else if(myDir.equals("south"))
        {
            myY += gridDistance;
        }
        
        
    }
    

    public void draw() 
    {
        //call a method that returns a graphics object
    }
    
    public void delete()
    {
        //same as above
    }
    
    
    
}
