package ca.durhamcollege;

public class ExtendedWorkTicket extends WorkTicket
{
    //Declaration
    boolean myOpen;

    //ACCESSOR
    public boolean isOpen()
    {
        return myOpen;
    }

    //MUTATORS
    public void openTicket()
    {
        myOpen = true;
    }
    public void closeTicket()
    {
        myOpen = false;
    }
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
    ExtendedWorkTicket(){
        super();
        myOpen = true;
    }

    ExtendedWorkTicket(int ticketNumber, String clientID, int year, int month, int day, String issueDescription,
                       boolean myOpen)
    {
        super(ticketNumber, clientID, year, month, day, issueDescription);
        this.myOpen = myOpen;
    }
}
