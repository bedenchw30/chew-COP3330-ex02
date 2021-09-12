package org.example;
import java.util.Scanner;
public class App {
    public static void main( String[] args )
    {
       System.out.print("What is the input string? ");

       Scanner input = new Scanner(System.in);
       String x = input.nextLine();

       int count = 0;
       for(int i = 0; i < x.length(); i++ ){
           if(x.charAt(i) != ' ')
               count++;
    }
       System.out.println(x + " has " + count + " characters. ");
    }
}
