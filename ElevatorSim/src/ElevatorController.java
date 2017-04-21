import java.util.ArrayList;

public class ElevatorController {

	private int floors;
	private ArrayList<Elevator> elevators;
	
	
	public ElevatorController(int floors , int numElevators){
		this.floors = floors;
		
	}
	
	private void createElevators(int numElev){
		elevators = new ArrayList<Elevator>();
		for(int i=0; i<numElev; i++){
			elevators.add(new Elevator(i));
		}
	}
	
	public void requestElevator(int start,int dest){
		//verify the request is valid
		Elevator chosenOne;
		if(dest > floors || dest < 1){
			System.out.println("Invalid destination. Min floor is 1, Max floor is " +floors);
			return;
		}
		if( start > floors || start < 1){
			System.out.println("Invalid start. Min floor is 1, Max floor is " +floors);
			return;
		}
		//check if an elevator is on this floor
		for(Elevator e : elevators){
			if(e.getCurrFloor() == start){
				chosenOne=e;
				chosenOne.moveFloor(start,dest);
			}
		}
		for(Elevator e : elevators){
			if(e.getDirection() != Direction.PAUSED){
				//if()
			}
		}
		// return e;
		
		//findNearest()

	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public ArrayList<Elevator> getElevators() {
		return elevators;
	}

	public void setElevators(ArrayList<Elevator> elevators) {
		this.elevators = elevators;
	}
	
	
}
