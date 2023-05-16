package marsRover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MarsRoverTest {

	
	@Test public void test00initialPositionOfRoverIsCorrectAndIsHeadingNorth() {
		Point initialPosition = new Point(1,1,"N"); //Tengo que tener una posicion inicial.
		MarsRover rover = new MarsRover (initialPosition); //El rover debe estar ubicado en la posición inicial.
		
//		assertEquals ( initialPosition, rover.getPosition() ); //assert que el rover esté ubicado en la posicion inicial.
		
		assertTrue ( rover.getPosition().equals(initialPosition) );
		
		assertTrue ( rover.isHeadingNorth() );//assert está apuntando al norte.
		
	}
	
	
	@Test public void test01initialPositionOfRoverIsCorrectAndIsHeadingSouth() {
		Point initialPosition = new Point(1,1,"S"); 
		MarsRover rover = new MarsRover (initialPosition); 
		
//		assertEquals ( initialPosition, rover.getPosition() );	
		
		assertTrue ( rover.getPosition().equals(initialPosition) );
		
		assertTrue ( rover.isHeadingSouth() );
		
	}
	
	
	@Test public void test02initialPositionOfRoverIsCorrectAndIsHeadingEast() {
		Point initialPosition = new Point(1,1,"E"); 
		MarsRover rover = new MarsRover (initialPosition); 
		
//		assertEquals ( initialPosition, rover.getPosition() );	
		
		assertTrue ( rover.getPosition().equals(initialPosition) );
		
		assertTrue ( rover.isHeadingEast() );
		
	}
	
	
	@Test public void test03initialPositionOfRoverIsCorrectAndIsHeadingWest() {
		Point initialPosition = new Point(1,1,"W"); 
		MarsRover rover = new MarsRover (initialPosition); 
		
//		assertEquals ( initialPosition, rover.getPosition() );	
		
		assertTrue ( rover.getPosition().equals(initialPosition) );
		
		assertTrue ( rover.isHeadingWest() );
		
	}
	
	
	@Test public void test04doesNotModifyThePositionIfItIsNotNSEW() {
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition); 
		
		rover.move("");
		
//		assertEquals ( initialPosition, rover.getPosition() );
		
		assertTrue ( rover.getPosition().equals(initialPosition) );
		
		assertTrue ( rover.isHeadingNorth() );
		
	}

	
	@Test public void test05roverBackwardHeadingNorth() {
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition);
		Point newPosition = new Point(1,0,"N"); 
		
		rover.move("b");
		
//		assertFalse ( rover.getPosition().equals(initialPosition) );
		
		assertTrue( rover.getPosition().equals(newPosition) );
				
		assertTrue ( rover.isHeadingNorth() );
	}
	
	
	@Test public void test06roverBackwardHeadingSouth() {
		Point initialPosition = new Point(1,1,"S"); 
		MarsRover rover = new MarsRover (initialPosition);
		Point newPosition = new Point(1,2,"S"); 
		
		rover.move("b");
		
//		assertFalse ( rover.getPosition().equals(initialPosition) );
		
		assertTrue( rover.getPosition().equals(newPosition) );
				
		assertTrue ( rover.isHeadingSouth() );
	}
	
	
	@Test public void test07roverBackwardHeadingEast() {
		Point initialPosition = new Point(1,1,"E"); 
		MarsRover rover = new MarsRover (initialPosition);
		Point newPosition = new Point(0,1,"E"); 
		
		rover.move("b");
		
//		assertFalse ( rover.getPosition().equals(initialPosition) );
		
		assertTrue( rover.getPosition().equals(newPosition) );
				
		assertTrue ( rover.isHeadingEast() );
	}
	
	
	@Test public void test08roverBackwardHeadingWest() {
		Point initialPosition = new Point(1,1,"W"); 
		MarsRover rover = new MarsRover (initialPosition);
		Point newPosition = new Point(2,1,"W"); 
		
		rover.move("b");
		
//		assertFalse ( rover.getPosition().equals(initialPosition) );
		
		assertTrue( rover.getPosition().equals(newPosition) );
				
		assertTrue ( rover.isHeadingWest() );
	}
	
	
	@Test public void test09roverForwardHeadingNorth() {
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition);
		Point newPosition = new Point(1,2,"N"); 
		
		rover.move("f");
		
//		assertFalse ( rover.getPosition().equals(initialPosition) );
		
		assertTrue( rover.getPosition().equals(newPosition) );
				
		assertTrue ( rover.isHeadingNorth() );
	}
	
	
	@Test public void test10roverForwardHeadingSouth() {
		Point initialPosition = new Point(1,1,"S"); 
		MarsRover rover = new MarsRover (initialPosition);
		Point newPosition = new Point(1,0,"S"); 
		
		rover.move("f");
		
//		assertFalse ( rover.getPosition().equals(initialPosition) );
		
		assertTrue( rover.getPosition().equals(newPosition) );
				
		assertTrue ( rover.isHeadingSouth() );
	}
	
	
	@Test public void test11roverForwardHeadingEast() {
		Point initialPosition = new Point(1,1,"E"); 
		MarsRover rover = new MarsRover (initialPosition);
		Point newPosition = new Point(2,1,"E"); 
		
		rover.move("f");
		
//		assertFalse ( rover.getPosition().equals(initialPosition) );
		
		assertTrue( rover.getPosition().equals(newPosition) );
				
		assertTrue ( rover.isHeadingEast() );
	}
	
	
	@Test public void test12roverForwardHeadingWest() {
		Point initialPosition = new Point(1,1,"W"); 
		MarsRover rover = new MarsRover (initialPosition);
		Point newPosition = new Point(0,1,"W"); 
		
		rover.move("f");
		
//		assertFalse ( rover.getPosition().equals(initialPosition) );
		
		assertTrue( rover.getPosition().equals(newPosition) );
				
		assertTrue ( rover.isHeadingWest() );
	}
	
	
//	@Test public void test13isHeadingSouth() {
//		Point initialPosition = new Point(1,1,"N"); 
//		MarsRover rover = new MarsRover (initialPosition); 
//		
//		rover.move("r");
//		rover.move("r");
//		
////		assertEquals ( initialPosition, rover.getPosition() ); 
//		
//		assertTrue ( rover.getPosition().equals(initialPosition) );
//		
//		assertFalse ( rover.isHeadingNorth() );
//		assertTrue ( rover.isHeadingSouth() );
//		
//	}
	
	
	@Test public void test14isHeadingEast() {
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition);
		rover.move("r");
		assertTrue(rover.isHeadingEast());
	}
	
	
	@Test public void test15isHeadingSouth() {
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition);
		rover.move("r");
		rover.move("r");
		assertTrue(rover.isHeadingSouth());
	}
	
	@Test public void test16isHeadingWest() {
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition);
		rover.move("r");
		rover.move("r");
		rover.move("r");
		assertTrue(rover.isHeadingWest());
	}
	
	@Test public void test17isHeadingNorth() {
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition);
		rover.move("r");
		rover.move("r");
		rover.move("r");
		rover.move("r");
		assertTrue(rover.isHeadingNorth());
	}
	
	@Test public void test18isHeadingNorthWithLeftRotating() {
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition);
		
		assertEquals("N", rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingNorth());

		rover.move("l");
		assertEquals("W",rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingWest());
		
		rover.move("l");
		assertEquals("S",rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingSouth());
		
		rover.move("l");
		assertEquals("E", rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingEast());
		
		rover.move("l");
		assertEquals("N", rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingNorth());
		
		rover.move("");
		assertTrue(rover.isHeadingNorth());
		
	}
	
	
	@Test public void test19isHeadingWestWithLeftRotating() {
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition);
		
		assertEquals("N", rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingNorth());

		rover.move("l");
		assertEquals("W",rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingWest());
		
	}
	
	
	@Test public void test20isHeadingSouthWithLeftRotating() {
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition);
		
		assertEquals("N", rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingNorth());

		rover.move("l");
		rover.move("l");
		assertEquals("S",rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingSouth());
		
	}
	
	
	@Test public void test21isHeadingEastWithLeftRotating() {
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition);
		
		assertEquals("N", rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingNorth());

		rover.move("l");
		rover.move("l");
		rover.move("l");
		assertEquals("E", rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingEast());
		
	}
	
	
	@Test public void test22roverCanProcressManyInstructions(){
		Point initialPosition = new Point(1,1,"N"); 
		MarsRover rover = new MarsRover (initialPosition);
		rover.move("rr");
		assertEquals("S", rover.getPosition().getOrientation());
		assertTrue(rover.isHeadingSouth());
	}
	

}
