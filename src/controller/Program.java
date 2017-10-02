
package controller;

import View.View;
        import javafx.application.Application;
        import javafx.stage.Stage;

public class Program extends Application {


    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {
        View projektZespolowy = new View();
        projektZespolowy.start(stage);
    }

}
