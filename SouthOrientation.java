package marsRover;

public class SouthOrientation extends Orientation {

	@Override
	public void moveForward( Coordinate marsPosition ) {
		marsPosition = new Coordinate( marsPosition.getEjeX(), marsPosition.subtractEjeY(),marsPosition.getOrientation() );
	}

	
	@Override
	public void moveBackward( Coordinate marsPosition ) {
		marsPosition = new Coordinate( marsPosition.getEjeX(), marsPosition.addEjeY(),marsPosition.getOrientation() );
	}

	
	@Override
	public void turnRight( Coordinate marsPosition ) {
		marsPosition.ModifyPoint( new WestOrientation() );
	}

	
	@Override
	public void turnLeft( Coordinate marsPosition ) {
		marsPosition.ModifyPoint( new EastOrientation() );
	}
	
	
	@Override
	public String toString() {
		return "S";
	}	
	
	
	@Override
	public boolean isHeadingNorth() {
		return false;
	}

	
	@Override
	public boolean isHeadingSouth() {
		return true;
	}
	
	
	@Override
	public boolean isHeadingEast(){
		return false;
	}
	
	
	@Override
	public boolean isHeadingWest(){
		return false;
	}

}
