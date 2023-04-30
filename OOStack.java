package stack;

import java.util.ArrayList;
import java.util.List;

public class OOStack {
	static public String stackEmptyErrorDescription = "Stack is empty";
	
	private List stack = new ArrayList ();
	
	private ComponenteBasico cosa = new ComponenteVacio();

	
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	
	public OOStack push(String string) {
		this.stack.add(string);
        this.cosa = new ComponenteNoVacio();
		return this;
	}

	
	public Object pop() {
		return cosa.pop( this );
	}

	
	public Object top() {
		return cosa.top( this );
	}

	
	public int size() {
		return (stack.size());
	}


	public Object topYPopExplosivos() throws Error {
		throw new Error(stackEmptyErrorDescription) ;
	}
	
	
	public Object topBasico() {
		return this.stack.get( this.stack.size()-1 );
	}
	
	
	public Object popBasico() {
		return this.stack.remove( stack.size()-1 );
	}
	
	
}