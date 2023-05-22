package marsRover;

public class WestOrientation extends Orientation {
	
	
	@Override
	public void moveForward( Coordinate marsPosition ) {
		marsPosition = new Coordinate( marsPosition.subtractEjeX(), marsPosition.getEjeY(),marsPosition.getOrientation() );
	}

	
	@Override
	public void moveBackward( Coordinate marsPosition ) {
		marsPosition = new Coordinate( marsPosition.addEjeX(), marsPosition.getEjeY(),marsPosition.getOrientation() );
	}

	
	@Override
	public void turnRight( Coordinate marsPosition ) {
		marsPosition.ModifyPoint( new NorthOrientation() );
	}

	
	@Override
	public void turnLeft( Coordinate marsPosition ) {
		marsPosition.ModifyPoint( new SouthOrientation() );
	}
	
	
	@Override
	public String toString() {
		return "W";
	}	
	
	
	@Override
	public boolean isHeadingNorth() {
		return false;
	}

	
	@Override
	public boolean isHeadingSouth() {
		return false;
	}
	
	
	@Override
	public boolean isHeadingEast(){
		return false;
	}
	
	
	@Override
	public boolean isHeadingWest(){
		return true;
	}

}


