//Ayush Verma
//4B

import java.util.*;

public class Casino
{
    Scanner console = new Scanner(System.in);
    Random spin = new Random();

    private Player player;
    private Roulette game;
    private String s;

    public Casino()
    {
        player = new Player("Ayush", 10000.0);
        game = new Roulette();
    }

    public void play()
    {
        Scanner console = new Scanner(System.in);

        double bet = 0.00;
        double result = 0.00;
        String input = "";

        do
        {
            System.out.print(player.getName() + ", you have " + player.getWallet() + " , how much would you like to bet? --> ");
            bet = console.nextDouble();

            result = game.placeBet(bet);

            if (result > 0)
            {
                System.out.println("\nYou won " + result + ". Nice!");
            }
            else
            {
                System.out.println("\nYou lost " + result * -1 +", get better at life...");
            }

            console.nextLine();

            player.updateWallet(result);
            System.out.println("\nYou actually have some money now, current balance --> $" + player.getWallet() +" in your wallet.");

            if (player.broke())
            {
                System.out.println("Bro, just leave... idk what else to say");
                return;
            }
            System.out.println("Bet again? (Yes or No) -> ");
            input= console.nextLine();
        } while(!input.equalsIgnoreCase("N"));

    } 
}
        