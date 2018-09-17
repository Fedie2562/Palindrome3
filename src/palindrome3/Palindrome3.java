/*
 * Ferris D.
 * 17/09/2018
 * This program will check if the entire phrase is a palindrome
 */

package palindrome3;

import javax.swing.JOptionPane;

/**
 * @author fedie2562
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Input
        String originalPhrase = JOptionPane.showInputDialog("Please enter your phrase");
        String backwardsPhrase = "";
        String checkPhrase = originalPhrase;
        checkPhrase = checkPhrase.replaceAll(" ", "");
        for (int pos = checkPhrase.length()-1; pos>=0;pos--){
            backwardsPhrase += checkPhrase.charAt(pos);
        }
        if (checkPhrase.equalsIgnoreCase(backwardsPhrase)){
            JOptionPane.showMessageDialog(null, originalPhrase+" is a palindrome");
        }
        else {
            JOptionPane.showMessageDialog(null, originalPhrase+" is NOT a palindrome");
        }
    }
    
}
