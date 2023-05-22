package marsRover;

public class TurnLeftMovement extends Commands {


	@Override
	public void move( Coordinate marsPosition ) {
		marsPosition.getOrientation().turnLeft( marsPosition );
	}

}
