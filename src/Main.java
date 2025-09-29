// --------------------------------------------------------------------------
// Darie-Dragos Mitoiu Mitoiu
// CIS1068 v1.0.0 29/09/2025
// CIS1068 Coursework Material
// --------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Worksheet Examples");
        // Create String separator
        String separator = new String(new char[120]).replace("\0", "-");
        System.out.println("Calculate Charge:");
        System.out.println(separator);
        // Solve charge problem
        Main.calculatePersonCharge();
        System.out.println("Get Even Odd Number:");
        System.out.println(separator);
        // Solve charge problem
        Main.getOddEvenNumber();
        System.out.println("Employee Manager:");
        System.out.println(separator);
        // Solve charge problem
        Main.employeeManager();
        System.out.println("Leap Year:");
        System.out.println(separator);
        // Solve charge problem extended
        Main.getLeapYear();
        System.out.println("Calculate Charge Extended:");
        System.out.println(separator);
        Main.calculatePersonChargeExtended();
        System.out.println("Bank Money Withdrawal");
        System.out.println(separator);
        Main.withdrawnFromBank();
    }

    public static void calculatePersonCharge(){
        int personAge = 0;
        int personCharge = 0;
        // Create buffer reader object
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("CIS1068 Coursework - Calculate Charge");
        System.out.print("Enter the age of the person: ");
        try {
            // Get the age of the person as a string, we need this so we can validate the input later
            String ageString = bufferReader.readLine();
            // Validate user input
            while(!Validation.validateInt(String.valueOf(ageString))) {
                System.out.println("\nInvalid input. Please enter numerical values only.\n");
                System.out.print("Enter the age of the person: ");
                ageString = bufferReader.readLine();
            }
            // Convert user input to integer
            personAge = Integer.parseInt(ageString);
            // Assign Initial Charge value of 20
            personCharge = 20;
            // If the person age is less than 18 then a smaller charge will apply
            if(personAge < 18) {
                personCharge = 15;
            }
            String message = ("For a person with the age of " + String.valueOf(personAge) +
                             " the charge of " + String.valueOf(personCharge) + " will apply.");
            System.out.println(message);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void getOddEvenNumber(){
        int number = 0;
        // Create buffer reader object
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("CIS1068 Coursework - Odd Even Number");
        System.out.print("Please enter the number: ");
        try {
            // Get number from the user
            String numberString = bufferReader.readLine();
            // Validate user input
            while(!Validation.validateInt(String.valueOf(numberString))) {
                System.out.println("\nInvalid input. Please enter numerical values only.\n");
                System.out.print("Please enter the number: ");
                numberString = bufferReader.readLine();
            }
            // Convert user input to integer
            number = Integer.parseInt(numberString);
            String message;
            if(number % 2 == 0){
                message = ("The number: " + String.valueOf(number) + " is even.");
                System.out.println(message);
            } else {
                message = ("The number: " + String.valueOf(number) + " is odd.");
                System.out.println(message);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void employeeManager(){
        int iNumberOfHoursPerWeek = 35;
        int iExtraOfHoursPerWeek = 0;
        float fHourlyRate = (float) 9.75;
        float fHourlyRateStaff = (float) 9.50;
        float fExtraStaffPay = (float) 4.50;
        float fResult = (float) 0.0;
        // Create buffer reader object
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        fResult = (float) (iNumberOfHoursPerWeek * fHourlyRate);
        System.out.println("CIS1068 Coursework - Employee Manager");
        System.out.println("Your Weekly Rate with " + iNumberOfHoursPerWeek + " hours is: £" + String.valueOf(fResult));
        System.out.print("Please enter the number of hours: ");
        try {
            // Get number from the user
            String numberString = bufferReader.readLine();
            // Validate user input
            while(!Validation.validateInt(String.valueOf(numberString))) {
                System.out.println("\nInvalid input. Please enter numerical values only.\n");
                System.out.print("Please enter the number of hours: ");
                numberString = bufferReader.readLine();
            }
            // Convert user input to integer
            iNumberOfHoursPerWeek = Integer.parseInt(numberString);
            fResult = (float) (iNumberOfHoursPerWeek * fHourlyRate);
            String message = "Your Weekly Rate with " + iNumberOfHoursPerWeek + " hours is: £" + String.valueOf(fResult);
            System.out.println(message);
            System.out.println("Extra Staff Pay:");
            System.out.print("Please enter the number of hours: ");
            numberString = bufferReader.readLine();
            // Validate user input
            while(!Validation.validateInt(String.valueOf(numberString))) {
                System.out.println("\nInvalid input. Please enter numerical values only.\n");
                System.out.print("Please enter the number of hours: ");
                numberString = bufferReader.readLine();
            }
            // Convert user input to integer
            int iStandardNumberOfHoursPerWeek = 40;
            iNumberOfHoursPerWeek = Integer.parseInt(numberString);
            iExtraOfHoursPerWeek = iNumberOfHoursPerWeek - iStandardNumberOfHoursPerWeek;
            fResult = (float) (fHourlyRateStaff * iNumberOfHoursPerWeek) + (fExtraStaffPay * iExtraOfHoursPerWeek);
            String messageStaff = "Your Weekly Rate with " + iNumberOfHoursPerWeek + " hours is: £" + String.valueOf(fResult);
            System.out.println(messageStaff);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void getLeapYear(){
        int year = 0;
        // Create buffer reader object
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("CIS1068 Coursework - Leap Year");
        System.out.print("Please enter the year: ");
        try {
            // Get number from the user
            String numberString = bufferReader.readLine();
            // Validate user input
            while(!Validation.validateInt(String.valueOf(numberString))) {
                System.out.println("\nInvalid input. Please enter numerical values only.\n");
                System.out.print("Please enter the year: ");
                numberString = bufferReader.readLine();
            }
            // Convert user input to integer
            year = Integer.parseInt(numberString);
            String message;
            if(year % 400 == 0){
                message = ("The year: " + String.valueOf(year) + " is a leap year.");
                System.out.println(message);
            } else if(year % 100 == 0) {
                message = ("The year: " + String.valueOf(year) + " is not a leap year.");
                System.out.println(message);
            } else if(year % 4 == 0) {
                message = ("The year: " + String.valueOf(year) + " is a leap year.");
                System.out.println(message);
            } else {
                message = ("The year: " + String.valueOf(year) + " is not a leap year.");
                System.out.println(message);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void calculatePersonChargeExtended(){
        int personAge = 0;
        float personCharge = 0;
        // Create buffer reader object
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("CIS1068 Coursework - Calculate Charge");
        System.out.print("Enter the age of the person: ");
        try {
            // Get the age of the person as a string, we need this so we can validate the input later
            String ageString = bufferReader.readLine();
            // Validate user input
            while(!Validation.validateInt(String.valueOf(ageString))) {
                System.out.println("\nInvalid input. Please enter numerical values only.\n");
                System.out.print("Enter the age of the person: ");
                ageString = bufferReader.readLine();
            }
            // Convert user input to integer
            personAge = Integer.parseInt(ageString);
            // Assign Initial Charge value of 30
            personCharge = (float) 30.0;
            // If the person age is less than 18 then a smaller charge will apply
            if(personAge < 18) {
                personCharge = (float) 0.6 * 30;
            }
            if(personAge > 65) {
                personCharge = (float) 0.8 * 30;
            }
            String message = ("For a person with the age of " + String.valueOf(personAge) +
                              " the charge of " + String.valueOf(personCharge) + " will apply.");
            System.out.println(message);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void withdrawnFromBank(){
        float personBankAccount = (float) 40.0;
        float personCharge = (float) 0.0;
        float overdraftCharge = (float) 5.0;
        float overdraftLimit = (float) 50.0;
        float fResult = (float) 0.0;
        // Create buffer reader object
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("CIS1068 Coursework - Calculate Bank Withdrawn Charge");
        System.out.print("Enter the number for the withdrawal of money: ");
        try {
            // Get the age of the person as a string, we need this so we can validate the input later
            String withdrawnString = bufferReader.readLine();
            // Validate user input
            while(!Validation.validateInt(String.valueOf(withdrawnString))) {
                System.out.println("\nInvalid input. Please enter numerical values only.\n");
                System.out.print("Enter the number for the withdrawal of money: ");
                withdrawnString = bufferReader.readLine();
            }
            // Convert user input to integer
            personCharge = Float.parseFloat(withdrawnString);
            // If the withdrawn amount is less or equal than 90 do not apply the charge (40 + 50 overdraft limit)
            if(personCharge <= (personBankAccount + overdraftLimit))
            {
                fResult = personBankAccount - personCharge;
            }
            // If the withdrawn amount is higher than 90 apply the charge (40 + 50 overdraft limit)
            if(personCharge > (personBankAccount + overdraftLimit))
            {
                fResult = (personBankAccount - personCharge) - overdraftCharge;
            }
            String message = ("Withdrawn " + String.valueOf(personCharge) + " New Balance " + String.valueOf(fResult));
            System.out.println(message);
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}