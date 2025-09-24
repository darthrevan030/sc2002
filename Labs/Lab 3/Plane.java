public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat;
    
    // Constructor for the class Plane
    public Plane() {
        seat = new PlaneSeat[12];
        numEmptySeat = 12;
        
        // Initialize all seats with seat IDs 1-12
        for (int i = 0; i < 12; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }
    }
    
    // Method to sort the seats according to ascending order of customerID
    private PlaneSeat[] sortSeats() {
        // Create a copy of the original seat array
        PlaneSeat[] sortedSeats = new PlaneSeat[12];
        for (int i = 0; i < 12; i++) {
            sortedSeats[i] = seat[i];
        }
        
        // Sort only occupied seats by customerID using bubble sort
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11 - i; j++) {
                if (sortedSeats[j].isOccupied() && sortedSeats[j + 1].isOccupied() &&
                    sortedSeats[j].getCustomerID() > sortedSeats[j + 1].getCustomerID()) {
                    // Swap seats
                    PlaneSeat temp = sortedSeats[j];
                    sortedSeats[j] = sortedSeats[j + 1];
                    sortedSeats[j + 1] = temp;
                }
            }
        }
        
        return sortedSeats;
    }
    
    // Method to display the number of empty seats
    public void showNumEmptySeats() {
        System.out.println("There are " + numEmptySeat + " empty seats");
    }
    
    // Method to display the list of empty seats
    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for (int i = 0; i < 12; i++) {
            if (!seat[i].isOccupied()) {
                System.out.println("SeatID " + seat[i].getSeatID());
            }
        }
    }
    
    // Method to display assigned seats
    public void showAssignedSeats(boolean bySeatId) {
        System.out.println("The seat assignments are as follow:");
        
        if (bySeatId) {
            // Display by seat ID (natural order)
            for (int i = 0; i < 12; i++) {
                if (seat[i].isOccupied()) {
                    System.out.println("SeatID " + seat[i].getSeatID() + 
                                     " assigned to CustomerID " + seat[i].getCustomerID() + ".");
                }
            }
        } else {
            // Display by customer ID (sorted order)
            PlaneSeat[] sortedSeats = sortSeats();
            for (int i = 0; i < 12; i++) {
                if (sortedSeats[i].isOccupied()) {
                    System.out.println("SeatID " + sortedSeats[i].getSeatID() + 
                                     " assigned to CustomerID " + sortedSeats[i].getCustomerID() + ".");
                }
            }
        }
    }
    
    // Method that assigns a customer ID to an empty seat
    public void assignSeat(int seatId, int cust_id) {
        // Find the seat with the given seatId
        for (int i = 0; i < 12; i++) {
            if (seat[i].getSeatID() == seatId) {
                if (seat[i].isOccupied()) {
                    System.out.println("Seat already assigned to a customer.");
                } else {
                    seat[i].assign(cust_id);
                    numEmptySeat--;
                    System.out.println("Seat Assigned!");
                }
                return;
            }
        }
        System.out.println("Invalid seat ID.");
    }
    
    // Method that unassigns a seat
    public void unAssignSeat(int seatId) {
        // Find the seat with the given seatId
        for (int i = 0; i < 12; i++) {
            if (seat[i].getSeatID() == seatId) {
                if (seat[i].isOccupied()) {
                    seat[i].unAssign();
                    numEmptySeat++;
                    System.out.println("Seat Unassigned!");
                } else {
                    System.out.println("Seat is not assigned to any customer.");
                }
                return;
            }
        }
        System.out.println("Invalid seat ID.");
    }
}