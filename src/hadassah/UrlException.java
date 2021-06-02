/**
 * This class stand for handle exception when failed read url
 */
package hadassah;

public class UrlException extends Exception {
        public UrlException(){ }
        /**
         * @param error_cause  -  msg that cause the exception
         */
        public UrlException(String error_cause)
        {
            super(error_cause);
        }
    }





