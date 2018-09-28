import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random rand = new Random();


        int Int = 20;


       double damage1 = Int * 5 * (rand.nextDouble()+0.5);
        double damage2 = Int * 5 * (rand.nextDouble()+0.5);
        double  damage3 = Int * 5 * (rand.nextDouble()+0.5);
        double damage4 = Int * 5 * (rand.nextDouble()+0.5);
        double damage5 = Int * 5 * (rand.nextDouble()+0.5);
        double damage6 = Int * 5 * (rand.nextDouble()+0.5);
        double damage7 = Int * 5 * (rand.nextDouble()+0.5);
        double damage8 = Int * 5 * (rand.nextDouble()+0.5);
        double damage9 = Int * 5 * (rand.nextDouble()+0.5);
        double damage10 = Int * 5 * (rand.nextDouble()+0.5);
      double Finaldamage=damage1+damage2+damage2+damage3+damage4+damage5+damage6+damage7+damage8+damage9+damage10;
        System.out.println();
        System.out.println("Final damage output:  "+Finaldamage+" at 20 Int");





    }
}
