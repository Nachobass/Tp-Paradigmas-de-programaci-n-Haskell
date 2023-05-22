package marsRover;

import java.util.HashMap;
import java.util.Map;

public abstract class Commands {

	
	public abstract void move(Coordinate marsPosition);

	
	public static Commands createTheMovement(String command) {
		Map<String, Commands> commandMap = new HashMap<>();
	    commandMap.put("f", new ForwardMovement());
	    commandMap.put("b", new BackwardMovement());
	    commandMap.put("r", new TurnRightMovement());
	    commandMap.put("l", new TurnLeftMovement());

	    return commandMap.getOrDefault(command, new InvalidCommand());
	}
	
}
