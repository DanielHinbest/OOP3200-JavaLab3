/* Program Name: OOP 3200 - Java Lab 3 - ExtendedWorkTicket
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: December 3, 2020
 * Description: A project to create and display a work ticket using the ExtendedWorkTicket class
 */
package ca.durhamcollege;
import java.util.Scanner;

// Driver class
public class Main {

    public static void main(String[] args)
    {
        // Variable declarations for user input
        int ticketNumber = 0;
        String clientID = "";
        int year = 0;
        int month = 0;
        int day = 0;
        String issueDescription = "";

        // Scanner for user input
        Scanner keyboard = new Scanner(System.in);

        ExtendedWorkTicket ticket = new ExtendedWorkTicket();
        System.out.println("\nDefault Constructor\n-------------------\n" + ticket.toString());

        // Display Parameterized Constructor
        ticket = new ExtendedWorkTicket(1479, "Seasonal", 2014, 9, 2, "I have an issue. Plz help!", true);
        System.out.println("\nParameterized Constructor\n-------------------------\n" + ticket.toString());

        // Display ExtendedWorkTicket Parameterized Constructor
        WorkTicket ticket2 = new WorkTicket(1479, "Programmer", 2019, 9, 9, "Where is my class?!");
        System.out.println("\nParameterized Constructor\n-------------------------\n" + ticket2.toString());
        ticket = new ExtendedWorkTicket(ticket2, false);
        System.out.println("\nParameterized ExtendedWorkTicket\n-------------------------\n" + ticket.toString());

        // Display Using Setters/Getters
        System.out.println("\nSetters/Getters Ex.\n-------------------");
        ticket.setTicketNumber(12345);
        ticket.setClientID("OOP3200");
        ticket.setTicketDate(2000, 1, 1);
        ticket.setIssueDescription("Programming Issue");
        ticket.openTicket();

        //Output
        System.out.println("WorkTicket #: " + ticket.getTicketNumber());
        System.out.println("ClientID:     " + ticket.getClientID());
        System.out.println("Date:         " + ticket.getTicketDate());
        System.out.println("Description:  " + ticket.getIssueDescription());
        System.out.println("Is the ticket open? " + ticket.isOpen());
        ticket.closeTicket();
        System.out.println("Is the ticket open? " + ticket.isOpen() + "\n");
    }
}