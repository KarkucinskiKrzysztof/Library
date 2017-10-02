package View;



import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import model.Book;
import controller.DataBaseController;

class xxEditBook {




    public static void edit(Book selectedBook) {   
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Edycja użytkownika");

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(11,11,11,11));
        layout.setVgap(10);
        layout.setHgap(10);



        Label label1 =new Label("Podaj Tytuł: ");
        GridPane.setConstraints(label1,0,0);
        TextField imputTytul = new TextField(selectedBook.getBookTitle());
        imputTytul.setPromptText("Tytuł");
        GridPane.setConstraints(imputTytul,1,0);

        Label label2 =new Label("Podaj Autora: ");
        GridPane.setConstraints(label2,0,1);
        TextField imputAutor = new TextField(selectedBook.getBookAuthor());
        imputAutor.setPromptText("Nazwisko");
        GridPane.setConstraints(imputAutor,1,1);

        Label label3 =new Label("Podaj Wydawnictwo:");
        GridPane.setConstraints(label3,0,2);
        TextField imputWydawnictwo = new TextField(selectedBook.getBookWydawnictwo());
        imputWydawnictwo.setPromptText("Wydawnictwo");
        GridPane.setConstraints(imputWydawnictwo,1,2);

        Label label4 =new Label("Podaj ISBN:");
        GridPane.setConstraints(label4,0,3);
        TextField imputISBN = new TextField(selectedBook.getBookISBN());
        imputISBN.setPromptText("ISBN");
        GridPane.setConstraints(imputISBN,1,3);

        Label label5 =new Label("Podaj Rok Wydania");
        GridPane.setConstraints(label5,0,4);
        TextField imputRokWydania = new TextField(selectedBook.getBookRokWydania());
        imputRokWydania.setPromptText("Ulica");
        GridPane.setConstraints(imputRokWydania,1,4);

        Button edit = new Button("Edytuj Książkę");
        edit.setOnAction(e-> 
        {
            if (!imputTytul.getText().isEmpty()&&!imputAutor.getText().isEmpty()&&!imputWydawnictwo.getText().isEmpty()&&!imputISBN.getText().isEmpty()&&!imputRokWydania.getText().isEmpty()){
        DataBaseController db = new DataBaseController();
        db.editBook(selectedBook,imputTytul.getText(),imputAutor.getText(),imputISBN.getText(),imputWydawnictwo.getText(),imputRokWydania.getText());
        window.close();
            }
        });
        GridPane.setConstraints(edit,1,5);


        
        
        layout.getChildren().addAll(label1,imputTytul,label2,imputAutor,label3,imputWydawnictwo,label4,imputRokWydania,label5,imputISBN,edit); 
        Scene scena =new Scene(layout,310,260);
        window.setScene(scena);
        window.show();

    }
}