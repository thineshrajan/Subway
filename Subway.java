import java.util.Scanner;

public class Subway {
	public static int choose;
	public static Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.println("Welcome to subway");
		System.out.println("1.Order subway of the day");
		System.out.println("2.Order your own sub");
		System.out.println("3.exit");
	}

	public static void order() {
		choose = sc.nextInt();
		if (choose == 1) {
			System.out.println("Invoice for Sub");
			System.out.println("  Crust - Hard          - 10  ₹ ");
			System.out.println("  Filling-chicken Tikka - 120 ₹");
			System.out.println("  Topping-Cucumber      - 25  ₹ ");
			System.out.println("  Topping-Meat Strip    - 25  ₹ ");
			System.out.println("  Topping-Cabbage       -  0  ₹ ");

			System.out.println("  Total                 - 200 ₹ ");

			System.out.println("Please Comform to your order type Yes");
			String s1 = sc.next();
			if (s1.contains("Yes")|| s1.equalsIgnoreCase("yes")) {
				System.out.println("Your subway order is placed for 200  ₹ ");
			}
		}
		if (choose == 2) {
			System.out.println("please choose one Crust");
			System.out.println("  1.Hard          - 10 ₹ ");
			System.out.println("  2.Thin          - 10 ₹ ");
			System.out.println("  3.Soft          - 12 ₹ ");
			int order = sc.nextInt();
			if (order == 1) {
				System.out.println("  1.Hard      - 10  ");
			}
			System.out.println("please choose one Filling");
			System.out.println("  1.Chicken Tikka          - 120 ₹ ");
			System.out.println("  2.Panieer Tikka          - 100 ₹ ");
			System.out.println("  3.Turkey Meat            - 130 ₹ ");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println(" 1.Chicken Tikka       - 120 ₹ ");
			}
			System.out.println("please choose three Topping");
			System.out.println(" 1. Topping-Cucumber      - 25  ₹ ");
			System.out.println(" 2. Topping-Meat Strip    - 45  ₹ ");
			System.out.println(" 3. Topping-Cabbage       -  0  ₹ ");
			System.out.println(" 4. Topping-Tomoto        - 20  ₹ ");
			String[] string = new String[sc.nextInt()];
			
			for (int i = 0; i < string.length; i++) {
				string[i] = sc.nextLine();
			}
			System.out.println("You have entered: ");
			System.out.println(" 1. Topping-Cucumber      - 25  ₹ ");
			System.out.println(" 2. Topping-Meat Strip    - 45  ₹ ");
			System.out.println(" 3. Topping-Cabbage       -  0  ₹ ");

			System.out.println("Invoice for Sub");
			System.out.println("  Crust - Hard          -  10  ₹ ");
			System.out.println("  Filling-chicken Tikka - 120 ₹");
			System.out.println("  Topping-Cucumber      -  25  ₹ ");
			System.out.println("  Topping-Meat Strip    -  45  ₹ ");
			System.out.println("  Topping-Cabbage       -   0  ₹ ");
			System.out.println("  Total                 - 200 ₹ ");

			System.out.println("Please Comform to your order type Yes");
			String s = sc.next();
			if (s.contains("Yes")|| s.equalsIgnoreCase("yes")) {
				System.out.println("Your subway order is placed for 200  ₹ ");
			}
		}
		if (choose == 3) {
			System.out.println("Please visit again");
		}

	}

	public static void main(String[] args) {
		menu();
		order();
	}

}
