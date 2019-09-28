package edu.lewisu.ood.week5.state;

/*
 * Stephen Montague
 * Object Oriented Development
 * Fall 2019 - Term 1
 * Week 5 - State
 *
 * Summary:
 *     Demonstrates a State Pattern using a Ticket Machine theme.
 *     Slightly mods Gumball Machine-themed code from course textbook -
 *     Head First Design Patterns, by Freeman, et al., available from -
 *     https://www.wickedlysmart.com/head-first-design-patterns/
 *
 * Program Notes:
 *     Uses a State Pattern to operate a ticket machine that
 *     when conditions are correct, prints tickets to destinations,
 *     pseudo-randomly selected from an array of options.
 *
 *     Sample output:
 *         Random Transporters, Inc.
 * 	       Number of seat(s): 2
 *         Ticket machine is waiting for payment
 *         
 *         Payment prepared
 *         Payment made...
 *         Printing ticket to... Washington D.C.
 *         Successful
 */

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
