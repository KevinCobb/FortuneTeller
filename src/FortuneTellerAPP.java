import java.util.Scanner;

public class FortuneTellerAPP {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Welcome! I am ZOLTAR the fortune teller");
		System.out.println("=========================================");
		System.out.println("Please type 'start' to request your fortune or 'quit' to end this program");
		String startEntered = input.nextLine();
		
		if (startEntered.equalsIgnoreCase("start")) {
			System.out.println("========== Welcome ===============");
		} else
			System.out.println("Program has ended"); {
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("Let's get started. Please enter your first name");
		String firName = input.nextLine();
		System.out.println("Now your last name is?");
		String lasName = input.nextLine();
		System.out.println("Great! Nice to meet you " + firName.toUpperCase() + " " + lasName.toUpperCase() + "!");
		
		System.out.println("***********************");
		
		System.out.println("Now in order to see the future I need to get to know you " + firName.toUpperCase());
		System.out.println("What is your age?");
		double userAge = input.nextDouble();

		System.out.println("Now I need your birth month 'example: 01 for January'");
		double birMonth = input.nextDouble();
		
		System.out.println("Now I need your favorite ROYGBIV color. *If you need a list of the ROYGBIV colors type 'help'");
		String favColor = input.next();
	
		switch (favColor) {
			case "red":
			case "orange":
			case "yellow":
			case "green":
			case "blue":
			case "indigo":
			case "violet":
				System.out.println("good");
			break;	
								
			case "help":
				System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
				
			break;
			
					
				default:
					System.out.println("that's not a color silly");
				
		}
		
		
	
		
		
		
		
		System.out.println("Lastly I need to know, how many siblings do you have?");
          
			}
	}
}





	
		
	


