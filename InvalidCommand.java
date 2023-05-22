package marsRover;

public class InvalidCommand extends Commands {
	
	
	public static final String NonValidCommand = "Non valid command";
	
	
	@Override
	public void move( Coordinate marsPosition ) {
		throw new RuntimeException(NonValidCommand);
	}
	
}
