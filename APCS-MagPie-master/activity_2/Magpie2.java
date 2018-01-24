package activity_2;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        int noResponseCounter = 0;
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
                        response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0)
        {
                        response = "Tell me more about your pets.";
        }
        
        else if (statement.indexOf("Mr. Appel") >= 0)
        {
                        response = "He must be a nice teacher.";
        }
        
        else if (statement.indexOf("sad") >= 0)
        {
                        response = "Aww, I'm sorry.";
        }
        
        else if (statement.indexOf("happy") >= 0)
        {
                        response = "That's good.";
        }
        
        else if (statement.indexOf("awesome") >= 0)
        {
                        response = "Wow! Tell me more!";
        }
        
        else if (statement.trim().length() == 0){
                        if (noResponseCounter == 3)
                        {
                            response = "Here to a link to learn how to type: https://www.typing.com/typinglessons";
                        }
                        
                        else
                        {
                            response = "Speak up, please.";
                            noResponseCounter += 1;
                        }
        } 
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 5;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        
        else if (whichResponse == 4)
        {
            response = "I can't believe it!";
        }
        
        else if (whichResponse == 5)
        {
            response = "Huh? Oh, go on.  I definitely wasn't sleeping...";
        }
        return response;
    }
}
