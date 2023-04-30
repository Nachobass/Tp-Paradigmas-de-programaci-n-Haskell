package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class OOStackTest {

  private static final String something = "Something";

  
  @Test public void test01StackShouldBeEmptyWhenCreated() {
	  
    assertTrue( new OOStack().isEmpty() );
    
  }

  
  @Test public void test02PushAddElementsToTheStack() {
	  
    assertFalse( new OOStack().push( something ).isEmpty() );
    
  }

  
  @Test public void test03PopRemovesElementsFromTheStack() {
	  
    assertTrue( stackPushedAndPoped (something).isEmpty() );
    
  }

  
  @Test public void test04PopReturnsLastPushedObject() {
	  
    assertEquals( stackPushed(something).pop(), something );
    
  }
  
  
  @Test public void test05StackBehavesLIFO() {
    String firstPushedObject = "First";
    String secondPushedObject = "Second";

    OOStack stack = stackDoublePushed(firstPushedObject,secondPushedObject);

    assertEquals( stack.pop(), secondPushedObject );
    assertEquals( stack.pop(), firstPushedObject );
    assertTrue( stack.isEmpty() );
  }

  
  @Test public void test06TopReturnsLastPushedObject() {
	  
    assertEquals( new OOStack().push( something ).top(), something );
    
  }

  
  @Test public void test07TopDoesNotRemoveObjectFromStack() {
	OOStack stack = stackPushed(something);

    assertEquals( stack.size(), 1 );
    stack.top();
    assertEquals( stack.size(), 1 );
    
  }

  
  @Test public void test08CanNotPopWhenThereAreNoObjectsInTheStack() {
	  
    assertThrowsLike( OOStack.stackEmptyErrorDescription, () -> new OOStack().pop() );

  }

  
  @Test public void test09CanNotPopWhenThereAreNoObjectsInTheStackAndTheStackHadObjects() {
	  
    assertThrowsLike( OOStack.stackEmptyErrorDescription, () -> stackPushedAndPoped (something).pop() );

  }

  
  @Test public void test10CanNotTopWhenThereAreNoObjectsInTheStack() {
	  
    assertThrowsLike( OOStack.stackEmptyErrorDescription, () -> new OOStack().top() );

  }
  
  
  
  public void assertThrowsLike( String msg, Executable codeToRun ) {
	  
	    assertEquals( msg, assertThrows( Error.class, codeToRun ).getMessage() );
	    
  }
  
  
  private OOStack stackPushed(String string) {
		OOStack stack = new OOStack();
		stack.push( string );
		return stack;
  }
  
  
  private OOStack stackDoublePushed(String firstString, String secondString) {
		OOStack stack = new OOStack();
		stack.push( firstString );
		stack.push( secondString );
		return stack;
  }
  
  
  private OOStack stackPushedAndPoped(String string) {
		OOStack stack = stackPushed(string);
		stack.pop();
		return stack;
  }

  
  
}