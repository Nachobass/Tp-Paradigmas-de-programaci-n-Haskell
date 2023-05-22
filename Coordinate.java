package marsRover;

import java.util.Objects;

public class Coordinate {
	
	
	int ejeY = 0;
	int ejeX = 0;
	Orientation currentOrientation;

	
	public Coordinate(int x, int y, Orientation newOrientation) {
		this.ejeX = x;
		this.ejeY = y;
		this.currentOrientation = newOrientation;
	}
	
	
	public void ModifyPoint (Commands command) {
		command.move(this);
	}
	
	
	public void ModifyPoint (Orientation newOrientation) {
		this.currentOrientation = newOrientation;
	}
	
	
	public int addEjeX() {
		return this.ejeX++;
	}
	
	
	public int subtractEjeX() {
		return this.ejeX--;
	}
	
	
	public int addEjeY() {
		return this.ejeY++;
	}
	
	
	public int subtractEjeY() {
		return this.ejeY--;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ejeX, ejeY, currentOrientation);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		return ejeX == other.ejeX && ejeY == other.ejeY
				&& Objects.equals(currentOrientation.toString(), other.currentOrientation.toString());
	}
	
	
	
// accesors
	
	public Orientation getOrientation() {
		return this.currentOrientation;
	}
	
	
	public int getEjeX() {
		return this.ejeX;
	}
	
	
	public int getEjeY() {
		return this.ejeY;
	}
	
}
