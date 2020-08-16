/** @author xsol05
 *  Symmetric Key Encryption
 *  Bit-Level Cipher
 */

import java.io.*;
import java.util.Scanner;

public class BitLevel {

    public static void main(String[] args) {
        try {  
            FileInputStream fileInput = new FileInputStream(args[0]);
            FileOutputStream fileOutput = new FileOutputStream(args[1]);

            Scanner scan = new Scanner(System.in); // make a scanner to read an encryption key
            System.out.println("Enter key: ");
            String key = scan.next();

            int input = fileInput.read(); // reads first byte
            int encryption = 0;
            int i = 0; // keep track of where you are in the key

            while (input != -1) { // while end of stream not reached
                if (i >= key.length()) { // if the encryption key is shorter than the data, then just loop back to the start of the encryption key and continue the process until all data has been encrypted
                    i = 0;
                }
                encryption = input ^ key.charAt(i); // XOR between input and key
                i++;
                fileOutput.write(encryption); // print the byte
                fileOutput.flush(); // clears the buffer
		        input = fileInput.read(); // read subsequent bytes
            }
            fileOutput.close();
        } catch(Exception e) {
            System.out.println("End of stream reached" + e);
        }
    }
}
