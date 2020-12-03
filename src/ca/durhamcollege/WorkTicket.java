/* Program Name: OOP 3200 - Java Lab 2 - WorkTicket
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: November 19, 2020
 * Description: A project to create and display a work ticket using the WorkTicket class
 */
package ca.durhamcollege;

import java.time.LocalDate;
import java.util.InputMismatchException;

public class WorkTicket
{
    // Private data members
    private int ticketNumber;
    private String clientID;
    private LocalDate ticketDate;
    private String issueDescription;

    //Constructors
    /**
     * The default constructor for WorkTicket
     */
    public WorkTicket()
    {
        this.ticketNumber = 0;
        this.clientID = null;
        this.ticketDate = null;
        this.issueDescription = null;
    }

    /**
     * The parameterized constructor for the WorkTicket
     * @param ticketNumber - the ticket number
     * @param clientID - the client ID
     * @param year - the year for the ticket's date
     * @param month - the month for the ticket's date
     * @param day - the day for the ticket's date
     * @param issueDescription - the issue description
     */
    //Parameterized
    public WorkTicket(int ticketNumber, String clientID, int year, int month, int day, String issueDescription)
    {
        setWorkTicket(ticketNumber, clientID, year, month, day, issueDescription);
    }

    /**
     * Accessor function to return the ticket number from WorkTicket
     * @return {int}
     */
    // ACCESSORS & MUTATORS
    //Get Ticket Number
    public int getTicketNumber()
    {
        return ticketNumber;
    }

    /**
     * Mutator function to set the ticket number
     * @param ticketNumber - parameter to set the ticket number
     */
    //Set Ticket Number
    public void setTicketNumber(int ticketNumber)
    {
        try
        {
            //If ticket number is less than 0, throws an exception
            if (ticketNumber < 0)
            {
                throw new IllegalArgumentException();
            }
            //Ticket is valid
            else
            {
                this.ticketNumber = ticketNumber;
            }
        }
        catch (IllegalArgumentException ex)
        {
            System.out.print("\nThe work ticket number entered must be greater than zero");
        }
        catch (InputMismatchException ex)
        {
            System.out.print("\nThe work ticket entered must be an integer number");
        }
    }

    /**
     * Accessor function to return the client ID
     * @return {String}
     */
    //Get Client ID
    public String getClientID()
    {
        return clientID;
    }

    /**
     * Mutator function to set the client ID
     * @param clientID - parameter to set the client ID
     */
    //Set Client ID
    public void setClientID(String clientID)
    {
        if (clientID.length() > 0)
        {
            this.clientID = clientID;
        }
        else
        {
            System.out.println("The client ID must be at least one character long");
        }
    }

    /**
     * Accessor function to return the ticket date
     * @return {LocalDate}
     */
    //Get Ticket Date
    public LocalDate getTicketDate()
    {
        return ticketDate;
    }

    /**
     * Mutator function to set the ticket date
     * @param year - parameter to set the ticket's year for the date
     * @param month - parameter to set the ticket's month for the date
     * @param day - parameter to set the ticket's day for the date
     */
    //Set Ticket Date --Validations go in here--
    public void setTicketDate(int year, int month, int day)
    {
        // Date constants
        final int MIN_YEAR = 2000;
        final int MAX_YEAR = 2099;
        final int MIN_MONTH = 1;
        final int MAX_MONTH = 12;
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;

        // Validation for date
        try
        {
            if (year < MIN_YEAR || year > MAX_YEAR || month < MIN_MONTH || month > MAX_MONTH || day < MIN_DAY || day > MAX_DAY)
            {
                throw new IllegalArgumentException();
            }
            else
            {
                LocalDate ticketDate = LocalDate.of(year, month, day);
                this.ticketDate = ticketDate;
            }
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("\nThe date entered is invalid.");
        }
    }

    /**
     * Accessor function to return the issue description
     * @return {String}
     */
    //Get Issue Description
    public String getIssueDescription()
    {
        return issueDescription;
    }

    /**
     * Mutator function to set the issue description
     * @param issueDescription - parameter to set the ticket number
     */
    //Set Issue Description
    public void setIssueDescription(String issueDescription)
    {
        if (issueDescription.length() > 0)
        {
            this.issueDescription = issueDescription;
        }
        else
        {
            System.out.println("The issue description must be at least one character long");
        }

    }

    /**
     * Mutator function to set the work ticket attributes
     * @param ticketNumber - parameter for the ticket date
     * @param clientId - parameter for the client ID
     * @param year - parameter for the ticket year
     * @param month - parameter for the ticket month
     * @param day - parameter for the ticket day
     * @param issueDescription - parameter for the issue description
     * @return {boolean}
     */
    boolean setWorkTicket(int ticketNumber, String clientId, int year, int month, int day, String issueDescription)
    {
        boolean validInput = true;

        setTicketNumber(ticketNumber);
        setClientID(clientId);
        setTicketDate(year, month, day);
        setIssueDescription(issueDescription);

        if (this.ticketNumber != ticketNumber || this.clientID != clientId || this.ticketDate != ticketDate ||
                this.issueDescription != issueDescription)
        {
            validInput = false;
        }
        return validInput;
    }

    // Functions
    /**
     * This function overrides the toString method and returns the attributes of the WorkTicket object
     * @return {String}
     */
    @Override
    public String toString() {
        return "WorkTicket #: " + ticketNumber + "\n" +
                "ClientID:    " + clientID + "\n" +
                "Date:        " + ticketDate + "\n" +
                "Description: " + issueDescription + "\n";
    }
}

