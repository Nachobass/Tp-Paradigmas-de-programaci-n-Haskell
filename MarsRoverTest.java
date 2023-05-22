package marsRover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class MarsRoverTest {

	
	@Test public void test00initialPositionOfRoverIsCorrectAndIsHeadingNorth() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		
		assertEquals ( initialPositionAtOneOneNorth(), rover.getPosition() );
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingNorth() );
	}
	
	
	@Test public void test01initialPositionOfRoverIsCorrectAndIsHeadingSouth() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneSouth() ); 
		
		assertEquals ( initialPositionAtOneOneSouth(), rover.getPosition() );	
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingSouth() );
	}
	
	
	@Test public void test02initialPositionOfRoverIsCorrectAndIsHeadingEast() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneEast() ); 
		
		assertEquals ( initialPositionAtOneOneEast(), rover.getPosition() );	
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingEast() );
	}
	
	
	@Test public void test03initialPositionOfRoverIsCorrectAndIsHeadingWest() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneWest() ); 
		
		assertEquals ( initialPositionAtOneOneWest(), rover.getPosition() );	
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingWest() );
	}
	
	
	@Test public void test04doesNotModifyThePositionIfItIsNotFBRL() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() ); 
		
		rover.move("");
		
		assertEquals ( initialPositionAtOneOneNorth(), rover.getPosition() );
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingNorth() );
	}

	
	@Test public void test05roverBackwardHeadingNorth() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		Coordinate newPosition = new Coordinate(1,0,new NorthOrientation()); 
		
		rover.move("b");
				
		assertEquals ( newPosition, rover.getPosition() );
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingNorth() );
	}
	
	
	@Test public void test06roverBackwardHeadingSouth() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneSouth() );
		Coordinate newPosition = new Coordinate( 1, 2, new SouthOrientation() ); 
		
		rover.move("b");
		
		assertEquals ( newPosition, rover.getPosition() );
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingSouth() );
	}
	
	
	@Test public void test07roverBackwardHeadingEast() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneEast() );
		Coordinate newPosition = new Coordinate( 0, 1, new EastOrientation() ); 
		
		rover.move("b");
		
		assertEquals ( newPosition, rover.getPosition() );
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingEast() );
	}
	
	
	@Test public void test08roverBackwardHeadingWest() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneWest() );
		Coordinate newPosition = new Coordinate( 2, 1, new WestOrientation() ); 
		
		rover.move("b");
		
		assertEquals ( newPosition, rover.getPosition() );
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingWest() );
	}
	
	
	@Test public void test09roverForwardHeadingNorth() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		Coordinate newPosition = new Coordinate( 1, 2, new NorthOrientation() ); 
		
		rover.move("f");
		
		assertEquals ( newPosition, rover.getPosition() );
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingNorth() );
	}
	
	
	@Test public void test10roverForwardHeadingSouth() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneSouth() );
		Coordinate newPosition = new Coordinate( 1, 0, new SouthOrientation() ); 
		
		rover.move("f");
		
		assertEquals ( newPosition, rover.getPosition() );
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingSouth() );
	}
	
	
	@Test public void test11roverForwardHeadingEast() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneEast() );
		Coordinate newPosition = new Coordinate( 2, 1, new EastOrientation() ); 
		
		rover.move("f");
		
		assertEquals ( newPosition, rover.getPosition() );
				
		assertTrue ( rover.getPosition().getOrientation().isHeadingEast() );
	}
	
	
	@Test public void test12roverForwardHeadingWest() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneWest() );
		Coordinate newPosition = new Coordinate( 0, 1, new WestOrientation() ); 
		
		rover.move("f");
		
		assertEquals ( newPosition, rover.getPosition() );

		assertTrue ( rover.getPosition().getOrientation().isHeadingWest() );
	}
	
	
	@Test public void test13isHeadingEast() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		
		rover.move("r");

		assertTrue( rover.getPosition().getOrientation().isHeadingEast() );
	}
	
	
	@Test public void test14isHeadingSouth() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		
		rover.move("r");
		rover.move("r");
		
		assertTrue( rover.getPosition().getOrientation().isHeadingSouth() );
	}
	
	@Test public void test15isHeadingWest() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		
		rover.move("r");
		rover.move("r");
		rover.move("r");
		
		assertTrue( rover.getPosition().getOrientation().isHeadingWest() );
	}
	
	@Test public void test16isHeadingNorth() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		
		rover.move("r");
		rover.move("r");
		rover.move("r");
		rover.move("r");
		
		assertTrue( rover.getPosition().getOrientation().isHeadingNorth() );
	}
	
	@Test public void test17isHeadingNorthWithLeftRotating() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		
		assertTrue( rover.getPosition().getOrientation().isHeadingNorth() );

		rover.move("l");

		assertTrue( rover.getPosition().getOrientation().isHeadingWest() );
		
		rover.move("l");

		assertTrue( rover.getPosition().getOrientation().isHeadingSouth() );
		
		rover.move("l");

		assertTrue( rover.getPosition().getOrientation().isHeadingEast() );
		
		rover.move("l");

		assertTrue( rover.getPosition().getOrientation().isHeadingNorth() );
		
		rover.move("");
		
		assertTrue( rover.getPosition().getOrientation().isHeadingNorth() );
	}
	
	
	@Test public void test18isHeadingWestWithLeftRotating() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		
		assertTrue( rover.getPosition().getOrientation().isHeadingNorth() );

		rover.move("l");

		assertTrue( rover.getPosition().getOrientation().isHeadingWest() );
	}
	
	
	@Test public void test19isHeadingSouthWithLeftRotating() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		
		assertTrue( rover.getPosition().getOrientation().isHeadingNorth() );

		rover.move("l");
		rover.move("l");

		assertTrue( rover.getPosition().getOrientation().isHeadingSouth() );
	}
	
	
	@Test public void test20isHeadingEastWithLeftRotating() {
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		
		assertTrue( rover.getPosition().getOrientation().isHeadingNorth() );

		rover.move("l");
		rover.move("l");
		rover.move("l");

		assertTrue( rover.getPosition().getOrientation().isHeadingEast() );
	}
	
	
	@Test public void test21roverCanProcressManyInstructions(){
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		
		rover.move("rr");

		assertTrue( rover.getPosition().getOrientation().isHeadingSouth() );
	}
	
	
	@Test public void test22roverCanNotProcressNonExistentInstructions(){
		MarsRover rover = new MarsRover ( initialPositionAtOneOneNorth() );
		
		assertThrowsLike ( InvalidCommand.NonValidCommand, () -> rover.move("rrlrzfbr") );

		assertTrue( rover.getPosition().getOrientation().isHeadingSouth() );
	}
	
	
	
	
	
	
	public void assertThrowsLike( String msg, Executable codeToRun ) {
	    assertEquals( msg, assertThrows( Exception.class, codeToRun ).getMessage() );
	}
	
	
	private Coordinate initialPositionAtOneOneNorth() {
		return new Coordinate( 1, 1, new NorthOrientation() );
	}
	
	
	private Coordinate initialPositionAtOneOneSouth() {
		return new Coordinate( 1, 1, new SouthOrientation() );
	}
	
	
	private Coordinate initialPositionAtOneOneEast() {
		return new Coordinate( 1, 1, new EastOrientation() );
	}
	
	
	private Coordinate initialPositionAtOneOneWest() {
		return new Coordinate( 1, 1, new WestOrientation() );
	}
	

}













