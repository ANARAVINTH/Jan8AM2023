package automationbasics;

public class ConditionsOfJava {

    public static void main(String[] args) {

        int firstNumber = 22;
        int secondNumber = 45;

        if(firstNumber == secondNumber){

            System.out.println("Two numbers are equal");
        }
        else if(firstNumber > secondNumber){
            System.out.println("First Number is greater");
        }
        else if(firstNumber < secondNumber){
            System.out.println("Second no is greater");
        }
        else {
            System.out.println("The above conditions are not satisfied");
        }

        String nameOne = "Aravinth";
        String nameTwo = "aravinth";

        if(nameOne.equalsIgnoreCase(nameTwo)){
            System.out.println("Both are equal");
        }

        else {
            System.out.println("Both are not equal");
        }


    }

}
