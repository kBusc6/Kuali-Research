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
	
	public Elevator requestElevator(int floor){
		//check if an elevator is on this floor
		for(Elevator e : elevators){
			if(e.getCurrFloor() == floor){
				return e;
			}
		}
		//if(elevator in transit will pass)
		// return e;
		
		//findNearest()
		return 
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
