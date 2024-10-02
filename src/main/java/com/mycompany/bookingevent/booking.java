/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookingevent;

/**
 *
 * @author Angel Vhugie
 */
public class booking {
    
    private String bookingCode;
    private String password;
    
    // This Method ensures that any bookingcode contains an under score(_) and length is no more than 12
    public boolean checkbookingcode(String code) {
        // Ensure the username contains an underscore and is no more than 12 characters
        return code.length() <= 12 && code.contains("_");
    }
    // This method ensures that password meet the following password complexity rules ,the password must be:Atleast 8 characters long ,Contains capital letter,Contains a number,Contains special character 
    public boolean checkPasswordComplexity(String password) {
        this.password = password;

        // Flags for password complexity checks
        boolean hasCapital = false;
        boolean hasSpecialcharacter = false;
        boolean hasDigit = false;

          for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);  // Get character at index i

        if (Character.isUpperCase(c)) {
            hasCapital = true;
        } else if (Character.isDigit(c)) {
            hasDigit = true;
        } else if (!Character.isLetterOrDigit(c)) {  // Check for special character
            hasSpecialcharacter = true;
        }
          }
           // At least 8 characters, a capital letter, a number, and a special character
        return password.length() >= 8 && hasCapital && hasSpecialcharacter && hasDigit;
    
    }

    
}
