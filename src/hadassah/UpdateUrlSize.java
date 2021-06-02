/**
 * This class stand for update website size
 * after all website already stored in the Linked list
 *
 * This class also designed for handle exception
 */
package hadassah;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.*;



public class UpdateUrlSize {

    /**
     * This function update size of url website into the list
     *
     * @param listUrl - list website address
     */
    public void start(List<Url> listUrl) {

        UrlSizeCalculation urlSizeCalculation = new UrlSizeCalculation();

        /* for each url check is size and store it in the linked list*/
        for(int i = 0; i < listUrl.size(); i++) {
            try {
                listUrl.get(i).setSize(urlSizeCalculation.URLReader(listUrl.get(i).getUrl()));
            }
            catch (UrlException | MalformedURLException e){
                listUrl.get(i).setSize(-1);
            }
            catch (Exception e){}
        }

        /* sort url website list */
        Collections.sort(listUrl);
    }

}



