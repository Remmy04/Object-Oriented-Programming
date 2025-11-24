package oop.group.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author justinlim
 */
public class Community {

    
   public static void comments(){ //method name is comments
        
   while (true){   
    System.out.println("\nWelcome to the comment/forum section!");
        System.out.println("Here, you can converse with other members and asks questions from experts.");
        System.out.println("Type 'Continue' to continue into the comment/forum section.");
        System.out.println("Type 'Back' to go back to Main Page.");
        Scanner cont = new Scanner(System.in);
        String x  = cont.nextLine();
        
        
        
      Scanner sc = new Scanner(System.in);
      List<String> comments = new ArrayList<String>();
      if (x.equalsIgnoreCase("Continue")){
      
  
      System.out.println("\nForum:");
                  System.out.println("John Doe (expert) commented:\n "
              + "Hi everybody! My name is John Doe and I will be answering any of your questions related in this field.");

      while (true){
          

            System.out.print("Type 'Back' to go back.\nEnter Your Comment:");
            String comment = sc.nextLine();
            
            
           if ("back".equalsIgnoreCase(comment)){
               
               break;
           }
           
               
           
           System.out.println("John Doe (expert) commented:\n "
              + "Hi everybody! My name is John Doe and I will be answering any of your questions related in this field.");
           comments.add(comment); //add into array list
           displayComments(comments); //displays the contents
          
      }    
      }
      else if (x.equalsIgnoreCase("Back")){
          break;
      }
      else {
          System.out.println("You have entered an invalid choice. Sending user back to main menu.");
          break;
      }
      
   }
    }
    private static void displayComments(List<String> comments) {
        System.out.println("\nYour Comments:");
        for (String comment : comments) {
            System.out.println("You commented: " + comment);
        }
        System.out.println();
    }  
        
}