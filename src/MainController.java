import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController extends Stage {
	private final StackPane pane = new StackPane();
	private ChooserController chooserController;
	private DisplayerController displayerController;

	public MainController() {


		//Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		setTitle("Hello World");
		//setScene(new Scene(root, 350, 400));
		show();
		System.out.println("test");


	}

	public void loadChooserController() {
		FXMLLoader chooserFXMLLoader = new FXMLLoader(getClass().getResource("Chooser.fxml"));
		//
		//pane.getChildren().remove(node);


		//
		try {
			pane.getChildren().add(chooserFXMLLoader.load());
		} catch (IOException e) {
			new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
		}
		chooserController = chooserFXMLLoader.getController();


		if (chooserController != null) {
			chooserController.sceneActiveProperty().addListener(v -> {
				if (!chooserController.isSceneActive()) {
					loadDisplayerController();
				}
			});
		}
	}

	public void loadDisplayerController() {

		if (displayerController != null) {
			displayerController.sceneActiveProperty().addListener(v -> {
				if (!displayerController.isSceneActive()) {
					loadChooserController();
				}
			});
		}
	}
}