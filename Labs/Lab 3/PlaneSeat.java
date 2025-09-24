public class PlaneSeat {
    private final int seatId;
    private boolean assigned;
    private int customerId;
    
    // Constructor
    public PlaneSeat(int seat_id) {
        this.seatId = seat_id;
        this.assigned = false;
        this.customerId = 0;
    }
    
    // Get method that returns the seat number
    public int getSeatID() {
        return seatId;
    }
    
    // Get method that returns the customer number
    public int getCustomerID() {
        return customerId;
    }
    
    // Method that returns a boolean on whether the seat is occupied
    public boolean isOccupied() {
        return assigned;
    }
    
    // Method that assigns a seat to a customer
    public void assign(int cust_id) {
        this.assigned = true;
        this.customerId = cust_id;
    }
    
    // Method that unassigns a seat
    public void unAssign() {
        this.assigned = false;
        this.customerId = 0;
    }
}