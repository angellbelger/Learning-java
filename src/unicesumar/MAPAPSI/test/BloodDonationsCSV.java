package unicesumar.MAPAPSI.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BloodDonationsCSV {

    private static final String DELIMITER = ",";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Path: ");
        String filePath = scanner.nextLine();

        try {
            List<String[]> donations = readCSVFile(filePath);

            int choice;
            do {
                displayMenu();
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline after the number

                switch (choice) {
                    case 1:
                        displayContent(donations);
                        break;
                    case 2:
                        addDonation(scanner, donations);
                        saveCSVFile(filePath, donations);
                        break;
                    case 3:
                        deleteDonation(scanner, donations);
                        saveCSVFile(filePath, donations);
                        break;
                    case 0:
                        System.out.println("Closing the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }

            } while (choice != 0);

        } catch (IOException e) {
            System.err.println("Error manipulating the file: " + e.getMessage());
        }
    }


    private static List<String[]> readCSVFile(String filePath) throws IOException {
        List<String[]> donations = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                donations.add(line.split(DELIMITER));
            }
        }

        return donations;
    }


    private static void displayContent(List<String[]> donations) {

        for (String[] donation : donations) {
            System.out.println(String.join(DELIMITER, donation));
        }
        System.out.println("--------------------------------------------");
    }


    private static void addDonation(Scanner scanner, List<String[]> donations) {
        System.out.println("Enter details for the new donation:");

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Donor Name: ");
        String donorName = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Birthdate (YYYY-MM-DD): ");
        String birthdate = scanner.nextLine();

        System.out.print("Blood Type: ");
        String bloodType = scanner.nextLine();

        System.out.print("Donated Volume: ");
        String donatedVolume = scanner.nextLine();

        donations.add(new String[]{id, donorName, cpf, birthdate, bloodType, donatedVolume});
    }


    private static void deleteDonation(Scanner scanner, List<String[]> donations) {
        System.out.print("Enter the ID of the donation to be deleted: ");
        String idToDelete = scanner.nextLine();

        donations.removeIf(donation -> donation[0].equals(idToDelete));
    }


    private static void saveCSVFile(String filePath, List<String[]> donations) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.newLine();

            for (String[] donation : donations) {
                writer.write(String.join(DELIMITER, donation));
                writer.newLine();
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nBLOOD~~~~~~~~~~~~~~");
        System.out.println("\nChoose an option:");
        System.out.println("1 | List of Donations");
        System.out.println("2 | Add a new donation");
        System.out.println("3 | Delete a donation");
        System.out.println("0 | Close the program");
        System.out.print("Option: ");
    }
}
