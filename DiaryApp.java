// import java.io.FileReader;
// public class hello {
//     public static void main(String[] args) {
//         // File file = new File("data.txt"); // current folder me file ka reference
//          try {       
//         //  FileWriter writer=new FileWriter("data.txt",true);
//         FileReader reader=new FileReader("data.txt");
//         int ch;
//         while ((ch = reader.read()) != -1) {  // -1 = end of file
//             System.out.print((char) ch);
//         }
//         //  System.out.println(writer);
//         //  writer.write("hello namste file created...!! new data");
//         //  writer.close();  // IMPORTANT ✔   
//          } catch (Exception e) {
//          }
//         // try {
//         //     if (file.createNewFile()) {
//         //         System.out.println("New file created: " + file.getName());
//         //     } else {
//         //         System.out.println("File already exists: " + file.getName());
//         //     }
//         //     System.out.println("Absolute path: " + file.getAbsolutePath());
//         //     System.out.println("Can read? " + file.canRead());
//         //     System.out.println("Can write? " + file.canWrite());
//         //     System.out.println("File size (bytes): " + file.length());
//     }
// }



import java.io.*;
import java.util.Scanner;

public class DiaryApp {

    static String fileName = "notes.txt";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("====== WELCOME TO DIARY APP ======");
        fileCreate(); // Ensure file exists
        
        while (true) {
            System.out.println("\n1. Add Note");
            System.out.println("2. Read Notes");
            System.out.println("3. Search Notes");
            System.out.println("4. Delete All Notes");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                    addNote();
                    break;
                case 2:
                    readNotes();
                    break;
                case 3:
                    searchNotes();
                    break;
                case 4:
                    deleteNotes();
                    break;
                case 5:
                    System.out.println("Thank you for using Diary App. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // 1️⃣ Create File If Not Exists
    static void fileCreate() {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Diary file created: " + fileName);
            }
        } catch (Exception e) {
            System.out.println("Error creating file.");
        }
    }
  
    // 2️⃣ Add Note
    static void addNote() {
        try {
            System.out.println("Write your note below:");
            String note = sc.nextLine();

            FileWriter writer = new FileWriter(fileName, true);
            writer.write(note + "\n");
            writer.close();

            System.out.println("✔ Note added successfully!");

        } catch (Exception e) {
            System.out.println("Error writing to diary.");
        }
    }

    // 3️⃣ Read All Notes
    static void readNotes() {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            boolean empty = true;

            System.out.println("\n====== ALL NOTES ======");

            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
                empty = false;
            }

            if (empty) {
                System.out.println("No notes found.");
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error reading notes.");
        }
    }

    // 4️⃣ Search Note by Keyword
    static void searchNotes() {
        try {
            System.out.print("Enter keyword to search: ");
            String keyword = sc.nextLine().toLowerCase();

            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            boolean found = false;

            System.out.println("\n====== SEARCH RESULTS ======");

            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(keyword)) {
                    System.out.println("✔ " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No matching notes found.");
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error searching notes.");
        }
    }

    // 5️⃣ Delete All Notes (Clear File)
    static void deleteNotes() {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("");   // Empty file
            writer.close();

            System.out.println("✔ All notes deleted successfully!");

        } catch (Exception e) {
            System.out.println("Error deleting notes.");
        }
    }
}
