package ingsw.unical.provaIntermedia;

import java.util.ArrayList;
import java.util.Collections;

public class MyListUtil {

	ArrayList<Integer> list;
	
	public void Ordina()
	{
		int n = 0;
		System.out.println("Digita 0 se vuoi che venga ordinato crescente; Digita 1 se vuoi che venga ordinato descrescente");
		if(n == 0)
		{
			Collections.sort(list);
		}
		
		if(n == 1)
		{
			Collections.sort(list, Collections.reverseOrder());
		}
		if (n > 1 && n < 0)
			throw new IllegalArgumentException ("Valore non consentito" + n);
		
		if(list == null)
		{
			throw new IllegalArgumentException("la lista è  nulla");
		}
	}

}
