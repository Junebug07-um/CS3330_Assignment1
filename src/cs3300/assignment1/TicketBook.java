package cs3300.assignment1;

public class TicketBook {
	private Ticket[] tickets;
	private int count; // has ticket array and count
	
	public TicketBook (int capacity) {
		if(capacity <= 0) {// capacity must be positive
			throw new IllegalArgumentException("Capacity must be at least 1");
		}
		this.tickets = new Ticket[capacity]; // sets array of count
		this.count = 0; // count is 0
		
	}
	
	public Ticket createTicket(int id, Event event, TicketType type, String studentName) {
        if (count >= tickets.length) {// creates ticket and checks that count of tickets is less than total capacity
            throw new IllegalStateException("TicketBook capacity reached. Cannot store more tickets.");
        }
        Ticket ticket = new Ticket(id, event, type, studentName); // makes new ticket
        tickets[count] = ticket; // sets ticket at count of tickets - 1(bc smthing is stored at 0)
        count++; // adds one to count
        return ticket;
    }

    public Ticket findById(int id) {
        for (int i = 0; i < count; i++) { // loops through
            if (tickets[i].getID() == id) {
                return tickets[i]; // if found returns ticket
            }
        }
        System.out.println("No ticket found\n");
        return null;// else returns null
    }

    public void printAll() {
        if (count == 0) {// checks empty case
            System.out.println("No tickets currently stored.");
            return;
        }
        for (int i = 0; i < count; i++) {// prints all tickets
            System.out.println(tickets[i]);
        }
    }

    public void printForEvent(Event event) {
        if (event == null) {// checks if event is null
            throw new IllegalArgumentException("Event filter cannot be null.");
        }
        boolean found = false;// sets to false
        for (int i = 0; i < count; i++) {// loops through and sets found to true if foud
            if (tickets[i].getEvent() == event) {
                System.out.println(tickets[i]);
                found = true;
            }
        }
        if (!found) {// if not found
            System.out.println("No tickets found for event: " + event.getName());
        }
    }
}


