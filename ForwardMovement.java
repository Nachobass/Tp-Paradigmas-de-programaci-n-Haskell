package marsRover;


public class ForwardMovement extends Commands {
	
	
	@Override
	public void move( Coordinate marsPosition ) {
		marsPosition.getOrientation().moveForward( marsPosition );
	}
	
}