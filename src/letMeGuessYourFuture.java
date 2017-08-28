import java.util.Scanner;

public class letMeGuessYourFuture {

	public static void main(String[] args) {
		Scanner usersFirstName = new Scanner(System.in);
		System.out.println("Enter Your First Name");
		String response1 = usersFirstName.nextLine();
		response1 = response1.substring(0, 1).toUpperCase() + response1.substring(1);

		Scanner usersLastName = new Scanner(System.in);
		System.out.println("Enter Your Last Name");
		String response2 = usersLastName.nextLine();
		response2 = response2.substring(0, 1).toUpperCase() + response2.substring(1);

		Scanner usersAge = new Scanner(System.in);
		System.out.println("What is your age?");
		int response3 = usersAge.nextInt();

		Scanner usersBirthMonth = new Scanner(System.in);
		System.out.println("What month were you born in? Please answer with a number.");
		System.out.println("January = 1");
		System.out.println("February = 2");
		System.out.println("March = 3");
		System.out.println("April = 4");
		System.out.println("May = 5");
		System.out.println("June = 6");
		System.out.println("July = 7");
		System.out.println("August = 8");
		System.out.println("September = 9");
		System.out.println("October = 10");
		System.out.println("November = 11");
		System.out.println("December = 12");
		int response4 = usersBirthMonth.nextInt();

		Scanner usersFavoriteROYGBIVColor = new Scanner(System.in);
		System.out.println("What is your favorite ROYGBIV color?");
		System.out.println("What's that you ask??? Type help for assistance.");
		String response5 = usersFavoriteROYGBIVColor.nextLine();
		while (response5.equalsIgnoreCase("help")) {
			System.out.println("The ROYGBIV Colors are Red, Orange, Yellow, Green, Blue, Indigo and Violet.");
			break;
		}

		Scanner usersNumberofSiblings = new Scanner(System.in);
		System.out.println("How many siblings do you have?");
		int response6 = usersNumberofSiblings.nextInt();

		if (response3 % 2 == 0) {
			System.out.print(response1 + " " + response2 + ",");
			System.out.print(" you will retire in 22 years with");
		} else if (response3 % 2 == 1) {
			System.out.print(response1 + " " + response2 + ",");
			System.out.print(" you will retire in 40 years with");
		}
		if (response4 <= 4 && response4 >= 1) {
			System.out.print(" $76,546 in the bank, ");
		}
		if (response4 <= 8 && response4 >= 5) {
			System.out.print(" $637,746.92 in the bank, ");
		}
		if (response4 <= 12 && response4 >= 9) {
			System.out.print(" one billion dollars in the bank, ");
		} else if (response4 > 12 && response4 < 1) {
			System.out.print(" pennys in the bank, ");
		}

		if (response6 == 0) {
			System.out.print("a vacation home in Maui and ");
			if (response6 == 1) {
				System.out.print("a vacation home in El Paso and ");
			}
		}
		if (response6 == 2) {
			System.out.print("a vacation home in Capri and ");
		}
		if (response6 == 3) {
			System.out.print("a vacation home in Columbus and ");
		}
		if (response6 >= 4) {
			System.out.print("a vacation home in Punxsutawne and ");
		} else if (response6 < 0) {
			System.out.print("a vacation home in Delaware and ");
		}

		if ("red".equalsIgnoreCase(response5)) {
			System.out.println("travel by phonebooth.");
		}
		if ("blue".equalsIgnoreCase(response5)) {
			System.out.println("travel by Garth's Mirth Mobile.");
		}
		if ("orange".equalsIgnoreCase(response5)) {
			System.out.println("Camel.");
		}
		if ("yellow".equalsIgnoreCase(response5)) {
			System.out.println("travel by ecto1.");
		}
		if ("indigo".equalsIgnoreCase(response5)) {
			System.out.println("travel by the Dudes rug.");
		}
		if ("green".equalsIgnoreCase(response5)) {
			System.out.println("travel by magic school bus.");
		}
	}
}
