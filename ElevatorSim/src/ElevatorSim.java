


public class ElevatorSim {

	public static void main(String[] args) {
		
		//Todo exception handling 
		if(args.length !=2){
			System.out.println("2 args expected, found "+ args.length);
			System.out.println("correct usage is arg[0]: floors, arg[1]:elevators. Ex: '4 3' ");
		}
		ElevatorController controller = new ElevatorController(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		

	}

}
