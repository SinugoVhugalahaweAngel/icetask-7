/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookingevent;
import java.util.Scanner;
/**
 *
 * @author Angel Vhugie
 */
public class BookingEvent {

    public static void main(String[] args) {
         
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their first name
        System.out.println("Enter your booking code: ");
        String bookingcode = sc.nextLine();  // Read first name from user input

         // Create an instance of the Login class to handle registration and login
        Booking login = new Booking();
       
// Start the make reservations process
        System.out.println("Make reservations.");
        System.out.println("Enter a bookingcode (max 12 characters, must include an underscore): ");
        String code = sc.nextLine();   // Read username from user input

         if (!login.checkbookingcode(code)) {
            System.out.println("Invalid bookingcode format. bookingcode must be max 12 characters and contain an underscore.");
            return;  // Exit if the username format is invalid
        }
         
         // Prompt the user to enter a password that meets complexity requirements
        System.out.println("Enter a password (must include a capital letter, number, and special character): ");
        String password = sc.nextLine();   // Read password from user input
        

    }
}
