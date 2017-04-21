import java.util.ArrayList;

public class ElevatorController {

	private int floors;
	private ArrayList<Elevator> elevators; 
	
	public ElevatorController(int floors , int numElevators){
		this.floors = floors;
		
	}
	
	private void createElevators(int numElev){
		for(int i=0; i<numElev; i++){
			
		}
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
