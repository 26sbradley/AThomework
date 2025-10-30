import java.util.Scanner;

public class Project {
    
    // Enum for passenger types
    enum PassengerType {
        BABY, CHILD, ADULT, SENIOR
    }

    // Enum for days of the week
    enum DayOfWeek {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1
        System.out.print("What is your name?: ");
        String name = input.nextLine();

        System.out.print("What day of the week it it?: ");
        String dayInput = input.next().toLowerCase();

        // Convert day input to enum
        DayOfWeek day = parseDay(dayInput);
        if (day == null) {
            System.err.println("Error: Unknown day. Stopping program.");
            return;
        }

        System.out.print("What time is it?: ");
        String time = input.next();

        // Validate time format
        if (!time.contains(":")) {
            System.err.println("Error: Invalid time format. Stopping program.");
            return;
        }

        int hour, minute;
        try {
            hour = Integer.parseInt(time.substring(0, time.indexOf(":")));
            minute = Integer.parseInt(time.substring(time.indexOf(":") + 1));
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid time numbers. Stopping program.");
            return;
        }

        System.out.print("What is your age?: ");
        int age;
        try {
            age = input.nextInt();
        } catch (Exception e) {
            System.err.println("Error: Invalid age. Stopping program.");
            return;
        }

        System.out.print("Are you a student? yes or no: ");
        String studentInput = input.next().toLowerCase();
        boolean isStudent;
        if (studentInput.equals("yes")) {
            isStudent = true;
        } else if (studentInput.equals("no")) {
            isStudent = false;
        } else {
            System.err.println("Error: Invalid student input. Stopping program.");
            return;
        }

        // Step 2
        PassengerType type;
        if (age <= 2) {
            type = PassengerType.BABY;
        } else if (age <= 12) {
            type = PassengerType.CHILD;
        } else if (age >= 60) {
            type = PassengerType.SENIOR;
        } else {
            type = PassengerType.ADULT;
        }

        // Step 3
        double basePrice;
        boolean rushHour = false;
        if (day == DayOfWeek.SAT || day == DayOfWeek.SUN) {
            basePrice = 80.00;
        } else {
            if ((hour >= 6 && hour <= 7) || (hour >= 16 && hour <= 17)) {
                basePrice = 100.00;
                rushHour = true;
            } else {
                basePrice = 90.00;
            }
        }

        // Step 4
        double ageDiscount = 0;
        double studentDiscount = 0;
        double finalCost = basePrice;

        switch (type) {
            case BABY:
                finalCost = 0.0;
                break;
            case CHILD:
                ageDiscount = basePrice * 0.20;
                finalCost = basePrice - ageDiscount;
                break;
            case SENIOR:
                ageDiscount = basePrice * 0.25;
                finalCost = basePrice - ageDiscount;
                break;
            case ADULT:
                // no age discount
                break;
        }

        if (isStudent && type != PassengerType.BABY) {
            studentDiscount = finalCost * 0.05;
            finalCost -= studentDiscount;
        }

        // Step 5
        System.out.println("\n------------------------------------------------------");
        System.out.printf("Name:    %s%n", name);
        System.out.printf("Day:     %s%n", day);
        System.out.printf("Time:    %s%n", time);
        System.out.println("------------------------------------------------------");
        System.out.printf("Base Price:         $%8.2f %s%n", basePrice,
                rushHour ? "(RUSH HOUR FARE)" : "");
        System.out.printf("Age Discount:       $%8.2f (%s)%n", ageDiscount, type);
        System.out.printf("Student Discount:   $%8.2f%n", -studentDiscount);
        System.out.println("------------------------------------------------------");
        System.out.printf("Final Cost:         $%8.2f%n", finalCost);
        System.out.println("------------------------------------------------------");

        input.close();
    }

    // Helper method to convert day text to enum
    public static DayOfWeek parseDay(String dayInput) {
        switch (dayInput.substring(0, 3)) {
            case "mon": return DayOfWeek.MON;
            case "tue": return DayOfWeek.TUE;
            case "wed": return DayOfWeek.WED;
            case "thu": return DayOfWeek.THU;
            case "fri": return DayOfWeek.FRI;
            case "sat": return DayOfWeek.SAT;
            case "sun": return DayOfWeek.SUN;
            default: return null;
        }
    }
}