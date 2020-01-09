package exo1;

import java.util.function.Supplier;

interface Defaulable {
	default String notRequired() {
		return "R�sultat par d�faut de not required !";
	}
}

class DefaulableImpl implements Defaulable {
}

class OverrideImpl implements Defaulable {
	@Override
	public String notRequired() {
		return "R�sultat de l'impl�mentation";
	}
}

interface DefaulableFactory {
	public static Defaulable create(Supplier<Defaulable> constucteur) {
		return constucteur.get();		
	}
}

public class Etape4 {

	public static void main(String[] args) {
		Defaulable defaulable = DefaulableFactory.create(DefaulableImpl::new);
		Defaulable defaulableOverride = DefaulableFactory.create(() -> new OverrideImpl());
		
		System.out.println(defaulable.notRequired());
		System.out.println(defaulableOverride.notRequired());

	}

}
