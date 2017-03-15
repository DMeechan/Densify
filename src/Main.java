import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception{
        // set up basic window - all activity will happen inside the window object
	    window = new MainController();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
