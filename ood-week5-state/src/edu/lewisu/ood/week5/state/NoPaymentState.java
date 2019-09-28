package edu.lewisu.ood.week5.state;

public class NoPaymentState implements State {
    TicketMachine ticketMachine;
 
    public NoPaymentState(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
    }
 
	public void prepPayment() {
		System.out.println("Payment prepared");
		ticketMachine.setState(ticketMachine.getHasPaymentState());
	}
 
	public void cancelPayment() {
		System.out.println("Cannot cancel, payment not prepared yet");
	}
 
	public void makePayment() {
		System.out.println("Cannot make payment, payment not prepared yet");
	 }
 
	public void issueTicket() {
		System.out.println("Cannot issue ticket, awaiting payment");
	} 
	
	public void reset() { }
 
	public String toString() {
		return "waiting for payment";
	}
}
