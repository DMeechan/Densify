import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainController extends Stage {
	private final StackPane pane = new StackPane();

	public MainController() {
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		setTitle("Hello World");
		setScene(new Scene(root, 300, 275));
		show();
		
		System.out.println("test");
		
		
	}
}