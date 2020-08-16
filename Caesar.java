/** @author xsol05
 *  Symmetric Key Encryption
 *  Caesar Cipher
 */

import java.io.*;

public class Caesar {

    private static InputStream in = System.in;
    private static  OutputStream out = System.out;

    public static void main(String[] args) {
        int shift = Integer.parseInt(args[0]);

        try {  
            int input = in.read(); // reads first byte
            int encryption;
            
            while (input != -1) { // while end of stream not reached
                encryption = input + shift;
                encryption = encryption % 255; // this essentially keeps encryption within the bounds of 255 (0 - 254). If encryption < 255, it will remain the same. If encryption > 255, it will be reduced.
                out.write(encryption); // print the byte
                out.flush(); // clears the buffer
		        input = in.read(); // read subsequent bytes
            }
            out.close();
        } catch(Exception e) {
            System.out.println("End of stream reached" + e);
        }
    }
}
