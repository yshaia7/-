/**
 * This class stand for handle exception when failed open the file
 */
package hadassah;

public class BadInputException extends Exception{

    public BadInputException(){ }
    /**
     * @param error_cause  -  msg that cause the exception
     */
    public BadInputException(String error_cause)
    {
        super(error_cause);
    }
}
