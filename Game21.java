import java.util.*;
public class Game21 {
    public static void main(String[]args){
        int card1 = (int)(10*Math.random())+1;
        int card2 = (int)(10*Math.random())+1;
        int card3 = (int)(10*Math.random())+1;
        int sum;
        String anothercard;
        sum=card1+card2;

        System.out.println("Your first card is "+card1);
        System.out.println("Your second card is "+card2);
        System.out.println("Your sum is "+sum);

        Scanner input = new Scanner(System.in);

        System.out.print("Do you want another card? Y/N: ");
        anothercard = input.next();

        if (anothercard=="Y"||anothercard=="y"){
            sum=card1+card2+card3;
            System.out.println("Your third card is "+card3);
            System.out.println("Your new sum is "+sum);

        }
        int dealer1 = (int)(10*Math.random())+1;
        int dealer2 = (int)(10*Math.random())+1;
        int dealer3 = (int)(10*Math.random())+1;
        int dealersum = dealer1+dealer2+dealer3;

        System.out.println("My first card is "+dealer1);
        System.out.println("My second card is "+dealer2);
        System.out.println("My third card is "+dealer3);
        System.out.println("My sum is "+dealersum);
        if (sum>21){
            System.out.println("You busted! You lose.");
        }
        else if(dealersum>21){
            System.out.println("I busted! You win.");
        }
        else if(sum>dealersum){
            System.out.println("You have a higher sum than me. You win!");
        }
        else if(sum<dealersum){
            System.out.println("I have a higher sum than you. You lose.");
        }
        else{
            System.out.println("Tie.");
        }
    }
}
