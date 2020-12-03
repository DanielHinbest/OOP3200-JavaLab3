/* Program Name: OOP 3200 - Java Lab 3 - ExtendedWorkTicket
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: December 3, 2020
 * Description: A project to create and display a work ticket using the ExtendedWorkTicket class
 */
package ca.durhamcollege;

public class ExtendedWorkTicket extends WorkTicket
{
    //Declaration
    boolean myOpen;

    //ACCESSOR

    /**
     * returns the open status
     * @return {boolean}
     */
    public boolean isOpen()
    {
        return myOpen;
    }

    //MUTATORS

    /**
     * opens the work ticket
     */
    public void openTicket()
    {
        myOpen = true;
    }

    /**
     * closes the work ticket
     */
    public void closeTicket()
    {
        myOpen = false;
    }

    /**
     * overrides the base class to include the open setting for the work ticket
     * @param ticketNumber
     * @param clientId
     * @param year
     * @param month
     * @param day
     * @param issueDescription
     * @param myOpen
     * @return valid input
     */
    public boolean setWorkTicket(int ticketNumber, String clientId, int year, int month, int day, String issueDescription,
                                 boolean myOpen)
    {
        boolean isValid = true;

        if (myOpen != true)
        {
            isValid = false;
        }
        else {
            super.setWorkTicket(ticketNumber, clientId, year, month, day, issueDescription);
            this.myOpen = myOpen;
        }
        return isValid;
    }

    /**
     * Overrides the toString method
     * @return {String}
     */
    @Override
    public String toString() {
        String message = super.toString();

        if (isOpen() == true) {
            return super.toString() + "Ticket: OPEN";
        }
        else {
            return super.toString() + "Ticket: CLOSED";
        }
    }

    //Constructors

    /**
     * Creates an instance of ExtendedWorkTicket
     */
    ExtendedWorkTicket(){
        super();
        myOpen = true;
    }

    /**
     * Creates an instance of ExtendedWorkTicket
     * @param ticketNumber
     * @param clientID
     * @param year
     * @param month
     * @param day
     * @param issueDescription
     * @param myOpen
     */
    ExtendedWorkTicket(int ticketNumber, String clientID, int year, int month, int day, String issueDescription,
                       boolean myOpen)
    {
        super(ticketNumber, clientID, year, month, day, issueDescription);
        this.myOpen = myOpen;
    }

    /**
     * Creates an instance of ExtendedWorkTicket
     * @param workTicket
     * @param myOpen
     */
    ExtendedWorkTicket(WorkTicket workTicket, boolean myOpen)
    {
        super(workTicket);
        this.myOpen = myOpen;
    }
}
