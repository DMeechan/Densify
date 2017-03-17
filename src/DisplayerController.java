import javafx.beans.property.BooleanProperty;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class DisplayerController implements Initializable {
	private BooleanProperty sceneActive;

	public DisplayerController() {

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

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