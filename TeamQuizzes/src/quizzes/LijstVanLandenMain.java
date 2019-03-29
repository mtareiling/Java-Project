package quizzes;

import java.util.ArrayList;

public class LijstVanLandenMain {
	public static void main(String[] args) {
		ArrayList<String> landen = new ArrayList<String>();
		landen.add("Duitsland");
		landen.add("Verenigde Staten");
		landen.add("Rusland");
		landen.add("Verenigd Koninkrijk");
		landen.add(2, "India");

		for (int i = 0; i < landen.size(); i ++) {
			System.out.println(" " + landen.get(i));
		}
		//Opdracht 1
		System.out.println(" Is de lijst 'landen' leeg?: " + landen.isEmpty());
		//Opdracht 2
		System.out.println(" Staat Spanje in de ArrayList?: " + landen.contains("Spanje"));
		//Opdracht 3
		System.out.println(" Staat India in de ArrayList?: " + landen.contains("India"));
		//Opdracht 4
		System.out.println(" Wat is de index van Rusland?: " + landen.indexOf("Rusland"));
		//Opdracht 5
		System.out.println(" Duitsland wordt na deze zin uit de lijst verwijdert.");
		//Opdracht 6
		landen.remove("Duitsland");
		//Opdracht 7
		System.out.println(" Hoeveel landen zitten er in de ArrayList?: " + landen.size());
	}
}