
public class Elevator {
	
	private int currFloor;
	private int numTrips;
	private int floorsPassed;
	private String direction;
	//change to enum time permitting
	private static final String UP = "up";
	private static final String DOWN = "down";
	private static final String PAUSED = "paused";
	private String name;
	
	public Elevator(int elNumber){
		this.currFloor=1;
		this.numTrips=0;
		this.floorsPassed=0;
		this.name = "Elevator " + elNumber;
				
	}
	
	public void moveFloor(int destination){
		
		if(currFloor > destination){
			direction = DOWN;
			moveDown(destination);
		}
		if(currFloor < destination){
			direction = UP;
			moveUp(destination);
		}
		if(currFloor == destination){
			//somone on this floor wants to 
			//take elevator to the same floor
			System.out.println(name + ": Opening Doors.");
		}		
	}
	
	public void moveDown(int dest){
		closeDoors();
		while(currFloor != dest){
			currFloor--;
			System.out.println(name + " at floor: " + currFloor);
			floorsPassed++;
		}
		numTrips++;
		//no longer moving, set to paused
		direction= PAUSED;
	}
	public void moveUp(int dest){
		//notify that we closed the doors
		closeDoors();
		while(currFloor != dest){
			currFloor++;
			System.out.println(name + " at floor: " + currFloor);
			floorsPassed++;
		}
		numTrips++;
		direction= PAUSED;
	}
	
	private void closeDoors(){
		System.out.println(name + " Closing Doors");
	}
	
	public String getDirection() {
		return direction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
