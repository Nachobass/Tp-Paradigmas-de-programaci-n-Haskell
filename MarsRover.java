package marsRover;

import java.util.function.BooleanSupplier;

public class MarsRover {

	private Point position;

	
	public MarsRover(Point initialPosition) {
		position = initialPosition;
	}

	
	public Point getPosition() {
		return position;
	}

	
	public boolean isHeadingNorth() {
		if(position.getOrientation() == "N") {
			return true;
		}
		return false;
	}


	public boolean isHeadingSouth() {
		if(position.getOrientation() == "S") {
			return true;
		}
		return false;
	}
	
	
	public boolean isHeadingEast() {
		if(position.getOrientation() == "E") {
			return true;
		}
		return false;
	}
	
	
	public boolean isHeadingWest() {
		if(position.getOrientation() == "W") {
			return true;
		}
		return false;
	}
	
	
	public void move(String string) {
		for (int i = 0; i < string.length(); i++) {
		    char c = string.charAt(i);
		    String command = String.valueOf(c);
			position.ModifyPoint(command);
		}
	}

}






