import java.util.*;/*
Name: Tay Ho
CptS 233: MicroAssignment #1
Date: 08/31/20
gitRepo url:https://github.com/Talden-Key/Micro-Assignment1.git
*/
public class Main{
    

    public static void main(String[] args) {
        int lengthInput;
        int widthInput;
        int Cost;

        // creat object type carpetcalculor 
        CarpetCalculator carpetCalculator = new CarpetCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bovine Carpet Corp");
        System.out.println("We only sell one type one price carpet of 8$/sprtft.");
        System.out.println("What is the length and width of the area you want to cover with carpet?");
        System.out.println("Length (meter): ");
        lengthInput = scanner.nextInt();
        System.out.println("Width (meter): ");
        widthInput = scanner.nextInt();
        
        // Calculate the cost
        Cost = carpetCalculator.RoomCarpet(lengthInput, widthInput);
        System.out.println("Here is your estimate cost: ");
        System.out.println("$ " + Cost);
    }
}
