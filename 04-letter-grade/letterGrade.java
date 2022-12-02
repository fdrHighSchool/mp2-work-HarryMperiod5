import java.util.Scanner;
public class letterGrade {
    public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int grade = s.nextInt();
    System.out.println("Your grade is a(n) "+ fgrade(grade));
    s.close();
    }

    public static String pm(int grade){
    String sgrade ="" + grade;
    String plusminus="";
    sgrade = sgrade.substring(sgrade.length()-1);
    int ngrade =  Integer.parseInt(sgrade);
    if (ngrade >= 7){
        plusminus+="+";
        return plusminus;
        }
    else if (ngrade<=2){
        plusminus+="-";
        return plusminus;
        }
    else{
        return plusminus;
        }
    }

    public static String fgrade(int grade){
        String fgrade="";
        if (grade>=100){
            fgrade = "A+";
            return fgrade;
        }
        else if (grade>=90){
            fgrade = "A"+pm(grade);
            return fgrade;
        }
        else if(grade<90&&grade>=80){
            fgrade ="B"+pm(grade);
            return fgrade;
        }
        else if (grade<80&&grade>=70){
            fgrade = "C"+pm(grade);
            return fgrade;
        }
        else if(grade<70&&grade>=60){
            fgrade = "D"+pm(grade);
            return fgrade;
        } 
        else{
            fgrade ="F";
            return fgrade;
        }
    }
}
