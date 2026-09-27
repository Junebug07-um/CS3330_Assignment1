package cs3300.assignment1;

public class Event {
	private final String name;
	private final String location;
// Event has name and location
	
	public Event(String name, String location) {
		if(name == null || name.isBlank()) { // checks name to make sure it is valid
			throw new IllegalArgumentException("Event name cannot be blank or null");
		}
		
		if(location == null || location.isBlank()) { // checks location to make sure it is valid
			throw new IllegalArgumentException("Event location cannot be blank or null");
		}
		
		this.name = name; // sets name and location
		this.location = location;
	}
	
	public String getName() { // getters for name and location
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	@Override
	public String toString() {// print name and location of event
		return name + " @ " + location;
	}
	

	
}
