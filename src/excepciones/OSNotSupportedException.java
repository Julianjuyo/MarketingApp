package excepciones;

public class OSNotSupportedException extends Exception 
{
    public OSNotSupportedException() 
    {
    	
    }
    
    public String toString() 
    {
        return "Operating System Not Supported Exception"; 
    }
}
