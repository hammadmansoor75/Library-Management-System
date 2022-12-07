import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IssueBook {
    private String id;
    private String name;
    private String author;
    private String studentName;
    private String rollNo;
    private String issueDate;
    File issuedBookRegister;

     IssueBook() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String today = formatter.format(date);
        this.issueDate = today;
         try {
             issuedBookRegister = new File("issuedBookRegister.txt");
             if (issuedBookRegister.createNewFile()) {
             }
         } catch (IOException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
    }

    public boolean issueBook(String id, String name, String author, String studentName,String rollNo){
        this.id = id;
        this.name = name;
        this.rollNo=rollNo;
        this.author = author;
        this.studentName = studentName;
        boolean flag = false;
        try {
            FileWriter fileWriter = new FileWriter("issuedBookRegister.txt",true);
            fileWriter.write("Roll No. : "+this.rollNo+"\n");
            fileWriter.write("Student : "+this.studentName+"\n");
            fileWriter.write("Id : " + this.id + "\n" );
            fileWriter.write("Name : " +this.name + "\n" );
            fileWriter.write("Author : " +this.author + "\n" );
            fileWriter.write("Issue Date : " +this.issueDate + "\n" );
            flag = true;
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to write in this file");
            throw new RuntimeException(e);
        }
        return flag;
    }

    public boolean showIssuedBooks(){
         boolean flag = false;
        try {
            Scanner sc = new Scanner(issuedBookRegister);
            int count = 1;
            while (sc.hasNextLine()){
                System.out.println("-------------------------");
                System.out.println("Sr No. : " + count);
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                count++;
            }
            System.out.println("------------------------------");
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        }
        return flag;
    }

    public boolean clearIssuedBookData(){
         if(issuedBookRegister.delete()){
             try {
                 issuedBookRegister = new File("issuedBookRegister.txt");
                 if (issuedBookRegister.createNewFile()) {
                 }
             } catch (IOException e) {
                 System.out.println("An error occurred.");
                 e.printStackTrace();
             }
             return true;
         }
         else{
             return false;
         }
    }



}
