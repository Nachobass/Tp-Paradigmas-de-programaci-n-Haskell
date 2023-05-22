package marsRover;

public class TurnRightMovement extends Commands {

	
	@Override
	public void move( Coordinate marsPosition ) {
		marsPosition.getOrientation().turnRight( marsPosition );
	}
	
}
