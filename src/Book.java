public class Book {
    //attributes
    String title;
    int yearOfPublishing;
    long iSBNNumber;
    String authorName;

    public static void main(String[] args) {

        Book book =new Book();
        System.out.println("book.title = " + book.title);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.yearOfPublishing = " + book.yearOfPublishing);
        System.out.println("book.iSBNNumber = " + book.iSBNNumber);

        book.title = "complete reference 12th Edition";
        book.authorName = "Herbert Schildth";
        book.yearOfPublishing =2021;
        book.iSBNNumber = 1234567890123L;

        System.out.println("book.title = " + book.title);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.yearOfPublishing = " + book.yearOfPublishing);
        System.out.println("book.iSBNNumber = " + book.iSBNNumber);





    }
}
