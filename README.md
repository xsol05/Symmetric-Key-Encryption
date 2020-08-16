# Encryption
_Programs for two symmetric key encryption methods_

### Caesar Cipher
Encrypting data using a Caesar cipher involves replacing each character with a character which is a set distance away (in the character set) from it. For example if you were encrypting the word "and" using a shift of 3, it would become "dqg".

**How the program works:**  
The program takes a command line argument to determine the size of the shift, reads input from _System.in_, and sends the encrypted output to _System.out_. If the program worked, the command _diff_ should return nothing.

**How to run the program:**  
Using a shift of 3:  
$ java Caesar 3 < caesar-input.txt > encrypted.txt  
$ java Caesar -3 < encrypted.txt > decrypted.txt  
$ diff caesar-input.txt decrypted.txt  

### Bit-Level Cipher
Encrypting data using a bit-level cipher involves taking an encryption key, let’s say a simple string, and performing an XOR (exclusive OR) operation between each byte in the key and the corresponding byte in the information to be encrypted. If the encryption key is shorter than the data, then just loop back to the start of the encryption key and continue the process until all data has been encrypted. To decrypt the encrypted data, simply repeat the encryption process, since performing two XORs with the same key will return the original value.

**How the program works:**  
The first argument to the program is the name of a file to use as an input stream. The second argument to the program is the name of a file to use as an output stream. When run, there will be a prompt to input the encryption and decryption key (which should be identical). If the program worked, the command _diff_ should return nothing.

**How to run the program:**  
$ java BitLevel bitlevel-input.txt encrypted.txt  
  Enter key:  
$ java BitLevel encrypted.txt decrypted.txt  
  Enter key:  
$ diff bitlevel-input.txt decrypted.txt  
