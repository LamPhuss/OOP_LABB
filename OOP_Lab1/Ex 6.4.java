import java.util.Scanner;

public class Display_number_day_and_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a month");
        String month = sc.nextLine();
        System.out.println("Input a year");
        try {
            int year = sc.nextInt();
            int numofday = 0;
            switch (month) {
                case "JAN":
                case "January":
                case "1":
                    numofday = 31;
                    break;
                case "FEB":
                case "Febuary":
                case "2":
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        numofday = 29;
                    } else {
                        numofday = 28;
                    }
                    break;
                case "MAR":
                case "March":
                case "3":
                    numofday = 31;
                    break;
                case "APR":
                case "April":
                case "4":
                    numofday = 30;
                    break;
                case "MAY":
                case "May":
                case "5":
                    numofday = 31;
                    break;
                case "JUN":
                case "June":
                case "6":
                    numofday = 30;
                    break;
                case "JUL":
                case "July":
                case "7":
                    numofday = 31;
                    break;
                case "AUG":
                case "August":
                case "8":
                    numofday = 31;
                    break;
                case "SEP":
                case "September":
                case "9":
                    numofday = 30;
                    break;
                case "OCT":
                case "October":
                case "10":
                    numofday = 31;
                    break;
                case "NOV":
                case "November":
                case "11":
                    numofday = 30;
                    break;
                case "DEC":
                case "December":
                case "12":
                    numofday = 31;
                    break;
                default:
                    System.out.println("Wrong month format");
                    break;
            }

            System.out.println(numofday);
        }
        catch (Exception e){
            System.out.println("Wrong year format");
        }
    }
}
