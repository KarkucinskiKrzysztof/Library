
package controller;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;
import model.Book;
import model.User;


public class Logic {

    public List<User> selectCzytelnicy(User user) {

        String imie, nazwisko, pesel, miasto, ulica, command;

        imie = user.getImie();
        nazwisko = user.getNazwisko();
        pesel = user.getPesel();
        miasto = user.getMiasto();
        ulica = user.getUlica();

        Stack stosTablica = new Stack();
        Stack stosCommand = new Stack();
        if (!imie.isEmpty()) {
            stosTablica.push("imie");
            stosCommand.push(imie);
        }
        if (!nazwisko.isEmpty()) {
            stosTablica.push("nazwisko");
            stosCommand.push(nazwisko);
        }
        if (!pesel.isEmpty()) {
            stosTablica.push("pesel");
            stosCommand.push(pesel);
        }
        if (!miasto.isEmpty()) {
            stosTablica.push("miasto");
            stosCommand.push(miasto);
        }
        if (!ulica.isEmpty()) {
            stosTablica.push("ulica");
            stosCommand.push(ulica);
        }

        command = "SELECT * FROM czytelnicy";
        try {
            if (stosCommand.empty()) {
                command = "SELECT * FROM czytelnicy";
            } else if (stosCommand.size() == 1) {
                command = "SELECT * FROM czytelnicy WHERE "
                        + stosTablica.pop() + " LIKE '" + stosCommand.pop() + "%' ";
            } else {
                command = "SELECT * FROM czytelnicy WHERE "
                        + stosTablica.pop() + " LIKE '" + stosCommand.pop() + "%' ";
                while (!stosCommand.isEmpty()) {
                    command += " and " + stosTablica.pop() + " LIKE '" + stosCommand.pop() + "%' ";
                }
            }
        } catch (EmptyStackException e) {
        }
        DataBaseController db = new DataBaseController();
        return db.selectCzytelnicy(command);

    }

    public List<Book> selectKsiazki(Book ksiazka) {

        String tytul, autor, wydawnictwo, command, isbn, rok_wydania;

        tytul = ksiazka.getBookTitle();
        autor = ksiazka.getBookAuthor();
        wydawnictwo = ksiazka.getBookWydawnictwo();
        isbn = ksiazka.getBookISBN();
        rok_wydania = ksiazka.getBookRokWydania();

        Stack stosTablica = new Stack();
        Stack stosCommand = new Stack();
        if (!tytul.isEmpty()) {
            stosTablica.push("tytul");
            stosCommand.push(tytul);
        }
        if (!autor.isEmpty()) {
            stosTablica.push("autor");
            stosCommand.push(autor);
        }
        if (!wydawnictwo.isEmpty()) {
            stosTablica.push("wydawnictwo");
            stosCommand.push(wydawnictwo);
        }
        if (!isbn.isEmpty()) {
            stosTablica.push("isbn");
            stosCommand.push(isbn);
        }
        if (!rok_wydania.isEmpty()) {
            stosTablica.push("rok_wydania");
            stosCommand.push(rok_wydania);
        }
        
        command = "SELECT * FROM ksiazki";
        try {
            if (stosCommand.empty()) {
                command = "SELECT * FROM ksiazki";
            } else if (stosCommand.size() == 1) {
                command = "SELECT * FROM ksiazki WHERE "
                        + stosTablica.pop() + " LIKE '" + stosCommand.pop() + "%' ";
            } else {
                command = "SELECT * FROM ksiazki WHERE "
                        + stosTablica.pop() + " LIKE '" + stosCommand.pop() + "%' ";
                while (!stosCommand.isEmpty()) {
                    command += " and " + stosTablica.pop() + " LIKE '" + stosCommand.pop() + "%' ";
                }
            }
        } catch (EmptyStackException e) {
        }
        DataBaseController db = new DataBaseController();
        return db.selectKsiazki(command);

    }

}
