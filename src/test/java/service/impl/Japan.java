package service.impl;

import service.facade.Axe;
import service.facade.Person;

public class Japan implements Person{

	private Axe axe;
	
	public  Japan(Axe axe) {
		this.axe= axe;
	}
	
	@Override
	public void useAxe() {
		// TODO Auto-generated method stub
		System.out.println(axe.chop());
	}

}
