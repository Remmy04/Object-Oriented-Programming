package oop.group.project;
import java.util.Scanner;
/**
 *
 * @author justinlim
 */
public class quiz {
    public void test(){
        
        String [] questions = 
        {"Human activities, such as burning fossil fuels, contribute to the release of greenhouse gases into the atmosphere.",
            "The natural greenhouse effect is necessary for maintaining a habitable temperature on Earth.",
            "Climate refers to short-term atmospheric conditions, while weather involves long-term patterns.",
            "The primary goal of climate change mitigation is to increase the emission of greenhouse gases into the atmosphere.",
            "Sustainable transportation aims to rely on depleting natural resources like coal, oil, and gas.",
            "What are the primary greenhouse gases responsible for global warming?\nA) Oxygen\nB) Nitrogen\nC) Carbon Dioxide (CO2), Methane (CH4), Nitrous Oxide (N2O)\nD) Helium",
            "What is the main goal of climate change education?\nA) Promoting deforestation\nB) Fostering sustainable practices\nC) Ignoring global citizenship\nD) Encouraging pollution",
            "Which organization launched the UNESCO Climate Change Education for Sustainable Development program?\nA) NASA\nB) Citizens’ Climate Education\nC) UNESCO\nD) Public Awareness Campaigns",
            "What is the primary goal of mitigating climate change?\nA) Increasing greenhouse gas emissions\nB) Adapting to climate change\nC) Lessening the impact of climate change\nD) Enhancing atmospheric pollution",
            "What is a crucial component of climate-resilient agriculture (CRA)?\nA) Depleting natural resources\nB) Promoting hunger and poverty\nC) Utilizing resource conservation technologies\nD) Ignoring climatic stress"
        };
        
        String [] answers = {"true", "true", "false", "false", "false", "C", "B", "C", "C", "C"};
        Scanner scanner = new Scanner(System.in); // Scanner for start stop
        Scanner sc = new Scanner (System.in); // Scanner for quiz
        
        while (true) {
        System.out.println("\nAre you ready for the quiz?");
        System.out.println("Type 'Continue' to start the quiz.");
        System.out.println("Type 'Back' to go back to the Main Page.");
        String x = scanner.next();
        int points = 0;
        
        if (x.equalsIgnoreCase("continue")){
        for(int i = 0; i<10; i++) {
            System.out.println("\nQuestion:\n" + questions[i]);
            
            if (i>=5 && i<10){
                System.out.print("Your answer:");
                String uranswer = sc.next().toUpperCase(); // takes input first before proceeding to next code
                
                    if (uranswer.equals(answers[i])) {
                        System.out.println("You are correct!");
                        points++;
                    }
                    else {
                        System.out.println("You are wrong!");
                    }
                    }
                    
            else {
                System.out.println("True or False?");
                String uranswer = sc.next().toLowerCase();
                if (uranswer.equals(answers[i])) {
                    System.out.println("You are correct!");
                    points++;
                }
                else {
                    System.out.println("You are wrong!");
                }
            }
            }
        System.out.println("\nCongratulations! You scored: " + points + "/10");
        System.out.println("Type 'BACK' to go back to the main page");
        String y = sc.next();
        
        if (y.equalsIgnoreCase("BACK")){
            break;// back command
        }
        else {
        System.out.println("You entered an invalid choice. Sending user back.");
        break;// back command 
        }
        }
        
            
            
        else if ("BACK".equalsIgnoreCase(x)){
        break;
        
        }
        else {
        System.out.println("You entered an invalid choice. Sending user back.");
        break;// back command
        }
        
        
        
        
        
        }
    }
}