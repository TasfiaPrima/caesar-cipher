package caesarcipher;

import java.util.Scanner;

public class Decryption {

    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("Input the text: ");
        String text = a.nextLine();
        System.out.println("Enter the shifting value: ");
        int shift = a.nextInt();
        String decryptText = "";
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter - shift);
                if (letter < 'a') {
                    letter = (char) (letter - 'a' + 'z' + 1);
                }
                decryptText = decryptText + letter;
            } else if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter - shift);
                if (letter < 'A') {
                    letter = (char) (letter - 'A' + 'Z' + 1);
                }
                decryptText = decryptText + letter;
            } else {
                decryptText = decryptText + letter;
            }
        }
        System.out.println(" decrypted message: " + decryptText);
    }
}
