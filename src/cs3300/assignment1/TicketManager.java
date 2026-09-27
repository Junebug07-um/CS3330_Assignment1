package cs3300.assignment1;

public class TicketManager {
	
	private TicketBook ticketBook;
	private int ticketIncrement = 1;
	
	// constructor 
	public TicketManager (TicketBook ticketBook) {
		this.ticketBook = ticketBook; 
		
	}
	
	// create ticket
	public Ticket createTicket(Event event, TicketType type, String studentName) {
		Ticket ticket = ticketBook.createTicket(ticketIncrement, event, type, studentName);
		ticketIncrement += 1;
		return ticket;
	}
	
	// cancel ticket by ID
	public Ticket cancelTicket(int id) {
		Ticket ticket = ticketBook.findById(id);
		ticket.cancel();
		return ticket;
	}
	
	// admit ticket by ID
	public Ticket admitTicket(int id) {
		Ticket ticket = ticketBook.findById(id);
		ticket.admit();
		return ticket;
	}
}
