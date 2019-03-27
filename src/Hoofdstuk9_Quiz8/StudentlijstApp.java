package Hoofdstuk9_Quiz8;

public class StudentlijstApp {
	public static void main(String [] args) {
		College cl = new College();
		/*cl.studentToevoegen(); // opdracht 3; het verwijderen van deze statement 
		 * zorgt er voor dat er geen gegevens kunnen worden uitgeprint omdat de studenten niet toegevoegd worden*/
		for(int i = 0; i < cl.studentenlijst.size(); i ++)
		{
			/*if(i == 2) if statement verwijderen opdracht 2. nu worden alle studenten getoond van de array.
			{*/
				System.out.println(cl.studentenlijst.get(i).naam + ", "
				+ cl.studentenlijst.get(i).leeftijd + ", "
				+ cl.studentenlijst.get(i).email + ", ");
				// met get(i) word toegang verkregen tot de int i variable uit de for loop.  
			//}
		}
	}
}
