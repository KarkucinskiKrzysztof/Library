
package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Book {

    private final SimpleStringProperty bookTitle;
    private final SimpleStringProperty bookAuthor;
    private final SimpleStringProperty bookISBN;
    private final SimpleIntegerProperty bookID;
    private final SimpleStringProperty bookWydawnictwo;
    private final SimpleStringProperty bookRokWydania;

    public Book(String bookTitle, String bookAuthor, String bookISBN, int bookID, String bookWydawnictwo, String bookRokWydania) {
        this.bookTitle = new SimpleStringProperty(bookTitle);
        this.bookAuthor = new SimpleStringProperty(bookAuthor);
        this.bookISBN = new SimpleStringProperty(bookISBN);
        this.bookID = new SimpleIntegerProperty(bookID);
        this.bookWydawnictwo = new SimpleStringProperty(bookWydawnictwo);
        this.bookRokWydania = new SimpleStringProperty(bookRokWydania);
    }
    public Book(String bookTitle, String bookAuthor, String bookISBN, String bookWydawnictwo, String bookRokWydania) {
        this.bookTitle = new SimpleStringProperty(bookTitle);
        this.bookAuthor = new SimpleStringProperty(bookAuthor);
        this.bookISBN = new SimpleStringProperty(bookISBN);
        this.bookID = new SimpleIntegerProperty();
        this.bookWydawnictwo = new SimpleStringProperty(bookWydawnictwo);
        this.bookRokWydania = new SimpleStringProperty(bookRokWydania);
    }

    public String getBookTitle() {
        return bookTitle.get();
    }

    public String getBookAuthor() {
        return bookAuthor.get();
    }

    public String getBookISBN() {
        return bookISBN.get();
    }

    public int getBookID() {
        return bookID.get();
    }

    public String getBookWydawnictwo() {
        return bookWydawnictwo.get();
    }

    public String getBookRokWydania() {
        return bookRokWydania.get();
    }
      public void setBookTitle(String s) {
         bookTitle.set(s);
    }

    public void setBookAuthor(String s) {
         bookAuthor.set(s);
    }

    public void setBookISBN(String i) {
         bookISBN.set(i);
    }

    public void setBookID(int i) {
         bookID.set(i);
    }

    public void setBookWydawnictwo(String i) {
         bookWydawnictwo.set(i);
    }

    public void setBookRokWydania(String i) {
         bookRokWydania.set(i);
    }
    @Override
    public String toString(){
        return "ID: ["+ bookID + "]" + "Tytuł: " + bookTitle + " wydana w: " + bookRokWydania;
    }
}
