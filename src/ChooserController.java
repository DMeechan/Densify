import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ChooserController implements Initializable {
	private BooleanProperty sceneActive = new SimpleBooleanProperty();
	private Video selectedVideo;

	@FXML Label lengthText, locationText;
	@FXML TextField nameField;

	public ChooserController() {
		setSceneActive(true);

	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//clickPickVideoButton();
	}

	@FXML public void clickPickVideoButton() {
		String location = "C:/ProgramData/TechSmith/Camtasia Studio/Library 2.0/Animated Title/Out Of Sight.mp4";
		selectedVideo = new Video(location);
		
		selectedVideo.nameProperty().bind(nameField.textProperty());
		
		nameField.setText(selectedVideo.getName());
		lengthText.setText(Integer.toString(selectedVideo.getLength()));
		locationText.setText(selectedVideo.getLocation());

	}

	public void run() {
		if (selectedVideo != null) {
			selectedVideo.nameProperty().unbind();
			setSceneActive(false);

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