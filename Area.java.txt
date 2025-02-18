/*
Java Code
This program takes a use input as a radius and outputs the circumference and area of the circle
*/

import java.util.*;
class Area{ 

    public static void main(String args[]){
        //initializing the Scanner
        Scanner scanner=new Scanner(System.in);
        double PIE=3.14159;   // PIE variable
        
        System.out.println("Input a Radius");

        double rad=scanner.nextDouble(); //Raduis variable input by user

        System.out.println("Thank you");
        System.out.println("The Radius inputed is:"+ rad);

        double Circum=2*PIE*rad;  //Arithmetic to calculate circumference of the circle
        double Area=PIE*(rad*rad); //Arithmetic to calculate the area of the circle

        System.out.println("The Circumfereance is:"+ Circum);
        System.out.println("The Area is:"+ Area);

        scanner.close(); //closing the scanner
        
    }
}