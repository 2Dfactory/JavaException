package com.test.exception;

public class NombreHabitantException extends Exception {

	public NombreHabitantException() {

		System.out.println("Vous essayez d'instancier une classe Ville avec un nombre négatif d'habitants!");
		
	}

}
