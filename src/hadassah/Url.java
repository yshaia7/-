/**
 * This class represent url class
 * String url - save the website address
 * long size - save the size of website in bytes
 */

package hadassah;


public class Url implements Comparable<Url> {
    private String url;
    private long size;
    /**
     * @param url - initialize new url website, assume for now website empty
     */
    public Url(String url) {
        this.url = url;
        size = 0;
    }
    /**
     * @return size of the url website in bytes
     */
    public long getSize() { return size; }

    /**
     * @return url website as string
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param size - update bytes size of url website
     */
    public void setSize(long size) {
        this.size = size;
    }

    /**
     * That method stand for compare between 2 website size
     * it will help to sort the DataBase ease
     * @param url - website to compare the size
     * @return    - size of website as in bytes
     */
    @Override
    public int compareTo(Url url) {
        if (size < url.size)
            return -1;
        else if (size > url.size)
            return 1;
        return 0;

    }

    @Override
    /**
     * @return url website and size of the website
     */
    public String toString() {
        return url + ' ' + size;
    }
}
