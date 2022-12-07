import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IssueBookTest {
    @Test
    public void issueBook(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.issueBook("ABC123","Software Engineering","Ahmad","Ali","123456");
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void issueBookWithInvalidStudentName(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.issueBook("ABC123","Software Engineering","Ahmad","ab","123456");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void issueBookWithInvalidStudentName2(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.issueBook("ABC123","Software Engineering","Ahmad","abcdefabcdfjsjsjsjs","123456");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void issueBookWithInvalidStudentRollNumber(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.issueBook("ABC123","Software Engineering","Ahmad","Ali","1234");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void issueBookWithInvalidStudentRollNumber2(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.issueBook("ABC123","Software Engineering","Ahmad","Ali","1234abc");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void issueBookWithInvalidName(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.issueBook("ABC123","Software Engineering Engineering Engineering @","Ahmad","Ali","123456");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void issueBookWithInvalidName2(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.issueBook("ABC123","abc","Ahmad","Ali","123456");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void issueBookWithInvalidAuthorName(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.issueBook("ABC123","Software Engineering","abc","Ali","123456");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void issueBookWithInvalidAuthorName2(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.issueBook("ABC123","Software Engineering","Abcdefghijklmnopqrstuvwxyzlsjlsdlsdls","Ali","123456");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void issueBookWithInvalidAuthorName3(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.issueBook("ABC123","Software Engineering","Ahmad 12345","Ali","123456");
        boolean expected = false;
        assertEquals(expected,actual);
    }


    @Test
    public void test7(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.showIssuedBooks();
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void test8(){
        IssueBook issueBook = new IssueBook();
        boolean actual = issueBook.clearIssuedBookData();
        boolean expected = true;
        assertEquals(expected,actual);
    }


}