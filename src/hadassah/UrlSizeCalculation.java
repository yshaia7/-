/**
 * This class calculate each url website in bytes
 */

package hadassah;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlSizeCalculation {

    /**
     * This function calculate size of url in bytes
     *
     * @param url                    - website address to check size in bytes
     * @throws UrlException          - threw failed to read url
     * @throws MalformedURLException - threw failed to create url link from string
     * @return                       - size of the website in bytes
     */
    public long URLReader(String url) throws UrlException, MalformedURLException {

        byte[] tempByte=null;
        URL currentUrl = new URL(url);

        /* Find the website size in bytes */
        try (InputStream streamUrl = currentUrl.openStream()){
            tempByte = streamUrl.readAllBytes();
        }
        catch (Exception e){
            throw new UrlException();
        }

        return tempByte.length;
    }
}
