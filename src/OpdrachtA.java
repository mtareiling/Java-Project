import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.IOException;

public class OpdrachtA {


	public static void gesorteerd(){
		// TODO Auto-generated method stub
		int Getal = 0;
		int GrootGetal = 100000;
		PrintWriter writer;
		try {
			writer = new PrintWriter("gesorteerd.txt");
			System.out.println("fade");
	
			for (Getal = 0; Getal <= GrootGetal; Getal++) {
				writer.print(Getal + " ");
				if(Getal % 10 == 0) {
					writer.println(" ");
				}
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
	}
	public static void ongesorteerd(){
		// TODO Auto-generated method stub
		int Getal = 0;
		int GrootGetal = 100000;
		PrintWriter writer;
		try {
			writer = new PrintWriter("ongesorteerd.txt");
			System.out.println("fade");
	
			for (Getal = 0; Getal <= GrootGetal; Getal++) {
				double RandomGetal = Math.floor(Math.random() * Math.floor(10000));
				writer.print(Math.round(RandomGetal) + " ");
				if(Getal % 10 == 0) {
					writer.println(" ");
				}
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
	}


}
