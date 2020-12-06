package ClassAssignment;

import java.util.Scanner;

public class BajimayaTakeOut {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isWrongMenuChoice = false;
		System.out.println("How many people do you have? ");
		int numberOfPeople = input.nextInt();
		if (numberOfPeople < 10 || numberOfPeople > 100) {
			System.out.println("Number of people are invalid");
			System.exit(0);
		}

		do {
			System.out.println("TAKEOUT MENU");
			displayMainMenu();
			System.out.println("Choose what type of food you'd like to order: ");
			String mealType = input.next();
			int opt;
			switch (mealType.hashCode()) {
				case 49 :
					if (mealType.equals("1")) {
						displayItalianFoodMenu();
						int[] feedItalianFood = new int[]{5, 7, 4};
						double[] priceItalian = new double[]{17.99D, 15.99D, 12.99D};
						opt = foodChoice(feedItalianFood, priceItalian);
						finalPrice(feedItalianFood, priceItalian, opt, numberOfPeople);
						isWrongMenuChoice = false;
						continue;
					}
					break;
				case 50 :
					if (mealType.equals("2")) {
						displayChineseFoodMenu();
						int[] feedChineseFood = new int[]{7, 7, 5};
						double[] priceChinese = new double[]{18.99D, 18.99D, 10.99D};
						opt = foodChoice(feedChineseFood, priceChinese);
						finalPrice(feedChineseFood, priceChinese, opt, numberOfPeople);
						isWrongMenuChoice = false;
						continue;
					}
					break;
				case 51 :
					if (mealType.equals("3")) {
						displayAmericanFoodMenu();
						int[] feedAmericanFood = new int[]{8, 5, 10};
						double[] priceAmerican = new double[]{21.99D, 22.99D, 26.99D};
						opt = foodChoice(feedAmericanFood, priceAmerican);
						finalPrice(feedAmericanFood, priceAmerican, opt, numberOfPeople);
						isWrongMenuChoice = false;
						continue;
					}
			}

			System.out.println("Wrong meal type.Please choose correct menu.");
			isWrongMenuChoice = true;
		} while (isWrongMenuChoice);

	}

	public static void displayMainMenu() {
		String[] foodMenu = new String[]{"Italian", "Chinese", "American"};
		System.out.println("------------------");

		for (int i = 0; i < foodMenu.length; ++i) {
			System.out.println(i + 1 + ". " + foodMenu[i]);
		}

	}

	public static void displayItalianFoodMenu() {
		String[] italianFood = new String[]{"Lasagna Tray", "Pizza Pack", "Gazpacho Soup, salad and bread sticks pack"};
		System.out.println("------------------");

		for (int i = 0; i < italianFood.length; ++i) {
			System.out.println(i + 1 + ". " + italianFood[i]);
		}

	}

	public static void displayChineseFoodMenu() {
		String[] chineseFood = new String[]{"Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls)",
				"Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls)",
				"Shrimp Fried Rice Tray (includes 10 egg rolls)"};
		System.out.println("------------------");

		for (int i = 0; i < chineseFood.length; ++i) {
			System.out.println(i + 1 + ". " + chineseFood[i]);
		}

	}

	public static void displayAmericanFoodMenu() {
		String[] americanFood = new String[]{"Hamburger and Hot Dog Tray - includes buns and condiments",
				"Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces",
				"Barbeque Tray - includes buns and peach cobbler"};
		System.out.println("------------------");

		for (int i = 0; i < americanFood.length; ++i) {
			System.out.println(i + 1 + ". " + americanFood[i]);
		}

	}

	public static int determineTrays(int people, int feeds) {
		int trays = (int) Math.round((double) (people / feeds) + 0.5D);
		return trays;
	}

	public static double getSubtotal(double price, int trays) {
		double subTotal = (double) trays * price;
		return subTotal;
	}

	public static double getTax(double subTotal, double taxRate) {
		double tax = subTotal * taxRate;
		return tax;
	}

	public static double getTip(double subTotal, double tipRate) {
		double tip = subTotal * tipRate;
		return tip;
	}

	public static double getGrandTotal(double subTotal, double tax, double tip) {
		double total = subTotal + tax + tip;
		return total;
	}

	public static double pricePerPerson(double grandTotal, int people) {
		return grandTotal / (double) people;
	}

	public static int determineLeftOvers(int feeds, int trays, int people) {
		return trays * feeds - people;
	}

	public static int foodChoice(int[] feed, double[] prices) {
		Scanner input = new Scanner(System.in);
		System.out.println("CHOOSE ONE");
		System.out.println("-----------");

		int opt;
		for (opt = 0; opt < feed.length; ++opt) {
			System.out.println(opt + 1 + " - feeds " + feed[opt] + " - " + prices[opt]);
		}

		System.out.println("Enter choice: ");
		opt = input.nextInt();
		if (opt <= 0 || opt > feed.length) {
			System.exit(0);
		}

		return opt;
	}

	public static void finalPrice(int[] feeds, double[] prices, int choice, int guestCount) {
		int trays = determineTrays(guestCount, feeds[choice - 1]);
		double subTotal = getSubtotal(prices[choice - 1], trays);
		double tax = getTax(subTotal, 0.07D);
		double tip = getTip(subTotal, 0.15D);
		double grandTotal = getGrandTotal(subTotal, tax, tip);
		System.out.println("You need " + trays + " trays");
		System.out.println("Feed: " + feeds[choice - 1]);
		System.out.printf("Price for " + guestCount + " people (" + trays + " trays):$ %.2f\n", subTotal);
		System.out.printf("Tax: $ %.2f\n", tax);
		System.out.printf("Tip: $ %.2f\n", tip);
		System.out.printf("Total (Food, Tax, Tip): $ %.2f\n", grandTotal);
		System.out.printf("Price per person: $ %.2f\n", pricePerPerson(grandTotal, guestCount));
		System.out.println("Left-over servings for the delivery person: "
				+ determineLeftOvers(feeds[choice - 1], trays, guestCount));
	}
}