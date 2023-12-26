//Input currency in rupees and output in USD.
import java.util.*;

public class RuppestoUsd {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter repees");
    float rupees=sc.nextFloat();
    float dollars = rupees / 64;
    System.out.println(dollars);
   } 
}
