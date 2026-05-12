import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
public class Mapper implements Interpreter{
    private String myText;
    public Mapper(String b)
    {
        myText = b;
    }
    
    public void run()
    {
        // new filereader and then interpret with the: type x y x2 y2
    }
    
    public void write(String input, String file)
    {
        try{
           Path outputfile = Path.of(file);
           Files.writeString(outputfile, input);
        }
        catch(IOException e)
        {
            System.out.println("invalid output file")
            e.printStackTrace(System.out);
            System.exit(1);
        }
    }
    
}
