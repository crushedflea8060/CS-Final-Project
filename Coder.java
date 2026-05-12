public class Coder implements Interpreter{
    private String myText;
    public Coder(String b)
    {
        myText = b;
    }
    
    public void run()
    {
        Code.run();
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
