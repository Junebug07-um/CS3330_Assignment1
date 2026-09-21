
public class Ticket {
public int id;
public Event event;
public TicketType ticketType;
public String studentName;
public boolean canceled;
public boolean admitted;// Ticket has id, event, type, studentname, cancelled, and admitted

public Ticket(int id, Event event, TicketType ticketType, String studentName, boolean canceled, boolean admitted) {
	if(id <= 0.0) {// checks id is positive
		throw new IllegalArgumentException("ID must be positive");
	}
	if(event == null) {// checks if event is null
		throw new IllegalArgumentException("Event must not be null");
	}
	if(ticketType == null) {// checks if ticketype is null
		throw new IllegalArgumentException("Ticket Type must not be null");
	}
	if(studentName == null|| studentName.isBlank()) {// checks studentname is not null or blnank
		throw new IllegalArgumentException("Student Name must not be null or blank");
	}
	
	this.id = id;// sets everything
	this.event = event;
	this.ticketType = ticketType;
	this.studentName = studentName;
	this.canceled = false;
	this.admitted = false;
	
}

public int getID() {// getters for all fields
	return id;
}

public Event getEvent() {
	return event;
}

public TicketType getTicketType() {
	return ticketType;
}

public String getStudentName() {
	return studentName;
}

public boolean isCanceled() {
	return canceled;
}

public boolean isAdmitted() {
	return admitted;
}

public boolean isActive() { // only active if not canceled or admitted
	return !canceled && !admitted;
}

public boolean cancel() {
	if(isActive() == false) {// if not active cannot be cancelled
		return false;
	}
	this.canceled = true;// cancels ticket
	return canceled;
}

public boolean admit() {
	if(isActive() == false) {// cannot admit if not active
		return false;
	}
	
	this.admitted = true;// admits
	return admitted;
}

@Override
public String toString() {// print
    String status = "ACTIVE";// uses status string bc boolean wouldnt make sense to be printed
    if (admitted) {
        status = "ADMITTED";
    } 
    
    if (canceled) {
        status = "CANCELED";
    }
    return String.format("Ticket #%d | Student: %s | Event: [%s] | Type: %s | Status: %s",
            id, studentName, event, ticketType, status);
}

}
