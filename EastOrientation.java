package marsRover;

public class EastOrientation extends Orientation {
	
	
	@Override
	public void moveForward( Coordinate marsPosition ) {
		marsPosition = new Coordinate( marsPosition.addEjeX(), marsPosition.getEjeY(),marsPosition.getOrientation() );
	}

	
	@Override
	public void moveBackward( Coordinate marsPosition ) {
		marsPosition = new Coordinate( marsPosition.subtractEjeX(), marsPosition.getEjeY(),marsPosition.getOrientation() );
	}

	
	@Override
	public void turnRight( Coordinate marsPosition ) {
		marsPosition.ModifyPoint( new SouthOrientation() );
	}

	
	@Override
	public void turnLeft( Coordinate marsPosition ) {
		marsPosition.ModifyPoint( new NorthOrientation() );
	}
	
	
	@Override
	public String toString() {
		return "E";
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
		return true;
	}
	
	
	@Override
	public boolean isHeadingWest(){
		return false;
	}

}

