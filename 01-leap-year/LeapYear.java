import java.util.Scanner;
public class LeapYear {
public static void main (String []args){

System.out.println("Enter the year: ");
Scanner s = new Scanner(System.in);
int year = s.nextInt();


if (year % 4 == 0) {
    if(year % 100 != 0) {
        System.out.println("Is a leap year!!");

    } else {
        if(year % 400 == 0) {
            System.out.println("Is a leap year!");
            
        } else {
            System.out.println("Not a leap year!!");
        }
    }
} else {
    System.out.println("Not a leap year!!");

}



}


}
