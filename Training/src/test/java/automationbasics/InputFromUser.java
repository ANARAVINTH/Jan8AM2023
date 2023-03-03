package automationbasics;

import java.util.Scanner;

public class InputFromUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfWorkingDays = scanner.nextInt();
        System.out.println("Enter String value");
        String role = scanner.next();

        int managerSalary = 500;
        int clerkSalary = 400;
        int staffSalary= 300;
        int totalSalary ;

        switch (role.toLowerCase()){

            case "manager":
                totalSalary = noOfWorkingDays * managerSalary;
                break;
            case "clerk":
                totalSalary = noOfWorkingDays * clerkSalary;
                break;
            case "staff":
                totalSalary = noOfWorkingDays * staffSalary;

            default:
                throw new IllegalArgumentException();

        }

        System.out.println(totalSalary);


    }
}
