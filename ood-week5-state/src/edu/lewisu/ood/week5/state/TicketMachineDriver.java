package edu.lewisu.ood.week5.state;

public class TicketMachineDriver {

	public static void main(String[] args) {
		
		// Initialize w/ 2 seats available and print state
		TicketMachine ticketMachine = new TicketMachine(2);
		System.out.println(ticketMachine);

		// Sell 1 seat and check state
		ticketMachine.prepPayment();
		ticketMachine.makePayment();
		System.out.println(ticketMachine);

		// Try to sell 2 more seats, second attempt should fail
		ticketMachine.prepPayment();
		ticketMachine.makePayment();
		ticketMachine.prepPayment();
		ticketMachine.makePayment();
		
		// Reset number of seats, re-test selling seat & printing state
		ticketMachine.setNumSeats(3);
		ticketMachine.prepPayment();
		ticketMachine.makePayment();

		System.out.println(ticketMachine);
	}
}
