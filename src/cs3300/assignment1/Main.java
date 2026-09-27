package cs3300.assignment1;

public class Main {
	public static void main(String[] args) {
		
		// initialization
		TicketBook ticketBook = new TicketBook(5);
		TicketManager ticketManager = new TicketManager(ticketBook);

		// create two events
		Event event1 = new Event("TigerHacks", "Lafferre");
		Event event2 = new Event("TigerQuant Meeting", "Middlebush");
		
		// create two ticket types
		TicketType ticketType1 = new TicketType("VIP", 50);
		TicketType ticketType2 = new TicketType("Regular", 10);
		
		// create five tickets
		Ticket ticket1 = ticketManager.createTicket(event1, ticketType1, "Anna");
		Ticket ticket2 = ticketManager.createTicket(event1, ticketType2, "Ben");
		Ticket ticket3 = ticketManager.createTicket(event2, ticketType1, "Catie");
		Ticket ticket4 = ticketManager.createTicket(event2, ticketType2, "Desirae");
		Ticket ticket5 = ticketManager.createTicket(event2, ticketType2, "Edgar");
	
		// cancel a ticket
		ticket5.cancel();
		
		// admit a ticket 
		ticket1.admit();
		
		// invalid operation
		System.out.println("\nInvalid Operation\n");
		ticket5.admit();

		// print all tickets
		System.out.println("\nPrint all tickets\n");
		ticketBook.printAll();
		
		// print tickets for one specific event: event1
		System.out.println("\nPrint all tickets for a single event\n");
		ticketBook.printForEvent(event1);
	}
}
