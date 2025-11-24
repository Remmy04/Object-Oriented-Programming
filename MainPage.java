package oop.group.project;
import java.util.Scanner;

public class MainPage {
    private static boolean isAdmin = false;
    private static String[] features = {
            "2. Information Hub",
            "3. Carbon Footprint Calculator",
            "4. Community Engagement and Collaboration",
            "5. Recent Weather Checker",
            "6. Quiz System",
            "7. Feedback and Rating System"
    };

    public static void setIsAdmin(boolean isAdminUser) {
        isAdmin = isAdminUser;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Green Echoes!");
        System.out.println("Your journey towards a more sustainable lifestyle begins here. Let's make every choice count.");
        System.out.println("Our goal is to empower individuals with knowledge and resources, fostering a deep understanding of climate change mitigation, adaptation strategies, and the importance of early \nwarning systems.");

        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("-------------------------------------------");
            System.out.println("These are the features we provide:");
            System.out.println("1. Login");
            System.out.println("2. Information Hub");
            System.out.println("3. Carbon Footprint Calculator");
            System.out.println("4. Community Engagement and Collaboration");
            System.out.println("5. Recent Weather Checker");
            System.out.println("6. Quiz System");
            System.out.println("7. Feedback and Rating System");
            System.out.println("-------------------------------------------");
            System.out.print("Enter the number of your choice: ");

            if (sc.hasNextInt()) {
                // Read the integer choice
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        UserAuthentication login = new UserAuthentication();
                        login.login();
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        if (choice != 1) {
                            handleLogin(sc);
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        System.out.println("Please enter from 1 to 7!");
                }
            } else {

                sc.next();
                System.out.println("Invalid input. Please enter a valid integer option.");
            }

        } while (choice < 1 || choice > 7);

    }

    private static void handleLogin(Scanner sc) {
        System.out.println("Please login to proceed.");
        UserAuthentication login = new UserAuthentication();
        login.login();
    }

    public static void proceedToFeatures() {
        Scanner sc = new Scanner(System.in);
        outerLoop:
        while (true) {
            String featureChoice;
            int featureNumber = 0;

            while (true) {
                System.out.println("\n-------------------------------------------");

                if (isAdmin) {
                    System.out.println("These are the features available:");
                    for (String feature : features) {
                        System.out.println(feature);
                    }
                } else {
                    System.out.println("These are the features available:");
                    System.out.println("2. Information Hub");
                    System.out.println("3. Carbon Footprint Calculator");
                    System.out.println("4. Community Engagement and Collaboration");
                    System.out.println("5. Recent Weather Checker");
                    System.out.println("6. Quiz System");
                    System.out.println("7. Feedback and Rating System");
                }
                System.out.println("-------------------------------------------");
                System.out.println("Enter 'EXIT' to Logout.");

                System.out.print("Enter the number of your choice: ");

                if (isAdmin) {
                    adminFeatures();
                }

                featureChoice = sc.next();

                if ("EXIT".equalsIgnoreCase(featureChoice)) {
                    System.out.println("Exiting the program...");
                    break outerLoop;
                } else if ("BACK".equalsIgnoreCase(featureChoice)) {
                    break;
                }
                featureNumber = Integer.parseInt(featureChoice);

                switch (featureNumber) {
                    case 2:
                        InformationHub oopinformation = new InformationHub();
                        oopinformation.information();
                        break;
                    case 3:
                        CarbonFootprint oopcarbon = new CarbonFootprint();
                        oopcarbon.carbon();
                        break;
                    case 4:
                        Community oopcommunity = new Community();
                        oopcommunity.comments();
                        break;
                    case 5:
                        Realtime ooprealtime = new Realtime();
                        ooprealtime.weather();
                        break;
                    case 6:
                        quiz oopquiz = new quiz();
                        oopquiz.test();
                        break;
                    case 7:
                        Feedback oopfeedback = new Feedback();
                        oopfeedback.FeedbackandRating();
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
    }







    private static void adminFeatures() {
        Scanner sc = new Scanner(System.in);
        System.out.println("   ");
        System.out.println("\nAdmin Features:");
        System.out.println("8. Edit or Delete Features");
        System.out.print("Enter the number of your choice: ");


        String userInput = sc.next().toUpperCase();
        if ("EXIT".equals(userInput)) {
            System.out.println("Exiting the program...");
            System.exit(0);
        }


        while (!isValidInteger(userInput)) {
            System.out.println("Invalid input. Please enter a valid integer option.");
            userInput = sc.next().toUpperCase();
            if ("EXIT".equals(userInput)) {
                System.out.println("Exiting the program...");
                System.exit(0);
            }
        }

        int adminChoice = Integer.parseInt(userInput);

        if (adminChoice == 8) {
            editOrDeleteFeatures();
        } else if (adminChoice >= 2 && adminChoice <= features.length + 1) {
            int featureIndex = adminChoice - 2;
            switch (featureIndex) {
                case 0:
                    InformationHub oopinformation = new InformationHub();
                    oopinformation.information();
                    break;
                case 1:
                    CarbonFootprint oopcarbon = new CarbonFootprint();
                    oopcarbon.carbon();
                    break;
                case 2:
                    Community oopcommunity = new Community();
                    oopcommunity.comments();
                    break;
                case 3:
                    Realtime ooprealtime = new Realtime();
                    ooprealtime.weather();
                    break;
                case 4:
                    quiz oopquiz = new quiz();
                    oopquiz.test();
                    break;
                case 5:
                    Feedback oopfeedback = new Feedback();
                    oopfeedback.FeedbackandRating();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } else {
            System.out.println("Invalid choice. Please enter a valid option.");
        }
    }


    private static boolean isValidInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static void editOrDeleteFeatures() {
        System.out.println("\nCurrent Features:");
        for (String feature : features) {
            System.out.println(feature);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the feature to edit or delete: ");
        int userChoice = sc.nextInt();
        sc.nextLine();

        int featureNumber = userChoice - 2;

        if (featureNumber >= 0 && featureNumber < features.length) {
            System.out.print("Enter the new name for the feature: ");
            String newFeatureName = sc.nextLine();

            features[featureNumber] = userChoice + ". " + newFeatureName;
            System.out.println("Feature edited successfully." + "\n" + "Type BACK to return.");
        } else {
            System.out.println("Invalid feature number.");
        }
    }




}
