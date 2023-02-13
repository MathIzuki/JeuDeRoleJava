package com.btssio.ozenne;

public class Arme {
	
	private String nom;
	private int degats;

	/**
	 * Constructeur de la classe Arme
	 * @param nom
	 * @param degats
	 */
	public Arme(String p_nom) {
		super();
		this.nom = p_nom;
		this.degats = 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bonjour");
		
		//Instanciation de la classe Arme
		Arme weapon001 = new Arme("SabreLaser");
		
		//Instanciation de la classe Personnage
		Personnage user001 = new Personnage("Sultana", weapon001);
		
		//Utilisation de la méthode sePresenter() dans la classe Personnage
		user001.sePresenter();
		
		//utilisation des accesseurs
//		System.out.println(weapon001.getDegats());
		
		System.out.println(user001.getNom());
		user001.setNom("Mathis");
		System.out.println(user001.getNom());
		
//		System.out.println(user001.getPointsDeVie());
//		System.out.prinln(user001.setPointDeVie());
		
		System.out.println(weapon001.getNom());
		weapon001.setNom("C4");
		System.out.println(weapon001.getNom());

	}
	//Recevoir les infos du nom avec le getter
	public String getNom() {
		return nom;
	}
	// Ecrire les infos du nom avec le setter
	public void setNom(String nom) {
		this.nom = nom;
	}
	//Recevoir les infos des dégâts avec le getter
	public int getDegats() {
		return degats;
	}
	//Ecrire les infos des dégâts avec le setter 
	public void setDegats(int degats) {
		this.degats = degats;
	}

}
