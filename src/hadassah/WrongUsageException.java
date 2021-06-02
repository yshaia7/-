/**
 * This class stand for handle exception when wrong args number
 */
package hadassah;

public class WrongUsageException extends Exception{

    public WrongUsageException(){ }
    /**
     * @param error_cause  -  msg that cause the exception
     */
    public WrongUsageException(String error_cause)
    {
        super(error_cause);
    }
}
