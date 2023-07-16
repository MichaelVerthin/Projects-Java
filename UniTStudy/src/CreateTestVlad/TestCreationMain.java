package CreateTestVlad;

import java.util.Scanner; // Import the Scanner class

public class TestCreationMain {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); // Clear command
        Database db = new Database();
        db.addQuestion("1+1");
        db.addAnswer("2", 1, 0);
        db.addQuestion("What is my name?");
        db.addAnswer("Michael", 1, 1);
        db.addAnswer("Vlad", 0, 1);
        db.addAnswer("11", 0, 0);
        db.addAnswer("3", 0, 0);
        welcomePage(db);
    }

    public static void welcomePage(Database db) {
        System.out.println("\033[H\033[2J"); // Clear command
        Scanner scan = new Scanner(System.in); // Initialize the Scanner
        System.out.println("\033[45m+-----------------------------------+");
        System.out.println("|    Welcome to the Test Creator    |");
        System.out.println("+-----------------------------------+");
        System.out.println("| 1. Display all questions          |");
        System.out.println("| 2. Add an Answer to a question    |");
        System.out.println("| 3. Add a new Question             |");
        System.out.println("| 4. Update a Question              |");
        System.out.println("| 5. Update an Answer               |");
        System.out.println("| 6. Delete an Answer to a question |");
        System.out.println("| 7. Delete a question              |");
        System.out.println("| 8. Create a new test              |");
        System.out.println("+-----------------------------------+");
        System.out.print("|\u001B[0m Please choose an action: ");
        int ans = scan.nextInt();
        switch (ans) {
            case 1:
                displayQ(db);
                try {
                    System.in.read();
                    scan.nextLine();
                } catch (Exception e) {
                }
                welcomePage(db);
            case 6, 7, 8:
                System.out.println("\033[H\033[2J"); // Clear command
                System.out.println("\033[41m+-----------------------------------+");
                System.out.println("|     sorry this feature is not     |");
                System.out.println("|  available yet, please check back |");
                System.out.println("|           in the future           |");
                System.out.println("+-----------------------------------+");
                System.out.println("|      Click anything to go back    |");
                System.out.println("+-----------------------------------+\u001B[0m");
                try {
                    System.in.read();
                    scan.nextLine();
                } catch (Exception e) {
                }
                welcomePage(db);
            case 2:
                addAnswer(db);
                welcomePage(db);
        }
    }

    public static void addAnswer(Database db) {
        Scanner scan = new Scanner(System.in); // Initialize the Scanner
        System.out.println("\033[H\033[2J"); // Clear command
        System.out.println("\033[45m+-----------------------------------+");
        System.out.println("|    Welcome to the Test Creator    |");
        System.out.println("+-----------------------------------+");
        System.out.println("| 1. Display all questions          |");
        System.out.println("|\033[1;37m  2. Add an Answer to a question\u001B[0m\033[45m   |");
        System.out.println("| 3. Add a new Question             |");
        System.out.println("| 4. Update a Question              |");
        System.out.println("| 5. Update an Answer               |");
        System.out.println("| 6. Delete an Answer to a question |");
        System.out.println("| 7. Delete a question              |");
        System.out.println("| 8. Create a new test              |");
        System.out.println("+-----------------------------------+");
        System.out.print("|\u001B[0m Please type the new Answer: ");
        // scan.nextLine();
        String A = scan.nextLine();
        System.out.print("\033[45m|\u001B[0m Is that Answer correct? (y/n) ");
        String yorn = scan.next();
        int isRight;
        if (yorn.equals("y"))
            isRight = 1;
        else
            isRight = 0;
        System.out.print("\033[45m|\u001B[0m What Question is that answer for: ");
        int Q = scan.nextInt();
        db.addAnswer(A, isRight, Q);
        System.out.println("\033[H\033[2J"); // Clear command
        System.out.println("\033[0;102m\033[1;30m+-----------------------------------+");
        System.out.println("|   Answer was added successfully   |");
        System.out.println("+-----------------------------------+\u001B[0m");
        try {
            System.in.read();
            scan.nextLine();
        } catch (Exception e) {
        }
        welcomePage(db);
    }

    public static void displayQ(Database db) {
        Scanner scan = new Scanner(System.in); // Initialize the Scanner
        System.out.println("\033[H\033[2J"); // Clear command
        System.out.println("\033[45m+-----------------------------------+");
        System.out.println("|    Welcome to the Test Creator    |");
        System.out.println("+-----------------------------------+");
        System.out.println("|\033[1;37m  1. Display all questions\u001B[0m\033[45m         |");
        System.out.println("| 2. Add an Answer to a question    |");
        System.out.println("| 3. Add a new Question             |");
        System.out.println("| 4. Update a Question              |");
        System.out.println("| 5. Update an Answer               |");
        System.out.println("| 6. Delete an Answer to a question |");
        System.out.println("| 7. Delete a question              |");
        System.out.println("| 8. Create a new test              |");
        System.out.println("+-----------------------------------+\u001B[0m\n");
        db.displayQuestion();
    }
}
