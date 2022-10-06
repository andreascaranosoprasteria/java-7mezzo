package com.soprasteria;
import java.util.Random;
import java.util.Scanner;

public class Main {
	/*
	 * Esercizio: 7 e 1/2 Nome repo: java-7mezzo Scrivere un programma che simula il
	 * gioco di carte "7 e 1/2". Regole del gioco: ogni carta ha un valore: le
	 * "figure" (8, 9, 10) valgono mezzo punto, le altre hanno lo stesso valore
	 * della carta (ad esempio il "6 di coppe" vale 6 punti l'obiettivo del
	 * giocatore è fare più punti possibile senza superare il punteggio di 7.5 (in
	 * quel caso perde) il giocatore chiede una carta al banco, e dopo ogni carta
	 * decide se continuare a chiedere carte oppure fermarsi quando il giocatore
	 * decide di fermarsi tocca al banco: il banco estrae a sua volta le carte,
	 * continuando fino a quando supera il punteggio del giocatore o supera il
	 * punteggio di 7.5 (in questo caso vince il giocatore) a parità di punteggio
	 * vince il banco Per ogni carta estratta mostrare il valore della carta e il
	 * suo seme (ad esempio "6 di bastoni"), ed il punteggio attuale del giocatore
	 * Suggerimento: generare un vettore di 40 numeri casuali da 1 a 40 tutti
	 * diversi tra loro (utilizzare l'algoritmo di ricerca visto a lezione per
	 * assicurarsi che i numeri siano tutti diversi tra loro) I numeri da 1 a 10
	 * rappresentano le carte di "bastoni"; I numeri da 11 a 20 rappresentano le
	 * carte di "coppe"; I numeri da 21 a 30 rappresentano le carte di "denari"; I
	 * numeri da 31 a 40 rappresentano le carte di "spade";

	 */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] carte = new int[40];
		// PARTE 1
		int randomIndex;
		int cont = 40;
		int contaCarte;
		Random r = new Random();
		boolean exit = true;
		
		float punteggioGiocatore = 0;
		int punteggioBanco = 0;
		do {
			contaCarte = cont;
			do {
				randomIndex = r.nextInt(40);
				if (carte[randomIndex] == 0) {
					carte[randomIndex] = cont;
					cont--;
				}
				//System.out.println("Debug");
				
			} while (contaCarte == cont);
			if(cont == 0)exit = false;
		} while (exit);
		
		//DEBUG STAMPA MAZZO CARTE
		for (int i = 0; i < carte.length; i++) {
			System.out.print(" | " + carte[i]);
		}
		//PUNTO 2 to be continued....
		
	}
}
