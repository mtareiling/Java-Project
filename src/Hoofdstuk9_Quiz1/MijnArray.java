package Hoofdstuk9_Quiz1;

public class MijnArray {
	public static void main (String[] args ) {
		int[] arrayInt = new int[11];// het getal in new int[11] geeft de lengte van de array aan. 
		//Omdat de waarde van de elementen niet zijn geïntaliseerd zijn ze allemaal gelijk aan 0.
		for(int i = 0; i < arrayInt.length; i ++)
		{
			System.out.print(arrayInt[i] + " ");// hier word de volledige array uitgeprint in een lengte van 11.
		}
	}
}
