import javax.swing.plaf.synth.SynthSeparatorUI;

public class loopstarter {
    public static void main(String[]args){
        square(6);
        rectangle(6, 3);
        rightTriangle(5);
    }
    public static void square(int s){

    
    for (int row = 0; row <s; row++){
        
        for(int col = 0; col<s; col++){
            
            System.out.print("* ");
        }
        System.out.println(); 
    }
        System.out.println();
        System.out.println();
    




}

public static void rectangle(int l, int w) {
    
  

    for (int row = 0; row <w; row++){

        for (int col = 0; col<l; col++){
            System.out.print("* ");
        }
    System.out.println();
   
}



}

public static void rightTriangle(int s){
    System.out.println();
    for(int row = 0; row<s; row++){
        for (int col = 0; col<row+1; col++){
            System.out.print("* ");

        }
        System.out.println();
    }
}

}
