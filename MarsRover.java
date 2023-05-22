package marsRover;

public class MarsRover {
	

	private Coordinate position;

	
	public MarsRover(Coordinate initialPosition) {
		position = initialPosition;
	}
	

	public void move(String string) {
		for (int i = 0; i < string.length(); i++) {
		    char c = string.charAt(i);
		    String command = String.valueOf(c);
		    
		    Commands movement = Commands.createTheMovement(command);

		    position.ModifyPoint(movement);
		}
	}
	
	
	public Coordinate getPosition() {
		return position;
	}

}