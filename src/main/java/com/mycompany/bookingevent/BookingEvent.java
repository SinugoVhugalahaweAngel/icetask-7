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

        
        System.out.println("Enter your booking code: ");
        String bookingcode = sc.nextLine();  

         // Create an instance of the Login class to handle registration and login
        booking login = new booking();
       
// Start the make reservations process
        System.out.println("Make reservations.");
        System.out.println("Enter a bookingcode (max 12 characters, must include an underscore): ");
        String code = sc.nextLine();   

         if (!login.checkbookingcode(code)) {
            System.out.println("Invalid bookingcode format. bookingcode must be max 12 characters and contain an underscore.");
            return; 
        }
         
         // Prompt the user to enter a password that meets complexity requirements
        System.out.println("Enter a password (must include a capital letter, number, and special character): ");
        String password = sc.nextLine();   // Read password from user input
        
        // Define booking code and password
        String bookingCode = "Enter_123";
      

        // Register the user using the provided booking code and password
        String makeReservationMessage = login.makeReservation(bookingCode, password);

        // Output the result of the reservation process
        System.out.println(makeReservationMessage);

    }
}
