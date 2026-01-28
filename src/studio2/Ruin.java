import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value for start amount (integers only): ");
        int startAmount = in.nextInt();
        System.out.print("Enter value for win chance (as a decimal 0-1): ");
        double winChance = in.nextDouble();
        System.out.print("Enter value for win limit: " );
        double winLimit = in.nextDouble();
        int totalSimulations = 0;
        

    for (int dayCounter = 0; dayCounter < 500; dayCounter++) {
        while ((startAmount < winLimit)&&(startAmount>0)){
        double randomNum = Math.random();
        totalSimulations++;
        if (randomNum < winChance){
            startAmount ++;
            //System.out.println("Win! Current Balance: " + startAmount + ", Spin number: "+totalSimulations);
            }
            else {
                startAmount --;
                //System.out.println("Loss. Current Balance: " + startAmount + ", Spin number: "+totalSimulations);
            }
    }
    if (startAmount == winLimit){
        //System.out.println("Congratulations! You won! Total number of rounds: "+totalSimulations);

    }
        else {
            //System.out.println("Sorry, you lost. Total number of rounds: "+totalSimulations);
        }
        System.out.println("Simulation Day: " + dayCounter + ". Trials Today: " + totalSimulations);
    }
        


}}
