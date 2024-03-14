
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String monthInput;
        int month=0;
        int year;
        while (true) {
	        System.out.print("Enter a month: ");
	        monthInput = sc.nextLine().toLowerCase();
	        
	        switch (monthInput) {
	            case "january":
	            case "jan.":
	            case "jan":
	            case "1":
	                month = 1;
	                break;
	            case "february":
	            case "feb.":
	            case "feb":
	            case "2":
	                month = 2;
	                break;
	            case "march":
	            case "mar.":
	            case "mar":
	            case "3":
	                month = 3;
	                break;
	            case "april":
	            case "apr.":
	            case "apr":
	            case "4":
	                month = 4;
	                break;
	            case "may":
	            case "5":
	                month = 5;
	                break;
	            case "june":
	            case "jun.":
	            case "jun":
	            case "6":
	                month = 6;
	                break;
	            case "july":
	            case "jul.":
	            case "jul":
	            case "7":
	                month = 7;
	                break;
	            case "august":
	            case "aug.":
	            case "aug":
	            case "8":
	                month = 8;
	                break;
	            case "september":
	            case "sep.":
	            case "sep":
	            case "9":
	                month = 9;
	                break;
	            case "october":
	            case "oct.":
	            case "oct":
	            case "10":
	                month = 10;
	                break;
	            case "november":
	            case "nov.":
	            case "nov":
	            case "11":
	                month = 11;
	                break;
	            case "december":
	            case "dec.":
	            case "dec":
	            case "12":
	                month = 12;
	                break;
	            default:
	                System.out.println("Invalid month. Please enter a valid month.");
	                continue;
	        }
	        if (month!=0) {
	        	break;
	        }
        }
        
        while (true) {
            System.out.print("Enter a year: ");
            year = sc.nextInt();
            
            if (year >= 0) {
                break;
            } 
            else {
                System.out.println("Invalid year. Please enter a non-negative integer.");
                continue;
            }
        }        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int days;
        switch (month) {
            case 2:
                days = isLeapYear ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }

        System.out.println("Number of days in " + monthInput + "/" + year + ": " + days);
    }
}
