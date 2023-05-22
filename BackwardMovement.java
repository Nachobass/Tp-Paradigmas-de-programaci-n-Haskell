package marsRover;

public class BackwardMovement extends Commands {

	
	@Override
	public void move(Coordinate marsPosition) {
		marsPosition.getOrientation().moveBackward(marsPosition);
	}

}
