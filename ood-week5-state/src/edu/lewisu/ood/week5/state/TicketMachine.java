package edu.lewisu.ood.week5.state;

public class TicketMachine {
 
	State soldOutState;
	State noPaymentState;
	State hasPaymentState;
	State soldState;
 
	State state;
	int numSeats = 0;
	String[] destinations = new String[]{"South Park","Springfield","Washington D.C."};	
	
	public TicketMachine(int numSeats) {
		soldOutState = new SoldOutState(this);
		noPaymentState = new NoPaymentState(this);
		hasPaymentState = new HasPaymentState(this);
		soldState = new SoldState(this);

		this.numSeats = numSeats;
 		if (numSeats > 0) {
			state = noPaymentState;
		} else {
			state = soldOutState;
		}
	}
 
	public void prepPayment() {
		state.prepPayment();
	}
 
	public void cancelPayment() {
		state.cancelPayment();
	}
 
	public void makePayment() {
		state.makePayment();
		state.issueTicket();
	}
 
	void printTicket() {
		System.out.println("Printing ticket to... " 
				+ destinations[(int)(Math.random()*destinations.length)]);
		if (numSeats != 0) {
			numSeats = numSeats - 1;
		}
	}
 
	int getNumSeats() {
		return numSeats;
	}
 
	void setNumSeats(int numSeats) {
		this.numSeats += numSeats;
		System.out.println("\nThe number of open seats is now: " + this.numSeats);
		state.reset();
	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoPaymentState() {
        return noPaymentState;
    }

    public State getHasPaymentState() {
        return hasPaymentState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nRandom Transporters, Inc.");
		result.append("\nNumber of seat(s): " + numSeats);
		result.append("\n");
		result.append("Ticket machine is " + state + "\n");
		return result.toString();
	}
}
