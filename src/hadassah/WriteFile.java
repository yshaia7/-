/**
 * This class write all website address and their size in
 * file.
 */

package hadassah;

import java.io.*;
import java.util.List;

public class WriteFile {

    /**
     * This function write the output file
     *
     * @param listUrl  - website list are sorted by bytes size
     * @param filename - name of file to save the information
     */
    public void writeToFile(List<Url> listUrl, File filename) {

        try (BufferedWriter writer = new BufferedWriter(
             new OutputStreamWriter(new FileOutputStream(filename)))){

            /* write each url website and size in different line in the file*/
            for (int i = 0; i < listUrl.size(); i++) {
                if (listUrl.get(i).getSize() != -1) {
                    try {
                        writer.write(listUrl.get(i).toString());
                        writer.newLine();
                    }catch(IOException e ) { } }
                }
        }
        catch (Exception e) { }
    }
}