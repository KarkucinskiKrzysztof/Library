package View;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import model.User;
import controller.DataBaseController;
import javafx.scene.text.Text;


class xxEditUser {


    public static void edit(User selectedUser) {   
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Edycja użytkownika");

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(11,11,11,11));
        layout.setVgap(10);
        layout.setHgap(10);



        Label label1 =new Label("Podaj Imię: ");
        GridPane.setConstraints(label1,0,0);
        TextField imputImie = new TextField(selectedUser.getImie());
        imputImie.setPromptText("Imię");
        GridPane.setConstraints(imputImie,1,0);

        Label label2 =new Label("Podaj Nazwisko: ");
        GridPane.setConstraints(label2,0,1);
        TextField imputNazwisko = new TextField(selectedUser.getNazwisko());
        imputNazwisko.setPromptText("Nazwisko");
        GridPane.setConstraints(imputNazwisko,1,1);

        Label label3 =new Label("Podaj PESEL: ");
        GridPane.setConstraints(label3,0,2);
        TextField imputPesel = new TextField(selectedUser.getPesel());
        imputPesel.setPromptText("PESEL");
        GridPane.setConstraints(imputPesel,1,2);

        Label label4 =new Label("Podaj Miasto: ");
        GridPane.setConstraints(label4,0,3);
        TextField imputMiasto = new TextField(selectedUser.getMiasto());
        imputMiasto.setPromptText("Miasto");
        GridPane.setConstraints(imputMiasto,1,3);

        Label label5 =new Label("Podaj Ulicę: ");
        GridPane.setConstraints(label5,0,4);
        TextField imputUlica = new TextField(selectedUser.getUlica());
        imputUlica.setPromptText("Ulica");
        GridPane.setConstraints(imputUlica,1,4);

        Button edit = new Button("Edytuj Użytkownika");
        
        
        GridPane.setConstraints(edit,1,5);
        edit.setOnAction(e-> 
        { if (!imputImie.getText().isEmpty()&&!imputNazwisko.getText().isEmpty()&&!imputPesel.getText().isEmpty()&&!imputMiasto.getText().isEmpty()&&!imputUlica.getText().isEmpty()){ 
           
            DataBaseController db = new DataBaseController();
            db.editUser(selectedUser,imputImie.getText(),imputNazwisko.getText(),imputPesel.getText(),imputMiasto.getText(),imputUlica.getText());
            window.close();
            
        }});
        
        layout.getChildren().addAll(label1,imputImie,label2,imputNazwisko,label3,imputPesel,label4,imputMiasto,label5,imputUlica,edit); // dodajemy wszystkie elementy do ukladu
        Scene scena =new Scene(layout,310,260);
        window.setScene(scena);
        window.show();
    }
}

      
 