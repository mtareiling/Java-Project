package quizzes;

import java.util.Arrays;

public class Dier {
	public static void main(String[] args) {
		//Opdracht 2: new String[5] vervangen met new String[8]
		String[] arrDier = new String[8];
		arrDier[0] = "Wolf";
		arrDier[1] = "Leeuw";
		arrDier[2] = "Luipaard";
		arrDier[3] = "Olifant";
		arrDier[4] = "Tijger";
		//Opdracht 1: Extra variabelen toegevoegd
		arrDier[5] = "Beer";
		arrDier[6] = "Zebra";
		arrDier[7] = "Aap";

		Arrays.sort(arrDier);

		//Opdracht 3: Array op naam volgorde uitschrijven
		System.out.print(Arrays.toString(arrDier));
	}

}