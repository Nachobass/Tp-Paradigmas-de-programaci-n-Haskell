package marsRover;

public class NorthOrientation extends Orientation {

	
	@Override
	public void moveForward( Coordinate marsPosition ) {
		marsPosition = new Coordinate( marsPosition.getEjeX(), marsPosition.addEjeY(),marsPosition.getOrientation() );
	}
	
	
	@Override
	public void moveBackward( Coordinate marsPosition ) {
		marsPosition = new Coordinate( marsPosition.getEjeX(), marsPosition.subtractEjeY(),marsPosition.getOrientation() );
	}
	
	
	@Override
	public void turnRight ( Coordinate marsPosition ) {
		marsPosition.ModifyPoint( new EastOrientation() );
	}
	
	
	@Override
	public void turnLeft ( Coordinate marsPosition ) {
		marsPosition.ModifyPoint( new WestOrientation() );
	}
	
	
	@Override
	public String toString() {
		return "N";
	}	
	
	
	@Override
	public boolean isHeadingNorth() {
		return true;
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
		return false;
	}
	
}
