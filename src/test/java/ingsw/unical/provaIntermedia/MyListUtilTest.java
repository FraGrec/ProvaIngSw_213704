package ingsw.unical.provaIntermedia;

import java.util.ArrayList;

public class MyListUtilTest {
	
	private static MyListUtil myListUtil;
	
	static ArrayList<Integer> list;
	
	@BEFORECLASS
	public static void addExamples()
	{
		list.add(1);
		list.add(3);
		list.add(5);
	}
	
	@TEST(expected = IllegalArgumentException)
	public static void selezioneNonConsentita
	{
		System.out.println("è stato selezionato un n non valido");
	}
	
	@TEST(expected = IllegalArgumentException)
	public static void controlloArrayVuoto()
	{
		System.out.println("la lista di numeri che mi hai dato è vuota! Prova a darmene un'altra");
	}
	
	

}
