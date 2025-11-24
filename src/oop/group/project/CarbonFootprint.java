package oop.group.project;
import java.util.Scanner;

public class CarbonFootprint {


    public static void carbon() { 
        while (true) {
        
        Scanner sc = new Scanner(System.in);
        
        // Introduction and advantages
        System.out.println("\nWhat is carbon footprint?\nCarbon footprint is the sum of greenhouse gases emitted such as carbon dioxide and methane generated directly or indirectly by human's actions and other contributing activities.");
        System.out.println("");
        System.out.println("Advantage of walking ro reduce carbon footprint:");
        System.out.println("Reduce air pollution to reduce the effects of climate change\nImprove health especially minimise respiratory problems\nMaintains biodiversity");
        System.out.println("");
        
        // Basic understanding of how the calculation works
        System.out.println("Note: How carbon footprints reduced by walking is calculated:");
        System.out.println("1 footstep is equivalent to 0.0007576km (estimated)");
        System.out.println("The more the footsteps count, the more the distance, and the more the carbon footprints are reduced");
        System.out.println("");
        
        // Calculation
        System.out.println("The calculation of the amount of carbon footprint reduced by walking.");
        
        System.out.println("Enter your footsteps of the day");
        
        System.out.println("Enter 'BACK' to go back to the main page");
        String userInput = sc.next();
        
        if ("BACK".equalsIgnoreCase(userInput)) {
                break;
            }
        
        int footsteps = Integer.parseInt(userInput);
        
        System.out.println("");
        
        double distanceTravelled = footsteps / 1320.0;
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Your distance travelled: " + distanceTravelled + "km");
        
        System.out.println("");
        
        // the emissions conversion factors per kilometer for car generally
        double averageCarWithPetrol = 0.17431;
        
        double calculation1 = averageCarWithPetrol * distanceTravelled;
        
        System.out.println("Carbon footprint reduced you have contributed for the day: " + calculation1 + " Kg CO2e");
        System.out.println("------------------------------------------------------------------------------------------");
    }
    
}
}
