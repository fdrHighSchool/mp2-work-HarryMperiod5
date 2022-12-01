public class CountQuarters {
    public static void main (String []args) {
    System.out.println("You will have " + countQuarters(1265) + "quarters.");

    }
    public static int countQuarters(int cents){
        String scent = "" + cents;
        scent = scent.substring(scent.length()-2);

        return Integer.parseInt(scent)/25;
    }
}
