/**
 * This class stand for reading file website address
 * and store the information in linked list
 */

package hadassah;

import java.io.*;
import java.util.*;

public class ReadFile {
    /**
     * This function copy the url website address and store them into the list
     *
     * @param filename - name of the file contain webSite
     * @param listUrl  - list to store all the website address
     * @throws  BadInputException      - bad input cant open/read the file
     */
    public void ReadFile(File filename, List<Url> listUrl) throws BadInputException {

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String urlSite;
            /* Create new Node in linked List for each url you read from file */
            while ((urlSite = reader.readLine()) != null) {
                listUrl.add(new Url(urlSite));
            }
        } catch (IOException  e) {
            throw new BadInputException("bad input");
        }

    }

}





