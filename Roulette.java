//Ayush Verma
//4B

import java.util.*;

public class Roulette
{
    Scanner console = new Scanner(System.in);
    Random spin = new Random();

    public double placeBet(double bet)
    {
        System.out.println("You can choose 1 to bet on low, 2 to bet on high, and 3 to bet on a specific number.");
        
        int choice = console.nextInt();
        int num = spin.nextInt(37);
        if(choice == 3)
        {
            System.out.print("Enter a value to place your bet on --> ");
            int value = console.nextInt();
            if(value == num)
            {
                return bet * 35;
            }
        }
        
        System.out.println("The result of the spin was --> " + num);
        if(choice == 1 && num <= 18 && num >= 1)
        {
            return bet * 2;
        }
        else if (choice == 2 && num <= 36 && num >= 19)
        {
            return bet * 2;
        }
        return bet * -1;
    }
}