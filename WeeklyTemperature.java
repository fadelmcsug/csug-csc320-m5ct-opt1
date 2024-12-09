import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperature {
    public static void main(String[] args) {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        ArrayList<Double> avgDailyTemps = new ArrayList<>();
        avgDailyTemps.add(24.1);
        avgDailyTemps.add(23.8);
        avgDailyTemps.add(25.3);
        avgDailyTemps.add(21.5);
        avgDailyTemps.add(22.6);
        avgDailyTemps.add(25.1);
        avgDailyTemps.add(21.3);

        double avgWeeklyTemp = 0;
        for (double temp : avgDailyTemps) {
            avgWeeklyTemp += temp;
        }
        avgWeeklyTemp /= avgDailyTemps.size();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a weekday (Monday through Sunday) to display the average temperature on that day.");
        System.out.println("Or enter \"week\" to display the average temperature of all weekdays.");
        String userInput = scanner.nextLine().trim();
        scanner.close();
        
        for (int i = 0; i < avgDailyTemps.size(); i++) {
        	String currentWeekday = weekDays.get(i);
			Double currentDailyTemp = avgDailyTemps.get(i);
			
			if (userInput.equalsIgnoreCase("week")) {
        		System.out.println(currentWeekday + ": " + currentDailyTemp + "°C");
        	} else if (userInput.equalsIgnoreCase(currentWeekday)) {
        		System.out.println(currentWeekday + ": " + currentDailyTemp + "°C");
        		break;
        	}
        	if (i == avgDailyTemps.size() - 1) {
        		if (userInput.equalsIgnoreCase("week")) {
        			System.out.println(String.format("Average weekly temperature: %.2f°C", avgWeeklyTemp));
        		} else { System.out.println("Invalid option"); }
    		}
    	}
    }
}
