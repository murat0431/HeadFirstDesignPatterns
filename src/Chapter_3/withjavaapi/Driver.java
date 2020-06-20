package Chapter_3.withjavaapi;

import java.io.*;
import java.nio.Buffer;

public class Driver {
    public static void main(String[] args) {
        InputStream fi;
        int c;
        try {
             fi =
                    new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\murat\\OneDrive\\Documents\\decorator.txt")));
            while( (c = fi.read())>=0) {
                System.out.print((char)c);
            }
        } catch (IOException fe) {
            fe.printStackTrace();
        }
    }
}
