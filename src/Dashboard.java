import java.util.Scanner;

import static java.lang.System.exit;

public class Dashboard {
    private User user;

    Dashboard(){
        this.user = new User();
    }


    public void dashboard(){
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        IssueBook issueBook = new IssueBook();

        String name;
        String id;
        String author;
        String studentName;
        String rollNo;

        int choice = 0;


        do{
            System.out.println("          |#############################|          ");
            System.out.println("          |#          Welcome          #|          ");
            System.out.println("          |#############################|          ");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Show Issued Books");
            System.out.println("5. Clear the history");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n");
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("\n");
                    System.out.println("          |#############################|          ");
                    System.out.println("          |#         Add a Book        #|          ");
                    System.out.println("          |#############################|          ");
                    System.out.println("\n");
                    System.out.println("------------------------------------------------------------------------------------------------------");
//                    System.out.println("\n");

                    System.out.println("Enter the Book_Id : ");
                    id = sc.nextLine();
                    System.out.println("Enter the name of the Book : ");
                    name = sc.nextLine();
                    System.out.println("Enter the name of the Author : ");
                    author = sc.next();

                    book.addBook(id,name,author);
                    break;
                case 2:
                    System.out.println("\n");
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("\n");
                    System.out.println("          |#############################|          ");
                    System.out.println("          |#        Book Register      #|          ");
                    System.out.println("          |#############################|          ");
                    System.out.println("\n");
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("\n");

                    book.showBooks();
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("\n");
                    System.out.println("          |#############################|          ");
                    System.out.println("          |#    Issued Book Register   #|          ");
                    System.out.println("          |#############################|          ");
                    System.out.println("\n");
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("\n");


                    System.out.print("Enter the name of the Student : ");
                    studentName=sc.nextLine();
                    System.out.print("\nEnter the roll No. : ");
                    rollNo=sc.nextLine();
                    System.out.print("\nEnter the Book_Id : ");
                    id = sc.nextLine();
                    System.out.print("\nEnter the name of the Book : ");
                    name = sc.nextLine();
                    System.out.print("\nEnter the name of the Author : ");
                    author = sc.nextLine();

                    issueBook.issueBook(id,name,author,studentName,rollNo);
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("\n");
                    System.out.println("          |#############################|          ");
                    System.out.println("          |#    Issued Book Register   #|          ");
                    System.out.println("          |#############################|          ");
                    System.out.println("\n");
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("\n");
                    issueBook.showIssuedBooks();
                    break;
                case 5:
                    book.clearBookData();
                    issueBook.clearIssuedBookData();
                    break;
                case 6:
                    System.out.println("          |#############################|          ");
                    System.out.println("          |#     Thanks for visit!     #|          ");
                    System.out.println("          |#############################|          ");
                    break;
                default:
                    System.out.println("Enter the valid choice!");
                    break;
            }

        }while(choice != 6);
    }

    public boolean register(){
        Scanner sc = new Scanner(System.in);

        String username;
        String password;
        String confirmPassword;
        System.out.println("          |#############################|          ");
        System.out.println("          |# Library Management System #|          ");
        System.out.println("          |#############################|          ");
        System.out.println("\n");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("          |#############################|          ");
        System.out.println("          |#          Register         #|          ");
        System.out.println("          |#############################|          ");
        System.out.println("\n");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("\n");

        System.out.print("Enter Your Name : ");
        username = sc.nextLine();
        System.out.print("Enter the password : ");
        password = sc.nextLine();
        System.out.print("Confirm the password : ");
        confirmPassword = sc.nextLine();
        boolean flag = this.user.registerUser(username,password,confirmPassword);
        return flag;
    }

    public boolean login(){
        Scanner sc = new Scanner(System.in);
        String username;
        String password;

        System.out.println("\n");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("          |#############################|          ");
        System.out.println("          |#           Login           #|          ");
        System.out.println("          |#############################|          ");
        System.out.println("\n");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("\n");

        System.out.print("Enter Your Name : ");
        username = sc.nextLine();
        System.out.print("Enter the password : ");
        password = sc.nextLine();

        boolean flag = this.user.login(username,password);
        return flag;
    }
}
