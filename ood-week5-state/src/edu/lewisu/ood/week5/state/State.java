package edu.lewisu.ood.week5.state;

public interface State {
 
	public void prepPayment();
	public void cancelPayment();
	public void makePayment();
	public void issueTicket();
	
	public void reset();
}
