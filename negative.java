import java.util.*;
public class negative{
    public static void main(String[]args){
        int hi1 = (int)(7*Math.random())-3;
        int hi2 = (int)(7*Math.random())-3;
        int hi3 = (int)(7*Math.random())-3;
        int hi4 = (int)(7*Math.random())-3;
        int ultimatehi = hi1 +hi2 +hi3+hi4;
        System.out.println("First number is " + hi1);
        System.out.println("Second number is "+hi2);
        System.out.println("Third number is "+hi3);
        System.out.println("Fourth number is "+hi4);
        System.out.println("The sum of the 4 numbers is " + ultimatehi);
        if(ultimatehi<0){
            System.out.println("Negative");
        }else{
            System.out.println("Not Negative");
        }
    }
}