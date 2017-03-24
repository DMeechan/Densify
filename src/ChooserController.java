import javafx.beans.property.BooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ChooserController implements Initializable {
	private BooleanProperty sceneActive;
	private Video selectedVideo;

	@FXML Label lengthText, locationText;
	@FXML TextField nameField;

	public ChooserController() {
		setSceneActive(true);

	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	public void pickVideo() {
		String location = "";
		selectedVideo.nameProperty().bind(nameField.textProperty());
		nameField.setText(selectedVideo.getName());
		lengthText.setText("");
		locationText.setText("");

	}

	public void run() {
		if (selectedVideo != null) {
			setSceneActive(false);
			selectedVideo.nameProperty().unbind();

		} else {
			Main.outputWarning("Please pick a video");
		}
	}

	public boolean isSceneActive() {
		return sceneActive.get();
	}

	public BooleanProperty sceneActiveProperty() {
		return sceneActive;
	}

	public void setSceneActive(boolean sceneActive) {
		this.sceneActive.set(sceneActive);
	}
}