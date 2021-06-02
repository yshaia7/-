/**
 * This is the main that mange all the website address size with
 * bytes calculation.
 */
package hadassah;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * @param args          - name of the input file and output file
     */
    public static void main(String[] args) {

        /* Wrong number of inputs arguments */
        try
        {
            if(args.length < 2)
                throw new WrongUsageException("wrong usage");
        }catch(WrongUsageException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        //never get here
        catch (Exception e) { System.exit(0); }

        /* Initialize classes */
        ReadFile readFile = new ReadFile();
        UpdateUrlSize updateUrlSize = new UpdateUrlSize();
        WriteFile writeFile = new WriteFile();
        List<Url> listUrl = new ArrayList<>();;

        /* Fill the list with the url website */
        try {
            readFile.ReadFile(new File(args[0]), listUrl);
        }
        catch (BadInputException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        //never get here
        catch (Exception e) { System.exit(0); }

        /* Find each url website size */
        updateUrlSize.start(listUrl);

        /* Write url website address and size to file */
        writeFile.writeToFile(listUrl, new File(args[1]));

    }
}
