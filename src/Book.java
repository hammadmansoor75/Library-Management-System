import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Book {
    private String id;
    private String name;
    private String author;
    File bookRegister;

    Book() {
        try {
            bookRegister = new File("bookRegister.txt");
            if (bookRegister.createNewFile()) {
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean addBook(String id, String name, String author){
        this.id = id;
        this.name = name;
        this.author =author;
        boolean flag = false;
        try {
            FileWriter fileWriter = new FileWriter("bookRegister.txt ");
            fileWriter.write("Id : " + this.id + "\n" );
            fileWriter.write("Name : " +this.name + "\n" );
            fileWriter.write("Author : " +this.author + "\n" );
            flag = true;
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to write in this file");
            throw new RuntimeException(e);
        }
        return flag;
    }

    public boolean showBooks(){
        boolean flag = false;
        try {
            Scanner sc = new Scanner(bookRegister);
            int count = 1;
            while (sc.hasNextLine()){
                System.out.println("---------------------");
                System.out.println("Sr No. : " + count);
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                count++;
            }
            System.out.println("--------------------------");
            flag = true;
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        }
        return flag;
    }

    public boolean clearBookData(){
        if(bookRegister.delete()){
            try {
                bookRegister = new File("bookRegister.txt");
                if (bookRegister.createNewFile()) {
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

