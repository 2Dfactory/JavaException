package com.test.testException;

import com.test.exception.NombreHabitantException;

public class Ville {
	
	//Variables publiques qui comptent les instances
	  public static int nbreInstances = 0;

	  //Variable privée qui comptera aussi les instances
	  private static int nbreInstancesBis = 0;        
	  
	  protected String nomVille = "";
	  protected String nomPays = "";
	  protected int nbreHabitant = 0;
	  protected char categorie = '?';

	  public Ville(){
	    //On incrémente nos variables à chaque appel aux constructeurs
	    nbreInstances++;
	    nbreInstancesBis++;          
	    //Le reste ne change pas.
	  }
	
	
	public Ville(String pNom, int pNbre, String pPays) throws NombreHabitantException {
		
		if(pNbre < 0) throw new NombreHabitantException();
		else {
			nbreInstances ++;
			nbreInstancesBis ++;
			
			this.nomVille = pNom;
			this.nomPays = pPays;
			this.nbreHabitant = pNbre;
			
		}
		
	}
	
	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public int getNbreHabitant() {
		return nbreHabitant;
	}

	public void setNbreHabitant(int nbreHabitant) {
		this.nbreHabitant = nbreHabitant;
	}

	public static int getNombreInstancesBis() {
	    return nbreInstancesBis;
	 }
	
	//Définit la catégorie de la ville
	private void setCategorie() {
		
		int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
	
		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitant > bornesSuperieures[i])
			i++;
	
		this.categorie = categories[i];
	}
	
	//Retourne la description de la ville
	 public String decrisToi(){
	    return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+
	    		this.nbreHabitant+" habitant(s) => elle est donc de catégorie : "+this.categorie;
	 }
	 
	//Retourne une chaîne de caractères selon le résultat de la comparaison
	public String comparer(Ville v1){

		String str = new String();


		if (v1.getNbreHabitant() > this.nbreHabitant)

			str = v1.getNomVille()+" est une ville plus peuplée que "+this.nomVille;

		else

			str = this.nomVille+" est une ville plus peuplée que "+v1.getNomVille();

		return str;

	  }

}
