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

    }
}
