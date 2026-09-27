package cs3300.assignment1;

public class TicketType {
	private final String name;
	private final double price; // tickettype has name and price
	
	public TicketType(String name, double price) {
		if(name == null || name.isBlank()) { // checks if name is valid
			throw new IllegalArgumentException("Ticket name cannot be blank or null");
		}
		
		if(price < 0) {// checks if price is positive
			throw new IllegalArgumentException("Ticket price cannot be negative");
		
		}
		this.name = name;//sets name and price
		this.price = price;
	}
	
	public String getName() { // getters for name and price
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	
	public String toString() {// prints name and price
		return String.format("%s ($%.2f)", name, price);
	}

}
