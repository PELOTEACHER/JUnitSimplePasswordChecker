package checker;

/**
 *
 * @author pelo
 */
public class PasswordControl
{

    /**
     * The method gets a password in and returns ”To short” if under 8
     * characters, ”Missing capital letter” if its missing atleast 1 capital
     * letterand ”No digits” if there are no digits. It returns ”OK” if
     * everything is fine.
 *
     */
    public static String checkPassword(String passIn)
    {
        String res = "";

        //Size above 7:
        if (passIn.length() <= 7) {
            res = "Too short";
        }
        
        //Contains upper case and digit:
        boolean containsUpper = false; 
        boolean containsDigit = false;
        for (int i = 0; i < passIn.length(); i++) {            
            char singleChar = passIn.charAt(i);
            if( Character.isUpperCase( singleChar ) ) 
            {   containsUpper = true; }
            if( Character.isDigit(singleChar) )
            {   containsDigit = true; }                
        }
            
        if( !containsUpper )
        { res += "\nMissing capital letter";   }
        if( !containsDigit )
        { res += "\nNo digits"; }
        
        //Finally if the password is in the clear, then simply return OK:
        if( res.length() == 0 )
          { res = "OK";       }
        
        return res;
    }

}
