package stack;

public class ComponenteNoVacio extends ComponenteBasico {
	
	
	@Override
	public Object pop (OOStack ooStack) {

        return ooStack.isEmpty() ?  ooStack.topYPopExplosivos() : ooStack.popBasico();        
	}
	
	
	@Override
	public Object top (OOStack ooStack) {
		
		return ooStack.topBasico();
	}
}