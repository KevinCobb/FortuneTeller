import java.util.Scanner;

public class FortuneTellerAPP {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Welcome! I am ZOLTAR the fortune teller");
		System.out.println("=========================================");
		System.out.println(" ");
		System.out.println("Please type 'start' to request your fortune or 'quit' to end this program");
		   String startEntered = input.nextLine();

		if (startEntered.equalsIgnoreCase("start")) {
			System.out.println("========== Welcome ==============="); }
		else {
			System.out.println("Program has ended"); }
		

			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

			System.out.println("Let's get started. Please enter your first name");
			String firName = input.nextLine();
			System.out.println(" ");
			System.out.println("Now your last name is?");
			String lasName = input.nextLine();
			System.out.println("Great! Nice to meet you " + firName.toUpperCase() + " " + lasName.toUpperCase() + "!");
			System.out.println(" ");
			System.out.println("***********************");
			System.out.println(" ");
			System.out.println("Now, in order to see the future I need to get to know you " + firName.toUpperCase());
		
		
			
			System.out.println("What is your age?");
			int userAge = input.nextInt();
			
			int userAged = (userAge % 2);
		   			   			
			String userRet = "";
	        if (userAged == 0) {
	        	userRet = " 14"; }
		    	else {
		    	 userRet = " 22"; }
	    		
	            		    
			
			System.out.println("Now I need your birth month 'example: 01 for January'");
			String birMonth = input.next();
							
			String userSal = "";
		    switch (birMonth) {
		    case "01":
		    case "02": 
		    case "03":
		    case "04":
				userSal = "Your bank balance will be $435,908.63.";
				break;
		    case "05":
		    case "06":
		    case "07":
		    case "08":
		    	userSal = "Your bank balance will be $115,743.99";
		    	break;
		    case "09":
		    case "10": 
		    case "11":
		    case "12":
		    	userSal = "Your bank balance will be $201,113.63";
		    	break;
		    default: userSal = "You will have nothing at retirement."; 
		    }
		    
		    System.out.println(" ");
		    
		    
		    
		    System.out.println("Now I need your favorite ROYGBIV color. *If you need a list of the ROYGBIV colors type 'help'");
			String favColor = input.next();

			String modeTrans = "";
			switch (favColor) {
			case "red":
				modeTrans = "a White Rolls Royce Phantom with a chaufer named 'Alfred'.";
			case "orange":
				modeTrans = "a Red Porche Cyanne.";
			case "yellow":
				modeTrans = "a Ford King Ranch F-250 with a horse trailer.";
			case "green":
				modeTrans = "a  Silver Toyota Avalon Limited edition.";
			case "blue":
				modeTrans = "a 1979 Chevy Chevette with rusted out doors.";
			case "indigo":
				modeTrans = "a Fusia colored VW beetle with flower style wheels.";
			case "violet":
				modeTrans = "a Honda mini-van.";
				System.out.println("good!");
				break;

			case "help":
				System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");

				break;
			default: modeTrans = "That's not a color silly!";
			}
				
			System.out.println(" ");
			
			System.out.println("Lastly I need to know, how many siblings do you have?");
			int userSib = input.nextInt();
				
			String vacHome = "";
			if (userSib == 0) {
				vacHome = " a large villa near Tuscany Italy."; }
		   	else if (userSib == 1)	{		
		   		vacHome = " a golf resort in southern California."; }
		   	else if (userSib == 2) {
		   	   	vacHome = " Texas cattle country near the border."; }
		   	else if (userSib == 3) {
		    	vacHome = " a nice part of Indianapolis."; }
		   	else if (userSib >= 4) {
		    	vacHome = " a shack near the New York garbage landfill."; }
			else {
				vacHome = " a tomb the bottom of the Mariana Trench."; }
	   
	      		
				
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				
				System.out.println("I see your fortune as: ");
				System.out.println(" ");
				System.out.println(firName.toUpperCase() + " " + lasName.toUpperCase() + " You will retire in" + userRet + " years. " + userSal + " You will have a vacation home in" + vacHome + " And travel by " + modeTrans);
				
			
				input.close();
					
				
				
			
			   }	
}
			
		