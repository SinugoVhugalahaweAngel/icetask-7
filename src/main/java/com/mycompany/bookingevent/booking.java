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
}
