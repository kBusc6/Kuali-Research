import java.util.ArrayList;

public class ElevatorController {

	private int floors;
	private ArrayList<Elevator> elevators;
	private ArrayList<Elevator> needMaintenance;
	
	
	public ElevatorController(int floors , int numElevators){
		this.floors = floors;
		createElevators(numElevators);
	}
	
	private void createElevators(int numElev){
		elevators = new ArrayList<Elevator>();
		needMaintenance = new ArrayList<Elevator>();
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
				return;
			}
		}
		//check if the elevator is in transit 
		//and check if it will pass the start floor
		//on its way to its current destination
		for(Elevator e : elevators){
			if(e.getDirection() != Direction.PAUSED){
				if(e.getDirection() == Direction.UP){
					if(e.getCurrFloor() <= start){
						e.setDirection(Direction.PAUSED);
						chosenOne=e;
						chosenOne.moveFloor(start,dest);
						checkForMaintenance(chosenOne);
						return;
					}
				}
				else if(e.getDirection() == Direction.DOWN){
					if(e.getCurrFloor() >= start){
						e.setDirection(Direction.PAUSED);
						chosenOne=e;
						chosenOne.moveFloor(start,dest);
						checkForMaintenance(chosenOne);
						return;
					}
				}
			}
		}
		chosenOne = findNearestElevator(start);
		checkForMaintenance(chosenOne);

	}
	
	public Elevator findNearestElevator(int start){
		Elevator chosenOne = new Elevator();
		int maxVal =0;
		int currDist;
		for(Elevator e : elevators){
			currDist = Math.abs(e.getCurrFloor() - start);
			if( currDist > maxVal){
				chosenOne = e;
				maxVal =currDist;
			}
		}

		return chosenOne;
	}
	
	private void checkForMaintenance(Elevator chosenOne){
		//it should never be greater than 100
		//but on the if it some goes above we want to make sure
		//it wont stay in service forever so no == 100
		if(chosenOne.getNumTrips() >= 100){
			elevators.remove(chosenOne);
			needMaintenance.add(chosenOne);
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
