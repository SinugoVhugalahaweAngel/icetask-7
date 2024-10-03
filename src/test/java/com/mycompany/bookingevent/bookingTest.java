/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.bookingevent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel Vhugie
 */
public class bookingTest {
    
    public bookingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkbookingcode method, of class booking.
     */
    @Test
    public void testCheckbookingcode() {
        System.out.println("checkbookingcode");
        String code = "Enter_123";
        booking instance = new booking();
        boolean expResult = true;
        boolean result = instance.checkbookingcode(code);
        assertEquals(expResult, result);
        System.out.println("Result for '" + code + "': " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
@Test
public void testCheckbookingcodeInvalid() {
        System.out.println("checkUserName");
        String code = "Enter1234567890";
        booking instance = new booking();
        boolean expResult = false;
        boolean result = instance.checkbookingcode(code);
        // Assert that the result matches the expected result
       assertEquals(expResult, result);
       // Print the result for manual verification
        System.out.println("booking code is not correctly formatted,Please ensure that your booking code contains underscore and is no more than 12 characters  in length");

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
         System.out.println("Result for '" + code + "': " + result);
         
        
    }
    /**
     * Test of checkPasswordComplexity method, of class booking.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        booking instance = new booking();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeReservation method, of class booking.
     */
    @Test
    public void testMakeReservation() {
        System.out.println("makeReservation");
        String bookingCode = "";
        String password = "";
        booking instance = new booking();
        String expResult = "";
        String result = instance.makeReservation(bookingCode, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
