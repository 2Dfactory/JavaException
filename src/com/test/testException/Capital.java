package com.test.testException;

import com.test.exception.NombreHabitantException;

public class Capital extends Ville {

	private boolean capitale = false;
	
	public Capital() {
	}

	public Capital(String pNom, int pNbre, String pPays, boolean pCapitale) throws NombreHabitantException {
		super(pNom, pNbre, pPays);
		this.capitale = pCapitale;
	}
	
	public String decrisToi() {
		
		String str = "";
		if(capitale) str = "\n" + this.nomVille + " est une capitale"; 
		
		return decrisToi() + str;
	}

}
