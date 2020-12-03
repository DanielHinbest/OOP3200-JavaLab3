package ca.durhamcollege;

public class ExtendedWorkTicket extends WorkTicket
{
    //Declaration
    boolean isOpen;

    ExtendedWorkTicket(){
        super();
        isOpen = true;
    }

    ExtendedWorkTicket(int ticketNumber, String clientID, int year, int month, int day, String issueDescription,
                       boolean isOpen)
    {
        super(ticketNumber, clientID, year, month, day, issueDescription);
        this.isOpen = isOpen;
    }
}
