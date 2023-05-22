package marsRover;

public abstract class Orientation {

	public abstract void moveForward( Coordinate marsPosition );
	public abstract void moveBackward( Coordinate marsPosition );
	public abstract void turnRight ( Coordinate marsPosition );
	public abstract void turnLeft ( Coordinate marsPosition );
	public abstract boolean isHeadingNorth();
	public abstract boolean isHeadingSouth();
	public abstract boolean isHeadingEast();
	public abstract boolean isHeadingWest();
}
