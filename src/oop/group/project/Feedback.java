package oop.group.project;
import java.util.Scanner;

public class Feedback {
    
    public static void FeedbackandRating() {
        while (true) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nIn order for us to enhance your experience on using our application, we would like you to give us feedback so we can improve better.\n");
        
        System.out.println("Enter your feedback here:");
        System.out.println("Enter 'BACK' to go back to Main Page");
        
        String feedback = sc.nextLine();
        
        if ("BACK".equalsIgnoreCase(feedback)) {
                break;
            }
        
        System.out.println("\nHow much would you like to rate our application\nNote:Please rate between 1 to 5");
        int ratings = sc.nextInt();
        
        if (ratings == 1) {
            System.out.println("Very poor");
        } else if (ratings == 2) {
            System.out.println("poor");
        } else if (ratings == 3) {
            System.out.println("neutral");
        } else if (ratings == 4) {
            System.out.println("good");
        } else if (ratings == 5) {
            System.out.println("Very good");
        } else
            System.out.println("Invalid");
        
       
        System.out.println("\nThank you for your feedback.");
        
    }
    
}
}
