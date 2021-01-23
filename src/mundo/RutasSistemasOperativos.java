package mundo;

import excepciones.OSNotSupportedException;

public class RutasSistemasOperativos  
{
	public static String USER_APPDATA; 
	public static String MAIN_FOLDER_PATH;
    public static String FIRST_FILE_PATH;
    
    public RutasSistemasOperativos() throws OSNotSupportedException 
    {
        if(System.getProperty("os.name").toLowerCase().contains("win"))
        {
            USER_APPDATA = System.getenv("LOCALAPPDATA");
            MAIN_FOLDER_PATH = USER_APPDATA + "\\MarketingApp";
            FIRST_FILE_PATH = USER_APPDATA + "\\MarketingApp\\firstConfigFile.mrkap";
        }
        else if(System.getProperty("os.name").toLowerCase().contains("mac")) 
        {
            USER_APPDATA = System.getProperty("user.home");
            MAIN_FOLDER_PATH = USER_APPDATA + "/Library/Application Support/MarketingApp";
            FIRST_FILE_PATH = USER_APPDATA + "/Library/Application Support/MarketingApp/firstConfigFile.mrkap";
        }
        else 
        {
            throw new OSNotSupportedException(); 
        }
    }
}
