package edu.lewisu.ood.week5.state;

//import java.util.Random;

public class HasPaymentState implements State {
	TicketMachine ticketMachine;
 
	public HasPaymentState(TicketMachine ticketMachine) {
		this.ticketMachine = ticketMachine;
	}
  
	public void prepPayment() {
		System.out.println("Cannot prepare payment again, payment already prepared");
	}
 
	public void cancelPayment() {
		System.out.println("Payment cancelled, as requested");
		ticketMachine.setState(ticketMachine.getNoPaymentState());
	}
 
	public void makePayment() {
		System.out.println("Payment made...");
		ticketMachine.setState(ticketMachine.getSoldState());
	}

    public void issueTicket() {
        System.out.println("No ticket printed");
    }
    
    public void reset() { }
 
	public String toString() {
		return "awaiting confirmation of payment details";
	}
}
