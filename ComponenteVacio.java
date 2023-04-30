package stack;

public class ComponenteVacio extends ComponenteBasico {


	@Override
	public Object pop (OOStack ooStack) {
		
		return ooStack.topYPopExplosivos();
	}
	
	
	@Override
	public Object top (OOStack ooStack) {
		
		return ooStack.topYPopExplosivos();
	}
}