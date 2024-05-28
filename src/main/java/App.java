import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Day dayOfTheWeek = null;
        boolean validInput = false;

        System.out.println("Welcome to your schedule. What day of the week is it?");

        while (!validInput) {
            try {
                String input = scanner.nextLine();
                input = input.toUpperCase();
                dayOfTheWeek = Day.valueOf(input);
                validInput = true;

                if (dayOfTheWeek == Day.SATURDAY || dayOfTheWeek == Day.SUNDAY) {
                    System.out.println("It's the weekend, go to the gym!");
                } else {
                    System.out.println("It's a week day, better get to work!");
                }
            }
            catch (IllegalArgumentException e){
                System.out.println("Sorry please enter a valid day");
            }
        }
    }

}
