package caesarcipher;

import java.util.Scanner;

public class Encryption {

    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println(" Input the text : ");
        String text = a.nextLine();
        System.out.println(" Enter the shifting value: ");
        int shift = a.nextInt();
        String EncryptText = "";
        char letter;
        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter + shift);
                if (letter > 'z') {
                    letter = (char) (letter + 'a' - 'z' - 1);
                }
                EncryptText = EncryptText + letter;
            } else if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter + shift);
                if (letter > 'Z') {
                    letter = (char) (letter + 'A' - 'Z' - 1);
                }
                EncryptText = EncryptText + letter;
            } else {
                EncryptText = EncryptText + letter;
            }
        }
        System.out.println(" encrypted text : " + EncryptText);
    }
}
