
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
	
	
	/**
	 * @param start the floor to get passengers from
	 * @param dest destination
	 * 
	 */
	public void moveFloor(int start,int dest){
				
		moveFloor(start);
		moveFloor(dest);				
		numTrips++;
		direction= PAUSED;
	}
	
	private void moveFloor(int floor){
		if(currFloor > floor){
			direction = DOWN;
			moveDown(floor);
		}
		else if(currFloor < floor){
			direction = UP;
			moveUp(floor);
		}
	}
	
	public void moveDown(int dest){
		openDoors();
		closeDoors();
		while(currFloor != dest){
			currFloor--;
			System.out.println(name + " at floor: " + currFloor);
			floorsPassed++;
		}

	}
	public void moveUp(int dest){
		//notify that we open the doors
		openDoors();
		closeDoors();
		while(currFloor != dest){
			currFloor++;
			System.out.println(name + " at floor: " + currFloor);
			floorsPassed++;
		}		
	}
	
	private void closeDoors(){
		System.out.println(name + " Closing Doors");
	}
	private void openDoors(){
		System.out.println(name + " Opening Doors");
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
