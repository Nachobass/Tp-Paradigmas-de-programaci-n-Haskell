package marsRover;

public class Point {
	
	int norteSur = 0;
	int esteOeste = 0;
	String orientation = "N";

	public Point(int x, int y, String orientacion) {
		this.esteOeste = x;
		this.norteSur = y;
//		x = esteOeste;
//		y = norteSur;
		this.orientation = orientacion;
	}
	
	
	public void ModifyPoint(String command) {
		if (command.equals("f")) {
			if(orientation == "N") {
				norteSur ++;
			}
			if(orientation == "S") {
				norteSur --;
			}
			if(orientation == "E") {
				esteOeste ++;
			}
			if(orientation == "W") {
				esteOeste --;
			}
		}
		
		if (command.equals("b")) {
			if(orientation == "N") {
				norteSur --;
			}
			if(orientation == "S") {
				norteSur ++;
			}
			if(orientation == "E") {
				esteOeste --;
			}
			if(orientation == "W") {
				esteOeste ++;
			}
		}
		
		if (command.equals("l")) {
			if (orientation == "N") {
				orientation = "W";
			}
			else if (orientation == "W") {
				orientation = "S";
			}
			else if (orientation == "S") {
				orientation = "E";
			}
			else if (orientation == "E") {
				orientation = "N";
			}

		}
		
		if (command.equals("r")) {
			if (orientation.equals ("N")) {
				orientation = "E";
			}
			else if (orientation.equals("E")) {
				orientation = "S";
			}
			else if (orientation.equals("S")) {
				orientation = "W";
			}
			else if (orientation.equals("W")) {
				orientation = "N";
			}

		}
		
	}
	
	public String getOrientation() {
		return orientation;
	}
	
	
	public boolean equals(Point other) {
	    return this.norteSur == other.norteSur &&
	           this.esteOeste == other.esteOeste &&
	           this.orientation.equals(other.orientation);
	}

	
	


}



