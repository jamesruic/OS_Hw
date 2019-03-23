import java.net.*;
import java.io.*;

public class QOTD_Client
{
    public static void main(String[] args) {
        try {
            /* make connection to server socket */
            Socket sock = new Socket("127.0.0.1",6017);
            InputStream in = sock.getInputStream();
            BufferedReader bin = new
            BufferedReader(new InputStreamReader(in));

            /* read the date from the socket */
            String line;
            while ( (line = bin.readLine()) != null)
            System.out.println(line);
            
            /* close the socket connection*/
            sock.close();
        }
        catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}