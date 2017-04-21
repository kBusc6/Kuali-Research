
public class Elevator {
	
	private int currFloor;
	private int numTrips;
	private int floorsPassed;
	private String direction;
	private static final String UP = "up";
	private static final String DOWN = "down";
	
	public Elevator(){
		this.currFloor=1;
		this.numTrips=0;
		this.floorsPassed=0;
	}
	
	

	public int getCurrFloor() {
		return currFloor;
	}

	public void setCurrFloor(int currFloor) {
		this.currFloor = currFloor;
	}

	public int getNumTrips() {
		return numTrips;
	}

	public void setNumTrips(int numTrips) {
		this.numTrips = numTrips;
	}

	public int getFloorsPassed() {
		return floorsPassed;
	}

	public void setFloorsPassed(int floorsPassed) {
		this.floorsPassed = floorsPassed;
	}

	
	
}
