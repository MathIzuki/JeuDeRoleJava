package com.btssio.ozenne;

import java.util.Random;
import java.util.Scanner;

public class Jeu {
	
	/* OBJET PRIVEE */
	private Personnage jeu1;
	private Personnage jeu2;
	
	/* OBJETS PUBLIC */
	//creation des deux Armes
	public static Arme weapon1 = new Arme("SabreLaser");
	public static Arme weapon2 = new Arme("Excalibur");
			
	//creation des deux personnages
	public static Personnage joueur1 = new Personnage("Mathis", weapon1);
	public static Personnage joueur2 = new Personnage("Arthur", weapon2);
			
	//Instanciation de la classe Jeu
	public static Jeu jeu = new Jeu(joueur1, joueur2);
	
	/**
	 * Vérifie si deux joueur sont encore en vie
	 * @return
	 * revoie un booléan
	 */
	public boolean finDePartie() {
		if (joueur1.enVie() == false || joueur2.enVie() == false)
			return true;
		else
			return false;
	}
	
	/**
	 * Permet de Démarrer le jeu
	 * @throws InterruptedException 
	 */
	public void lancerLeJeu() throws InterruptedException {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Que la partie commence !");
		//lancement des 2 dès et récupération des valeurs des variables
		// et présentation des personnages
		
		joueur1.sePresenter();
		int de_perso1 = lancerLeDe();
		
		joueur2.sePresenter();
		int de_perso2 = lancerLeDe();
		//déclaration et initialisation d'une variable i permettant de déterminer le joueur
		
		int i = 0;
		//gestion du choix du joueur
		if (de_perso1 > de_perso2) {
			i = 1;
			
		}
		//tant que la partie n'est pas finie
		while(!finDePartie()) {
			//tour du joueur1
			if (i==1) {
				System.out.println("---------- C'est au tour de" + joueur1.getNom() + "tapez sur la touche Entrée");
				clavier.nextLine();
				joueur1.attaquerUnAdversaire(joueur2, lancerLeDe());
				i=0;
			}
			else //tour du joueur 2
			{
				System.out.println("---------- C'est au tour de " + joueur2.getNom() + "tapez sur la touche Entrée");
				clavier.nextLine();
				joueur2.attaquerUnAdversaire(joueur1, lancerLeDe());
				i=1;
			}
		}
		System.out.println("fin de partie");
	}
	
	/**
	 * Fonction qui lance un Dé
	 * @return
	 * (Génère un chiffre entre 1 et 6)
	 * @throws InterruptedException
	 */
	
	
	public int lancerLeDe() throws InterruptedException {
		Random rd = new Random();
		Thread.sleep(300);
		
		//nombre de face du dé
		return 1+ rd.nextInt(6);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//DEMARRAGE DU JEU
		jeu.lancerLeJeu();
		
	}
	
	
	/**
	 * Constructeur de la classe Jeu
	 * @param jeu1
	 * @param jeu2
	 */
	public Jeu(Personnage jeu1, Personnage jeu2) {
		super();
		this.jeu1 = jeu1;
		this.jeu2 = jeu2;
	}
	//Recevoir les informations du Jeu du personnage 1 avec le getter  
	public Personnage getJeu1() {
		return jeu1;
	}
	
	//Ecrire les informations du jeu du personnage 1 avec le setter
	public void setJeu1(Personnage jeu1) {
		this.jeu1 = jeu1;
	}
	
	//Recevoir les informations du Jeu du personnage 2 avec le getter 
	public Personnage getJeu2() {
		return jeu2;
	}
	
	//Ecrire les informations du jeu du personnage 2 avec le setter
	public void setJeu2(Personnage jeu2) {
		this.jeu2 = jeu2;
	}
	
	

}
