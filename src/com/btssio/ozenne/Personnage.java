package com.btssio.ozenne;

public class Personnage {
	
	// Attribut privés
	private String nom;
	private int pointsDeVie;
	private int positionX, positionY;
	private Arme arme;
			
	// Constructeur
	/**
	 * Constructeur de la classe Personnage
	 * @param p_nom
	 * @param p_arme
	 */
	public Personnage(String p_nom, Arme p_arme) {
		//valeur par défauts
		this.positionX = 0;
		this.positionY = 0;
		this.pointsDeVie = 100;
		
		//arguments
		this.nom = p_nom;
		this.arme = p_arme;
	}
			
	// Méthodes
	/**
	 * méthode d'attaque de joueur
	 * @param victime
	 * (classe contenant des informations sur la victime)
	 * @param des
	 * (nom de celui qui a fait l'attaque)
	 */
	public void attaquerUnAdversaire(Personnage persoAttaque, int nombreDe) {
		recevoirDesDegats(nombreDe);
		System.out.println(persoAttaque.getNom() + " a subit " + nombreDe + " degats.");
	}
	
	/**
	 * Dégats reçuent par le joueur
	 * @param nombre
	 * (dégats emit par l'attaque)
	 */
	public void recevoirDesDegats(int valeurDe) {
		pointsDeVie -= valeurDe;
		System.out.println("Le joueur " + nom + " attaque");
		System.out.println("La victime est maintenant a " + pointsDeVie + " coeurs");
	}
	
	public String getNom() {
		return nom;
	}
	//Mettre un nom avec le setter
	public void setNom(String nom) {
		this.nom = nom;
	}
	//C'est le getter de l'arme
	public Arme getArme() {
		return arme;
	}
	//Mettre une arme avec le setter
	public void setArme(Arme arme) {
		this.arme = arme;
	}
	//Recevoir le nombre de pdvie avec le getter
	public int getPointsDeVie() {
		return pointsDeVie;
	}
	//Recevoir la position sur X avec le getter
	public int getPositionX() {
		return positionX;
	}
	//Recevoir la position sur Y avec le getter
	public int getPositionY() {
		return positionY;
	}
	
	/**
	 * Fonction pour vérifier si un joueur est en vie
	 * @return
	 * renvoie si oui ou non le joueur est toujours en vie
	 */
	public boolean enVie() {
		if(pointsDeVie > 0) {
			System.out.println(nom + " est toujours en vie");
			return true;
		}
		else {
			System.out.println(nom + " est mort...");
			return false;
		}
	}
	
			
	public void seDeplacer() {}
	
	/**
	 * Procédure de Présentation des joueurs
	 */
	public void sePresenter() {
		System.out.println("Bienvenue joueur: " + nom + " tu possède l'arme: " + arme.getNom());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
