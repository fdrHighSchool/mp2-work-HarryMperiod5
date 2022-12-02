import java.util.Scanner;
public class divBy3 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to determine if it divisible by 3: ");
        int num = s.nextInt();
        System.out.println(By3(num));
        s.close();
    }
public static boolean By3(int num){
    int sum = 0;
    do{
        sum+=num%10;
        num = num/10;

    }while(num>0);
    if(sum%3 == 0){
        return true;
    }
else{
    return false;
