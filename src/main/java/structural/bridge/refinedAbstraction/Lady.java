package structural.bridge.refinedAbstraction;

import structural.bridge.abstraction.Person;
import structural.bridge.implementor.Clothing;

public class Lady extends Person {

	public Lady() {
		setType("女人");
	}

	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressCloth(this);
	}

}
