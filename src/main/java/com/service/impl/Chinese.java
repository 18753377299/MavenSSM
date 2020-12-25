package com.service.impl;

import com.service.facade.Axe;
import com.service.facade.Person;

public class Chinese implements Person {
	
	private Axe axe;
	
	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	public void useAxe() {
		// TODO Auto-generated method stub
		System.out.println(axe.chop());
	}

}
